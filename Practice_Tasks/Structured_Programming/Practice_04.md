Introduction to Programming, Practice #4
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

### Problem #1: Dangerous Comparison

Create a variable named `result` of type `double` and initialize it to 0. Then, add 0.1 to it ten times. Compare the final value of `result` with 1.0. If the values are equal, print "Equal"; otherwise, print "Not equal". Be sure to include a newline character ('\n') at the end of the output.

Next, explain the outcome of this comparison. Write a correct solution that compares floating-point values accurately and prints "Equal".

#### Course Grading Notes

Use the `abs` function from `cmath` when comparing the difference with a suitable tolerance.

#### Sample Output

```
Equal

```

### Problem #2: Month Name (if-else-if)

Create a program that determines a month name for a given month number. Use the `if-else-if` construct to solve the task.

#### Sample Input and Output

```
Enter the month number (1-12): 12
December

```

```
Enter the month number (1-12): 1
January

```

```
Enter the month number (1-12): -1
Incorrect month number.

```

```
Enter the month number (1-12): 20
Incorrect month number.

```

### Problem #3: Month Name (switch)

Rewrite the solution to Problem #2 by using the `switch` statement.

#### Sample Input and Output

```
Enter the month number (1-12): 12
December

```

```
Enter the month number (1-12): 1
January

```

```
Enter the month number (1-12): -1
Incorrect month number.

```

```
Enter the month number (1-12): 20
Incorrect month number.

```

### Problem #4: Season Name (switch)

Create a program that determines a season name for a given month number. Use the `switch` construct to solve the task.

#### Sample Input and Output

```
Enter the month number (1-12): 11
Fall

```

```
Enter the month number (1-12): 12
Winter

```

```
Enter the month number (1-12): 8
Summer

```

```
Enter the month number (1-12): 5
Spring

```

```
Enter the month number (1-12): 0
Incorrect month number.

```

### Problem #5: Number of Days

Create a program that determines the number of days in a specific month for a given year.

#### Course Grading Notes

Use a `switch` statement to select the number of days for the month.

#### Sample Input and Output

```
Enter the year: 2000
Enter the month: 2
Number of days: 29

```

```
Enter the year: 1900
Enter the month: 2
Number of days: 28

```

```
Enter the year: 2004
Enter the month: 4
Number of days: 30

```

```
Enter the year: 2004
Enter the month: -5
Incorrect month number.

```

---

## Homework

Read Chapters 3 and 4 of Introduction to C++ Programming, 3rd Edition, by Y. Daniel Liang.

Complete the following programming exercises from Chapters 3 and 4:

  1. Exercise 3.11
  2. Exercise 3.20
  3. Exercise 3.21
  4. Exercise 4.15
  5. Exercise 4.21

### Homework Problem #6: Exercise 3.11

A bank uses the following function to calculate the rate of interest (in percentage) for a particular loan amount.

$$
\begin{array}{ll}
15.0,& \text{if } \$10000 \leq a \leq \$100000 \\
13.5,& \text{if } \$100000 \lt a \leq \$500000 \\
12.5,& \text{if } \$500000 \lt a \leq \$1000000 \\
11.0,& \text{if } \$1000000 \lt a \leq \$5000000 \\
\end{array}
$$

Write a program that prompts the user to enter the amount of the loan and displays the rate of interest. If the amount is less than $10000 or more than $5000000, display a message "Loan cannot be provided."

Use any selection construct to solve the task. The loan amount is guaranteed to be an integer.

#### Course Grading Notes

Use the `fixed` and `setprecision` manipulators from `iomanip` to print the rate of interest with one decimal place.

#### Sample Input and Output

```
Enter the amount of the loan: 10000
The rate of interest: 15.0

```

```
Enter the amount of the loan: 5000000
The rate of interest: 11.0

```

```
Enter the amount of the loan: 510000
The rate of interest: 12.5

```

```
Enter the amount of the loan: 9999
Loan cannot be provided.

```

### Homework Problem #7: Exercise 3.20

Write a program that prompts the user to enter a point $(x, y)$ and checks whether the point is within the rectangle centered at $(0, 0)$ with width 10 and height 5. For example, $(2, 2)$ is inside the rectangle and $(6, 4)$ is outside the rectangle, as shown in the following [Figure](https://i.imgur.com/i2dhV4I.png).

A point is in the rectangle if its horizontal distance to $(0, 0)$ is less than or equal to $10 / 2$ and its vertical distance to $(0, 0)$ is less than or equal to $5.0 / 2$. Test your program to cover all cases.

Use any selection construct to solve the task.

#### Course Grading Notes

Use the `fixed` and `setprecision` manipulators from `iomanip` to print the coordinates with one decimal place.

#### Sample Input and Output

```
Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle

```

```
Enter a point with two coordinates: 6 4
Point (6.0, 4.0) is not in the rectangle

```

### Homework Problem #8: Exercise 3.21

Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.

Use the `switch` construct to solve the task.

#### Course Grading Notes

Use `srand` from `cstdlib` to seed the random number generator with `42` before generating any random numbers. The examples below may use a different seed, so their random results may differ from those of your program.

Generate the card rank first with `rand() % 13`, then the suit with `rand() % 4`. Map ranks 0 through 12 to Ace, 2 through 10, Jack, Queen, and King, respectively. Map suits 0 through 3 to Clubs, Diamonds, Hearts, and Spades, respectively. Do not make extra random-number calls before these two draws.

The reference environment for deterministic random output is Ubuntu 26.04 LTS on x86-64, using the GNU C Library (glibc) 2.43. Follow the exact seed, generation formula, and order of calls specified here. The same seed can produce different sequences on macOS, Windows, or a different C library.

#### Sample Output

```
The card you picked is Jack of Hearts

```

```
The card you picked is Ace of Spades

```

### Homework Problem #9: Exercise 4.15

The international standard letter/number mapping found on the telephone is shown [here](https://i.imgur.com/Zn6UdpC.png).

Write a program that prompts the user to enter a letter and displays its corresponding number. Use the `switch` construct to solve the task. You can use any selection construct for error checking.

#### Sample Input and Output

```
Enter a letter: A
The corresponding number is 2

```

```
Enter a letter: a
The corresponding number is 2

```

```
Enter a letter: +
+ is an invalid input

```

### Homework Problem #10: Exercise 4.21

Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. The first character indicates the major and the second is number character 1, 2, 3, 4, which indicates whether a student is a Freshman, Sophomore, Junior, or Senior. Suppose the following characters are used to denote the majors:

* `M` or `m`: Mathematics
* `C` or `c`: Computer Science
* `I` or `i`: Information Technology

Use the `switch` construct to solve the task. You can use any selection construct for error checking. Use the `tolower` or `toupper` functions from the `cctype` header to minimize the number of checks in your selection constructs.

#### Sample Input and Output

```
Enter two characters: M1
Mathematics Freshman

```

```
Enter two characters: m1
Mathematics Freshman

```

```
Enter two characters: C3
Computer Science Junior

```

```
Enter two characters: T3
Invalid major code

```

```
Enter two characters: M7
Invalid status code

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
* `const`: <https://en.cppreference.com/w/cpp/language/cv.html>
* `constexpr`: <https://en.cppreference.com/w/cpp/language/constexpr.html>
* `math constants`: <https://en.cppreference.com/w/cpp/numeric/constants.html>
* `static_cast`: <https://en.cppreference.com/w/cpp/language/static_cast.html>
* `if`: <https://en.cppreference.com/w/cpp/language/if>
* `operators`: <https://en.cppreference.com/w/cpp/language/operator_precedence>
* `switch`: <https://en.cppreference.com/w/cpp/language/switch>
* `srand`: <https://en.cppreference.com/w/cpp/numeric/random/srand>
* `rand`: <https://en.cppreference.com/w/cpp/numeric/random/rand>
* `cctype`: <https://en.cppreference.com/w/cpp/header/cctype>
