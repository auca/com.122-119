Object-oriented Programming, Practice #4
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoints will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Moodle. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor if you have any questions.

## Practice #4, Problem #1: A Maze Generator

Create an application that generates mazes with a specified number of rooms organized into columns and rows using the [Randomized Depth-First Search](https://en.wikipedia.org/wiki/Maze_generation_algorithm#Randomized_depth-first_search) algorithm (Recursive Backtracker). The maze must be printed to the console as a [Netpbm](https://en.wikipedia.org/wiki/Netpbm) text file of type P1. To create a file, users must redirect the program's output to a file in their terminal. The maze must be stored in a `std::vector` instead of directly using an unsafe C array. The Depth-First Search must be implemented without recursion with the help of a stack data structure. The `std::stack` from the `<stack>` standard library header in the starter code must be replaced with your own stack implementation written in `stack.h`. The `stack` class you develop should represent a dynamic array where elements can be efficiently appended (pushed) and removed (popped) to and from the end (top) of the array managed by the type. The interface of the type should include the following:

```C++
template<class T>
class stack {
public:
    // Type definition for an unsigned integral type, representing the size of the stack.
    using size_type = std::size_t;

    // Default constructor that initializes an empty stack.
    stack();
    // Copy constructor that creates a copy of an existing stack.
    stack(const stack &other);
    // Move constructor that transfers the contents of another stack into this one.
    stack(stack &&other) noexcept;
    // Destructor that cleans up the stack's resources.
    ~stack();

    // Copy assignment operator that copies the contents of another stack into this one.
    stack& operator=(stack other);
    // Move assignment operator that transfers the contents of another stack into this one.
    stack& operator=(stack &&other) noexcept;

    // Returns the number of elements in the stack.
    [[nodiscard]] size_type size() const;
    // Returns true if the stack is empty, false otherwise.
    [[nodiscard]] bool empty() const;

    // Returns the element at the top of the stack without removing it. The stack should not be empty.
    T top() const;
    // Adds an element to the top of the stack.
    void push(const T &value);
    // Removes the top element from the stack. The stack should not be empty.
    void pop();

private:
    // ...
};

```

### Example

`./maze 5 5` should produce:

```
P1
11 11
1 1 1 1 1 1 1 1 1 1 1 
1 0 0 0 1 0 1 0 0 0 1 
1 1 1 0 1 0 1 0 1 0 1 
1 0 0 0 1 0 0 0 1 0 1 
1 0 1 1 1 0 1 1 1 0 1 
1 0 0 0 1 0 0 0 1 0 1 
1 1 1 0 1 1 1 1 1 0 1 
1 0 0 0 1 0 0 0 1 0 1 
1 0 1 1 1 0 1 0 1 0 1 
1 0 0 0 0 0 1 0 0 0 1 
1 1 1 1 1 1 1 1 1 1 1 

```

`./maze 8 8` should produce:

```
P1
17 17
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
1 0 0 0 1 0 0 0 1 0 0 0 0 0 0 0 1 
1 1 1 0 1 0 1 0 1 0 1 1 1 1 1 0 1 
1 0 0 0 1 0 1 0 0 0 0 0 1 0 0 0 1 
1 0 1 1 1 1 1 1 1 1 1 1 1 0 1 0 1 
1 0 0 0 1 0 0 0 1 0 0 0 1 0 1 0 1 
1 1 1 0 1 0 1 0 1 0 1 0 1 0 1 1 1 
1 0 0 0 1 0 1 0 0 0 1 0 1 0 0 0 1 
1 0 1 1 1 0 1 1 1 1 1 0 1 1 1 0 1 
1 0 0 0 1 0 1 0 0 0 1 0 0 0 0 0 1 
1 1 1 0 1 0 1 0 1 0 1 1 1 1 1 0 1 
1 0 0 0 1 0 1 0 1 0 0 0 0 0 1 0 1 
1 0 1 1 1 0 1 0 1 1 1 1 1 0 1 0 1 
1 0 0 0 1 0 1 0 1 0 0 0 1 0 1 0 1 
1 1 1 0 1 0 1 0 1 0 1 0 1 1 1 0 1 
1 0 0 0 0 0 1 0 0 0 1 0 0 0 0 0 1 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 

```

By redirecting the output of your program into a file with the command `./maze 16 16 > maze.pbm`, you will create an image file named `maze.pbm` that can be opened with an image viewer. The macOS Preview application is capable of opening PBM files. On Windows, you must install a program like [IrfanView](https://www.irfanview.com) to view the file. Please note that the file will have low resolution. You can zoom in to better see the maze details. Disabling scaling filters in your image viewer is a good idea to view the maze as a grid of pixels.

![maze.pbm](https://i.imgur.com/J5Afq5f.png)

### Error Handling

Ensure the command-line arguments are valid. If the number of arguments does not equal 3 (name of the program, width, height), print the following message to the standard error stream, and exit the program with a non-zero status code:

```
Error: Invalid number of arguments.

Usage:
maze <number of rooms on each row> <number of rooms on each column>

```

If the number of rooms per row or column is less than 1 or exceeds 16384, the program should display the following error message on the standard error stream and terminate with a non-zero status code:

```
Error: The width of the maze must be greater than 0 and can not be greater than 16384.

```

or

```
Error: The height of the maze must be greater than 0 and can not be greater than 16384.

```

If the number of rooms is not an integer, print the following message to the standard error stream and then exit the program with a non-zero status code:

```
Error: The width of the maze is not a valid number.

```

or

```
Error: The height of the maze is not a valid number.

```

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 9, 10, 11, 12, 14, 16

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, Readme.md)
├── stack.h
└── main.cpp
```

If the files with assignments are named incorrectly, you will be penalized.

## Documentation

* `class`: <https://en.cppreference.com/w/cpp/language/class>
* `constructor`: <https://en.cppreference.com/w/cpp/language/constructor>
* `this`: <https://en.cppreference.com/w/cpp/language/this>
* `access-specifier`: <https://en.cppreference.com/w/cpp/language/access>
* `static`: <https://en.cppreference.com/w/cpp/language/static>
* `throw`: <https://en.cppreference.com/w/cpp/language/throw>
* `try-block`: <https://en.cppreference.com/w/cpp/language/try_catch>
* `stdexcept`: <https://en.cppreference.com/w/cpp/header/stdexcept>
* `operator overloading`: <https://en.cppreference.com/w/cpp/language/operators>
* `friend`: <https://en.cppreference.com/w/cpp/language/friend>
* `std::stack`: <https://en.cppreference.com/w/cpp/container/stack>
* `std::vector`: <https://en.cppreference.com/w/cpp/container/vector>
* `destructors`: <https://en.cppreference.com/w/cpp/language/destructor>
* `copy constructor`: <https://en.cppreference.com/w/cpp/language/copy_constructor>
* `move constructor`: <https://en.cppreference.com/w/cpp/language/move_constructor>
* `copy assignment operator`: <https://en.cppreference.com/w/cpp/language/copy_assignment>
* `move assignment operator`: <https://en.cppreference.com/w/cpp/language/move_assignment>
* `rule of three/five/zero`: <https://en.cppreference.com/w/cpp/language/rule_of_three>
* `template`: <https://en.cppreference.com/w/cpp/language/templates>
