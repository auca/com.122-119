Object-oriented Programming, Practice #3
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoints will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Moodle. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor if you have any questions.

## Practice #3, Problem #1: A Calculator of Rational Numbers

Create an application that can help users perform arithmetic operations (addition, subtraction, multiplication, division, and comparisons) with rational numbers. Users may enter the first fraction, an operator (`+`, `-`, `*`, `/`, `<`, `>`, `=`, `!=`, `<=`, `>=`), and the second fraction. The application should calculate the final result and display it on the screen. If the input is invalid, the application should display an appropriate error message and continue working. User should be able to stop the application by issuing the [EOF](https://en.wikipedia.org/wiki/End-of-file) key sequence.

In this program you have to develop a class `rational` to represent rational numbers. The interface of the type should have the following:

```C++
class rational {
    // Default constructor that initializes the rational number to 1/1.
    rational();

    // Constructor that initializes the rational number with the specified numerator and an optional denominator
    // (defaults to 1 if not provided).
    rational(int num, int den = 1);

    // Constructor that initializes the rational number from a string in the format 'numerator/denominator'.
    rational(const std::string &str);

    // Returns the numerator of the rational number.
    int get_num() const;

    // Returns the denominator of the rational number.
    int get_den() const;

    // Adds the specified rational number to this rational number.
    rational& operator+=(const rational &other);

    // Subtracts the specified rational number from this rational number.
    rational& operator-=(const rational &other);

    // Multiplies this rational number by the specified rational number.
    rational& operator*=(const rational &other);

    // Divides this rational number by the specified rational number.
    rational& operator/=(const rational &other);

    // Checks if this rational number is equal to the specified rational number.
    bool operator==(const rational &other) const;

    // Checks if this rational number is not equal to the specified rational number.
    bool operator!=(const rational &other) const;

    // Checks if this rational number is less than the specified rational number.
    bool operator<(const rational &other) const;

    // Checks if this rational number is greater than the specified rational number.
    bool operator>(const rational &other) const;

    // Checks if this rational number is less than or equal to the specified rational number.
    bool operator<=(const rational &other) const;

    // Checks if this rational number is greater than or equal to the specified rational number.
    bool operator>=(const rational &other) const;

    // Converts the rational number to a string in the format 'numerator/denominator'.
    operator std::string() const;

    // Allows extraction of rational numbers from input streams in the format 'numerator/denominator' by giving acces to private fields.
    friend std::istream& operator>>(std::istream &in, rational &rat);

private:
    // ...
};

// Adds two rational numbers. Returns a new rational number that is the sum of 'left' and 'right'.
rational operator+(rational left, const rational &right);

// Subtracts one rational number from another. Returns the result as a new rational number.
rational operator-(rational left, const rational &right);

// Multiplies two rational numbers. Returns the product as a new rational number.
rational operator*(rational left, const rational &right);

// Divides one rational number by another. Returns the quotient as a new rational number.
rational operator/(rational left, const rational &right);

// Inserts the string representation of the rational number into the output stream.
std::ostream& operator<<(std::ostream &out, const rational &rational);

// Extracts a rational number from the input stream expecting the format 'numerator/denominator'.
std::istream& operator>>(std::istream &in, rational &rational);
```

Objects of class `rational` must be always in reduced (simplified) form. Keep the sign of the number in its numerator. Develop inner (private) member functions to reduce rationals.

### Example

```
Calculator of Rational Numbers
==============================
Press Ctrl-Z/D to exit

First Rational: 1/2
Operator: +
Second Rational: 2/3
Result: 1/2 + 2/3: 7/6

First Rational: 1/2
Operator: -
Second Rational: 2/3
Result: 1/2 - 2/3: -1/6

First Rational: 1/2
Operator: *
Second Rational: 2/3
Result: 1/2 * 2/3: 1/3

First Rational: 1/2
Operator: /
Second Rational: 2/3
Result: 1/2 / 2/3: 3/4

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

### Error Handling

Check for incorrect input. There should be one central location in `main` to handle errors. This central location is for formatting and printing errors to the screen, which helps avoid code repetition. Use the `std::runtime_error` class from the `stdexcept` header where appropriate (do not create your own exception classes yet). Your program should check for at least the following error conditions:

1. No input (e.g., an empty line with or without whitespaces was provided).

    The message that you must print should be `Error: No input.` for operands and `Error: No operator.` for operators.

2. Invalid input (e.g., text instead of a number, invalid operator, or multiple arguments provided).

    You must print `Error: Can't parse '<invalid input from the user>' as input.` for operands and `Error: '<invalid input from the user>' is not a valid operator.` for operators.

3. Zero in a denominator.

    Display `Error: The denominator can't be equal to zero.`

All error conditions listed above must be recoverable; the program must not stop or crash. Additionally, all errors must be printed to the STDERR stream.

### Example

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

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 9, 10, 11, 14, 16

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, Readme.md)
├── rational.h
├── rational.cpp
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
* `runtime_error`: <https://en.cppreference.com/w/cpp/error/runtime_error>
* `operator overloading`: <https://en.cppreference.com/w/cpp/language/operators>
