Object-oriented Programming, Practice #3
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

### Problem #1: A Calculator of Rational Numbers

#### Developing Numeric Data Types

Create an application that can help users perform arithmetic operations (addition, subtraction, multiplication, division, and comparisons) with rational numbers. Users may enter the first fraction, an operator (`+`, `-`, `*`, `/`, `<`, `>`, `=`, `!=`, `<=`, `>=`), and the second fraction. The application should calculate the final result and display it on the screen. If the input is invalid, the application should display an appropriate error message and continue working. User should be able to stop the application by issuing the [EOF](https://en.wikipedia.org/wiki/End-of-file) key sequence.

In this program you have to develop a class `rational` to represent rational numbers. The interface of the type should have the following:

```C++
class rational
{
public:
    // Default constructor that initializes the rational number to 1/1.
    rational();
    // Constructor that initializes the rational number with the specified numerator and an optional denominator (defaults to 1 if not provided).
    rational(long long num, long long den = 1);
    // Constructor that initializes the rational number from a string in the format 'numerator/denominator'.
    rational(const std::string &str);

    // Returns the numerator of the rational number.
    long long get_num() const;
    // Returns the denominator of the rational number.
    long long get_den() const;

    // Adds the specified rational number to this rational number.
    rational& operator+=(const rational &other);
    // Subtracts the specified rational number from this rational number.
    rational& operator-=(const rational &other);
    // Multiplies this rational number by the specified rational number.
    rational& operator*=(const rational &other);
    // Divides this rational number by the specified rational number.
    rational& operator/=(const rational &other);

    // Checks whether this rational number is equal to the specified rational number.
    bool operator==(const rational &other) const;
    // Checks whether this rational number is not equal to the specified rational number.
    bool operator!=(const rational &other) const;
    // Checks whether this rational number is less than the specified rational number.
    bool operator<(const rational &other) const;
    // Checks whether this rational number is greater than the specified rational number.
    bool operator>(const rational &other) const;
    // Checks whether this rational number is less than or equal to the specified rational number.
    bool operator<=(const rational &other) const;
    // Checks whether this rational number is greater than or equal to the specified rational number.
    bool operator>=(const rational &other) const;

    // Converts the rational number to a string in the format 'numerator/denominator'.
    operator std::string() const;
    // Allows extraction of rational numbers from input streams in the format 'numerator/denominator' by providing access to private fields.
    friend std::istream& operator>>(std::istream &in, rational &num);

private:
    // ...
};

// Adds two rational numbers and returns a new rational number that is the sum of 'left' and 'right'.
rational operator+(rational left, const rational &right);
// Subtracts one rational number from another and returns the result as a new rational number.
rational operator-(rational left, const rational &right);
// Multiplies two rational numbers and returns the product as a new rational number.
rational operator*(rational left, const rational &right);
// Divides one rational number by another and returns the quotient as a new rational number.
rational operator/(rational left, const rational &right);
// Inserts the string representation of the rational number into the output stream.
std::ostream& operator<<(std::ostream &out, const rational &num);
// Extracts a rational number from the input stream, expecting the format 'numerator/denominator'.
std::istream& operator>>(std::istream &in, rational &num);

```

Objects of class `rational` must be always in reduced (simplified) form. Keep the sign of the number in its numerator. Develop inner (private) member functions to reduce rationals.

##### Example

```
Calculator of Rational Numbers
==============================
Press Ctrl-Z/D to exit

First Rational: 1/2
Operator: +
Second Rational: 2/3
Result: 1/2 + 2/3 = 7/6

First Rational: 1/2
Operator: -
Second Rational: 2/3
Result: 1/2 - 2/3 = -1/6

First Rational: 1/2
Operator: *
Second Rational: 2/3
Result: 1/2 * 2/3 = 1/3

First Rational: 1/2
Operator: /
Second Rational: 2/3
Result: 1/2 / 2/3 = 3/4

First Rational: 1/2
Operator: >
Second Rational: 2/3
Result: 1/2 > 2/3: false

First Rational: 1/2
Operator: <
Second Rational: 2/3
Result: 1/2 > 2/3: true

First Rational: 1/2
Operator: >=
Second Rational: 2/3
Result: 1/2 > 2/3: false

First Rational: 1/2
Operator: <=
Second Rational: 2/3
Result: 1/2 > 2/3: true

First Rational: 1/2
Operator: =
Second Rational: 2/3
Result: 1/2 > 2/3: false

First Rational: 1/2
Operator: !=
Second Rational: 2/3
Result: 1/2 > 2/3: true

First Rational: ^Z

```

#### Error Handling

Check for incorrect input. There should be one central location in `main` to handle errors. This central location is for formatting and printing errors to the screen, which helps avoid code repetition. Use the `std::invalid_argument` class from the `stdexcept` header where appropriate (do not create your own exception classes yet). Your program should check for at least the following error conditions:

1. No input (e.g., an empty line with or without whitespaces was provided).

    The message that you must print should be `Error: No input.` for operands and `Error: No operator.` for operators.

2. Invalid input (e.g., text instead of a number, invalid operator, or multiple arguments provided).

    You must print `Error: Can't parse '<invalid input from the user>' as input.` for operands and `Error: '<invalid input from the user>' is not a valid operator.` for operators.

3. Zero in a denominator.

    Display `Error: The denominator can't be equal to zero.`

All error conditions listed above must be recoverable; the program must not stop or crash. Additionally, all errors must be printed to the STDERR stream.

##### Example

Please, note that some empty lines in the example below contain invisible whitespace and tab sequences of characters.

```
Calculator of Rational Numbers
==============================
Press Ctrl-Z/D to exit

First Rational: 
Error: No input.

First Rational:  
Error: No input.

First Rational:  
Error: No input.

First Rational:      
Error: No input.

First Rational:   
Error: No input.

First Rational: one
Error: Can't parse 'one' as input.

First Rational: 1 2 3
Error: Can't parse '1 2 3' as input.

First Rational: one/2
Error: Can't parse 'one/2' as input.

First Rational: 1/two
Error: Can't parse '1/two' as input.

First Rational: 1/0
Error: The denominator can't be equal to zero.

First Rational: 1/2
Operator: 
Error: No operator.

First Rational: 1/2
Operator:  
Error: No operator.

First Rational: 1/2
Operator:    
Error: No operator.

First Rational: 1/2
Operator:    
Error: No operator.

First Rational: 1/2
Operator:     
Error: No operator.

First Rational: 1/2
Operator: 42
Error: '42' is not a valid operator.

First Rational: 1/2
Operator: + 1 2 3
Error: '+ 1 2 3' is not a valid operator.

First Rational: 1/2
Operator: +
Second Rational: 
Error: No input.

First Rational: 1/2
Operator: +
Second Rational:  
Error: No input.

First Rational: 1/2
Operator: +
Second Rational:  
Error: No input.

First Rational: 1/2
Operator: +
Second Rational:      
Error: No input.

First Rational: 1/2
Operator: +
Second Rational:   
Error: No input.

First Rational: 1/2
Operator: +
Second Rational: 1 2 3
Error: Can't parse '1 2 3' as input.

First Rational: 1/2
Operator: +
Second Rational: one
Error: Can't parse 'one' as input.

First Rational: 1/2
Operator: +
Second Rational: one/2
Error: Can't parse 'one/2' as input.

First Rational: 1/2
Operator: +
Second Rational: 1/two
Error: Can't parse '1/two' as input.

First Rational: 1/2
Operator: +
Second Rational: 1/0
Error: The denominator can't be equal to zero.

First Rational: ^Z

```

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 9, 10, 11, 14, 16

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, .clang-format, CMakeLists.txt, Readme.md)
├── calculator.cpp
├── rational.h
└── rational.cpp
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
