Object-oriented Programming, Practice #4
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

---

## Important Notes

The checkpoint will be graded based on your programs' output, the correctness of your repository structure, and the style of your code. You may be penalized and receive a lower grade if your program's output does not exactly match the expected output (wrong letters, extra spaces or newlines, or an incorrectly computed result). Please check your code and output before submitting your work to GitHub or Moodle. Ensure your program's output matches the specified output on this page. Print a `\n` newline after the final line of your program's output. Format real numbers precisely to the number of decimal places specified in the sample output.

Ensure your code style is consistent: indent code properly, separate logical blocks with a blank line, and use variable names that follow a consistent naming style and concisely describe the data they store. The code style for all files must conform to the configuration in `.clang-format`. By default, `.clang-format` is set to the WebKit style; see the [WebKit Code Style Guidelines](https://webkit.org/code-style-guidelines) for details. If you prefer a different style, update `.clang-format` accordingly. Ensure that your source files adhere to the selected style. If you receive the error `The file is not formatted consistently with the '.clang-format' configuration.` from the grader, it means you failed to follow the selected style in the `.clang-format` file. Format your source code manually or use CLion's autoformatting tools. However, we recommend starting with manual formatting to build good programming habits.

Your files and directories must be named according to the requirements outlined at the bottom of this page. Moreover, your repository must not contain extraneous files or unrelated code, especially within the folder designated for lab tasks.

If you are instructed to use a particular function, you must base your solution on that function, even if a better solution exists without it. Use only language facilities that have been discussed during class.

Remember that this requirements document, the grader file, and any requirements mentioned informally by the instructors during lectures or labs are all considered official and must be followed. Failure to do so may result in lost points. Do not assume that the document below is the only set of rules to follow.

To ensure you are aware of all requirements, attend classes regularly and actively engage with your instructors. If you are unsure about the correct approach, visit office hours to clarify expectations and avoid losing points. If you cannot attend office hours, do not hesitate to reach out to your instructors through other means, such as email.

---

## Lab Task

Complete the following programming exercise with your lab instructor or on your own.

### Problem #1: A Stream Editor

#### Building a String Class

Create a simplified clone of the Unix [`sed`](https://en.wikipedia.org/wiki/Sed) (stream editor) utility. The program must read text line by line from standard input, apply a substitution command given as a command-line argument, and write the result to standard output.

The program must support the following substitution syntax:

```
./sed 's/pattern/replacement/'
./sed 's/pattern/replacement/g'
```

Without the `g` flag, only the first occurrence of `pattern` on each line is replaced with `replacement`. With the `g` flag, all occurrences on each line are replaced.

To implement the core text-processing logic, you must create a custom string class in `string.h`. The `std::string` from the `<string>` standard library header must not be used. Your custom string class must provide its own `getline` function for reading lines from standard input. All string handling, including I/O, find-and-replace logic, and text manipulation, must use your custom string class. Note that the header file is intentionally named `string.h` (the same as the C standard library header). This works correctly because `#include "string.h"` with double quotes resolves to the local file, while `#include <string.h>` with angle brackets resolves to the system header. Your class must live in the `my` namespace to avoid any naming conflicts.

Your `basic_string` class should be a class template, parameterized on the character type `CharT`. This allows the same implementation to work with `char`, `char16_t`, or other character types. You must provide the following type aliases after the class definition:

```C++
using string = basic_string<char>;
using u16string = basic_string<char16_t>;
```

The class must manage a dynamically allocated array of `CharT` on the heap. The buffer should start with an initial capacity (e.g., 8) and grow by doubling when more space is needed (amortized _O(1)_ appending). The class must correctly implement the [Rule of Five](https://en.cppreference.com/w/cpp/language/rule_of_three): a destructor, a copy constructor, a move constructor, a unified copy/move assignment operator using the copy-and-swap idiom, and a separate move assignment operator.

The interface of this class should include the following:

```C++
namespace my
{
    template<class CharT>
    class basic_string
    {
    public:
        // Type definition for an unsigned integral type, representing the size of the string.
        using size_type = std::size_t;
        // A constant representing an invalid or "not found" position.
        static constexpr size_type npos = static_cast<size_type>(-1);

        // Default constructor that initializes an empty string.
        basic_string();
        // Constructor from a C-string.
        basic_string(const CharT* str);
        // Copy constructor that creates a copy of an existing string.
        basic_string(const basic_string& other);
        // Move constructor that transfers the contents of another string into this one.
        basic_string(basic_string&& other) noexcept;
        // Destructor that cleans up the string's resources.
        ~basic_string();

        // Swap function for the copy-and-swap idiom.
        friend void swap(basic_string& first, basic_string& second) noexcept;
        // Copy assignment operator using the copy-and-swap idiom.
        basic_string& operator=(basic_string other);
        // Move assignment operator that transfers the contents of another string into this one.
        basic_string& operator=(basic_string&& other) noexcept;

        // Returns a reference to the character at the given index.
        CharT& operator[](size_type index);
        const CharT& operator[](size_type index) const;
        // Returns a pointer to the underlying null-terminated character array.
        const CharT* c_str() const;

        // Returns the number of characters in the string.
        [[nodiscard]] size_type size() const;
        // Returns true if the string is empty, false otherwise.
        [[nodiscard]] bool empty() const;
        // Clears the contents of the string.
        void clear();
        // Appends a single character to the end of the string.
        void push_back(CharT ch);

        // Appends the contents of another string to this one.
        basic_string& operator+=(const basic_string& other);
        // Finds the first occurrence of a substring starting at position pos. Returns npos if not found.
        size_type find(const basic_string& str, size_type pos = 0) const;
        // Returns a new string that is a substring starting at position pos with at most count characters.
        basic_string substr(size_type pos = 0, size_type count = npos) const;

        // Equality and inequality comparison operators.
        bool operator==(const basic_string& other) const;
        bool operator!=(const basic_string& other) const;

        // Stream output operator.
        friend std::ostream& operator<<(std::ostream& os, const basic_string& str);
        // Stream input operator (reads a whitespace-delimited token).
        friend std::istream& operator>>(std::istream& is, basic_string& str);
        // Reads a line from the input stream into the string.
        friend std::istream& getline(std::istream& is, basic_string& str);

    private:
        // ...
    };

    using string = basic_string<char>;
    using u16string = basic_string<char16_t>;
}
```

The `getline` friend function reads lines from standard input into your custom string, eliminating the need for `std::string` entirely. The core find-and-replace algorithm composes `find()`, `substr()`, and `operator+=()` as follows: search for the pattern in the line, extract the parts before and after the match using `substr()`, and build the result by appending the prefix, the replacement, and the suffix using `operator+=()`. For the global (`g`) variant, repeat this process for all non-overlapping occurrences.

##### Example

`echo "hello world" | ./sed 's/world/planet/'` should produce:

```
hello planet
```

`echo "to be or not to be" | ./sed 's/be/exist/g'` should produce:

```
to exist or not to exist
```

Given an input file `input.txt` containing:

```
the cat sat on the mat
the dog sat on the log
```

`./sed 's/the/a/g' < input.txt` should produce:

```
a cat sat on a mat
a dog sat on a log
```

#### Error Handling

Ensure that the command-line arguments are valid. If the number of arguments does not equal 2 (the program name and the command), print the following message to the standard error stream, then exit the program with a non-zero status code:

```
Error: Invalid number of arguments.

Usage:
	sed 's/pattern/replacement/[g]'

```

If the command does not start with `s`, print the following message to the standard error stream, then exit the program with a non-zero status code:

```
Error: Unknown command 'X'.

```

where `X` is the first character of the command.

If the substitution command has incorrect syntax (e.g., missing delimiters), print the following message to the standard error stream, then exit the program with a non-zero status code:

```
Error: Invalid substitution syntax in '<command>'.

```

where `<command>` is the full command string.

If the search pattern is empty (e.g., `s//replacement/`), print the following message to the standard error stream, then exit the program with a non-zero status code:

```
Error: The search pattern must not be empty.

```

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 9, 10, 11, 12, 14, 16

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, .clang-format, CMakeLists.txt, Readme.md)
├── sed.cpp
└── string.h
```

If the files with assignments are named incorrectly, you will be penalized.

---

## Documentation

* `class`: <https://en.cppreference.com/w/cpp/language/class>
* `constructor`: <https://en.cppreference.com/w/cpp/language/constructor>
* `this`: <https://en.cppreference.com/w/cpp/language/this>
* `access-specifier`: <https://en.cppreference.com/w/cpp/language/access>
* `static`: <https://en.cppreference.com/w/cpp/language/static>
* `throw`: <https://en.cppreference.com/w/cpp/language/throw>
* `try-block`: <https://en.cppreference.com/w/cpp/language/try>
* `stdexcept`: <https://en.cppreference.com/w/cpp/header/stdexcept>
* `invalid_argument`: <https://en.cppreference.com/w/cpp/error/invalid_argument>
* `operator overloading`: <https://en.cppreference.com/w/cpp/language/operators>
* `friend`: <https://en.cppreference.com/w/cpp/language/friend>
* `std::string`: <https://en.cppreference.com/w/cpp/string/basic_string>
* `destructors`: <https://en.cppreference.com/w/cpp/language/destructor>
* `copy constructor`: <https://en.cppreference.com/w/cpp/language/copy_constructor>
* `move constructor`: <https://en.cppreference.com/w/cpp/language/move_constructor>
* `copy assignment operator`: <https://en.cppreference.com/w/cpp/language/as_operator.html>
* `move assignment operator`: <https://en.cppreference.com/w/cpp/language/move_assignment>
* `rule of three/five/zero`: <https://en.cppreference.com/w/cpp/language/rule_of_three>
* `template`: <https://en.cppreference.com/w/cpp/language/templates>
