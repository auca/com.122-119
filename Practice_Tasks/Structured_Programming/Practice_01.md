Introduction to Programming, Practice #1
========================================

## Developer Tools

* [Visual Studio Code](https://code.visualstudio.com/download)
* [Git SCM](https://git-scm.com/downloads)

---

## Important Notes

The checkpoint will be graded based on your programs' output, the correctness of your repository structure, and the style of your code. You may receive a lower grade if your program's output does not exactly match the expected output (incorrect characters, extra spaces or newlines, or an incorrectly computed result). Please check your code and output before submitting your work to GitHub or Moodle. Ensure your program's output matches the specified output on this page. End the final line of your own program's output with a newline (`\n`). For textbook examples assigned for retyping, preserve the book's printed output unless a course grading note explicitly specifies a difference. Format real numbers using the number of decimal places specified in the sample output.

Ensure your code style is consistent: indent code properly, separate logical blocks with a blank line, and use variable names that follow a consistent naming style and concisely describe the data they store. The code style for all files must conform to the configuration in `.clang-format`. By default, `.clang-format` is set to the WebKit style; see the [WebKit Code Style Guidelines](https://webkit.org/code-style-guidelines) for details. If you prefer a different style, update `.clang-format` accordingly. Ensure that your source files adhere to the selected style. If you receive the error `The file is not formatted consistently with the '.clang-format' configuration.` from the grader, it means your code does not match the style specified in `.clang-format`. Format your source code manually or use VS Code's `Format Document` command (`Shift+Alt+F` on Windows, `Shift+Option+F` on macOS, `Ctrl+Shift+I` on GNU/Linux). However, we recommend starting with manual formatting to build good programming habits.

Use the file and directory names shown in the Expected Repository Structure section, and keep your repository free of unrelated files and code. When a task requires a particular function, base your solution on that function, even if you know a better approach. Your programs must also run without memory errors or undefined behavior; any such error detected by the grader will cause the automated checks to fail.

If anything in the requirements is unclear or you need help with a task, contact your practice instructor.

---

## Lab Tasks

Complete the following programming exercises with your lab instructor or on your own.

### Problem #1: Hello, World

Write a program that outputs the message `hello, world` to the screen.

#### Sample Output

```
hello, world

```

### Problem #2: A Message in a Rectangle

Create a program that prints the message `hello, world` surrounded by asterisks.

#### Sample Output

```
**************
*hello, world*
**************

```

### Problem #3: What Is Your Name?

Write a program that reads a user's full name from the console, then constructs and prints a greeting message for that user.

#### Sample Input and Output

```
What is your name? John Doe
Hello, John Doe!

```

### Problem #4: Operations on Two Integers

Create a program that reads two integers from the user and calculates their sum, difference, product, quotient, and remainder.

#### Course Grading Notes

The second input is guaranteed to be nonzero. Inputs and arithmetic results fit in the signed 32-bit integer range.

#### Sample Input and Output

```
Enter the first integer: 5
Enter the second integer: 2
5 + 2 = 7
5 - 2 = 3
5 * 2 = 10
5 / 2 = 2
5 % 2 = 1

```

### Problem #5: Operations on Two Real Numbers

Create a program that reads two real numbers from the user and computes their sum, difference, product, quotient, and remainder. Use the `fmod` function from the `cmath` header to find the remainder.

#### Course Grading Notes

The second input is guaranteed to be nonzero.

#### Sample Input and Output

```
Enter the first double: 5.1
Enter the second double: 2.6
5.1 + 2.6 = 7.7
5.1 - 2.6 = 2.5
5.1 * 2.6 = 13.26
5.1 / 2.6 = 1.96154
5.1 % 2.6 = 2.5

```

---

## Homework

Read Chapter 1 of Introduction to C++ Programming, 3rd Edition, by Y. Daniel Liang.

Complete the following programming exercises from Chapter 1:

  1. Exercise 1.3
  2. Exercise 1.6
  3. Exercise 1.7
  4. Exercise 1.4
  5. Exercise 1.11

### Homework Problem #6: Exercise 1.3

Write a program that displays the pattern shown in the sample below. The output format here differs from the one in the book. Your output must match the sample below exactly, down to the last character. Do not use loops or selection constructs yet.

#### Sample Output

```
*        *********
***        *******
*****        *****
*******        ***
*********        *

```

### Homework Problem #7: Exercise 1.6

Write a program that displays the sum of the first ten odd numbers.

$1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19$

Note that you must create an integer variable `sum` to store the final result. Your program must calculate the expression; do not hardcode the answer. Do not use loops or selection constructs yet.

#### Sample Output

```
100

```

### Homework Problem #8: Exercise 1.7

Write a program that uses the following two formulas to approximate the value of $\pi$:

$\pi = \sqrt{6 \times (1 + \frac{1}{4} + \frac{1}{9} + \frac{1}{16} + \frac{1}{25})}$

$\pi = \sqrt{6 \times (1 + \frac{1}{4} + \frac{1}{9} + \frac{1}{16} + \frac{1}{25} + \frac{1}{36})}$

Try to reuse intermediate results from the first expression in the second one.

Note that you must create `double` variables `pi1` and `pi2` to store the final results. Your program must evaluate the expressions; do not hardcode the answers. You must use the `sqrt` function from the `cmath` header to find the square root. Do not use loops or selection constructs yet.

#### Sample Output

```
2.96339
2.99138

```

### Homework Problem #9: Exercise 1.4

Write a program that calculates the value of a variable named `p`.

Note that you must create one or more variables to store the values in each row. Try to minimize the number of variables by reusing them. Your program must calculate the values before formatting and displaying them; do not hardcode the answers. You must use the `setw` manipulator from the `iomanip` header to format the output. The first column must be aligned to the left, and the other two columns must be aligned to the right using the `left` and `right` manipulators. The output format here differs from the one in the book. You must follow the output format specified below precisely. Do not use loops or selection constructs yet.

#### Course Grading Notes

Use field widths of 2, 9, and 9 for the three columns, respectively. Left-align the first column and right-align the other two columns, including the header row.

#### Sample Output

```
p       p*5     p*10
5        25       50
10       50      100
25      125      250
50      250      500

```

### Homework Problem #10: Exercise 1.11

The U.S. Census Bureau projects the population based on the following assumptions:

* One birth every 7 seconds
* One death every 13 seconds
* One new immigrant arriving every 45 seconds

Write a program to display the population for each of the next five years. Assume that the current population is 312,032,486, and that one year has 365 days.

Note that you must create variables to store intermediate or final results. Your program must evaluate the expressions; do not hardcode the answers. Use `double` for calculations. At the end, round the answer using the `round` function from the `cmath` header. You will need to figure out on your own how to format the output correctly. Manipulators such as `fixed` and `setprecision` from `iomanip` may help. Do not use loops or selection constructs yet.

#### Sample Output

```
314812583
317592679
320372776
323152873
325932970

```

---

## Expected Repository Structure

Upon completion of all assignments, your repository should have the following solution files. This is an abbreviated view; keep the existing project configuration and grader files as well:

```
. (.idea, .vscode, .gitignore, .clang-format, CMakeLists.txt, Readme.md)
├── problem01.cpp
├── problem02.cpp
├── problem03.cpp
├── problem04.cpp
├── problem05.cpp
├── problem06.cpp
├── problem07.cpp
├── problem08.cpp
├── problem09.cpp
└── problem10.cpp
```

If your solution files are named incorrectly, you will be penalized.

---

## Documentation

### C++

* `iostream`: <https://en.cppreference.com/w/cpp/header/iostream>
* `iomanip`: <https://en.cppreference.com/w/cpp/header/iomanip>
* `cmath`: <https://en.cppreference.com/w/cpp/header/cmath>
