Introduction to Programming, Practice #2
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

---

## Important Notes

The checkpoint will be graded based on your programs' output, the correctness of your repository structure, and the style of your code. You may be penalized and receive a lower grade if your program's output does not exactly match the expected output (wrong letters, extra spaces or newlines, or an incorrectly computed result). Please check your code and output before submitting your work to GitHub or Moodle. Ensure your program's output matches the specified output on this page. Print a `\n` newline after the final line of your program's output. Format real numbers precisely to the number of decimal places specified in the sample output.

Ensure your code style is consistent: indent code properly, separate logical blocks with a blank line, and use variable names that follow a consistent naming style and concisely describe the data they store. The code style for all files must conform to the configuration in `.clang-format`. By default, `.clang-format` is set to the WebKit style; see the [WebKit Code Style Guidelines](https://webkit.org/code-style-guidelines) for details. If you prefer a different style, update `.clang-format` accordingly. Ensure that your source files adhere to the selected style. If you receive the error `The file is not formatted consistently with the '.clang-format' configuration.` from the grader, it means you failed to follow the selected style in the `.clang-format` file. Format your source code manually or use CLion's autoformatting tools. However, we recommend starting with manual formatting to build good programming habits.

Your files and directories must be named according to the requirements outlined at the bottom of this page. Moreover, your repository must not contain extraneous files or unrelated code, especially within the folder designated for lab tasks.

If you are instructed to use a particular function, you must base your solution on that function, even if a better solution exists without it.

Do not hesitate to contact your practice instructor if you have any questions.

---

## Lab Tasks

Complete the following programming exercises with your lab instructor or on your own.

### Problem #1: Swap Two Numbers

Declare two integer variables, `a` and `b`, and initialize them with values provided by the user. Then, print both variables, swap their values, and print the variables again.

#### Sample Input and Output

```
Enter the first value: 2
Enter the second value: 3
Before swapping: a = 2; b = 3;
After swapping: a = 3; b = 2;

```

### Problem #2: Swap Two Numbers Without Temporary Variables

Declare two integer variables, `a` and `b`, and initialize them with values provided by the user. Then, print both variables, swap their values, and print the variables again. In this task, it is prohibited to use temporary variables.

#### Sample Input and Output

```
Enter the first value: 2
Enter the second value: 3
Before swapping: a = 2; b = 3;
After swapping: a = 3; b = 2;

```

### Problem #3: Sum of Digits

Read a four-digit integer from standard input and calculate the sum of all its digits. Use the `abs` function from `cstdlib` to find the absolute value of the integer.

#### Sample Input and Output

```
Enter a four-digit integer: 1237
The sum of all digits is 13.

```

### Problem #4: Inches to Centimeters Converter

Create an application that converts inches to centimeters. Note that one inch equals 2.54 centimeters. Use a compile-time constant with the `constexpr` keyword to represent this conversion factor. Also, use the `fixed` and `setprecision` manipulators from `iomanip` to format the numeric output, ensuring that the result displays two decimal places.

#### Sample Input and Output

```
Enter the length in inches: 17
17.00 in. = 43.18 cm;

```

### Problem #5: Fahrenheit to Celsius Converter

Create an application that converts degrees Fahrenheit to degrees Celsius. Use the following formula to convert the values:

$\degree C = \frac{5}{9} \times ( \degree F - 32 )$

Use the `fixed` and `setprecision` manipulators from `iomanip` to format the numeric output, ensuring that the result displays two decimal places.

#### Sample Input and Output

```
Enter the temperature in degrees Fahrenheit: 114
The temperature in degrees Celsius is 45.56

```

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 2

Do programming exercises from chapter 2:

  1. Exercise 2.2
  2. Exercise 2.3
  3. Exercise 2.4
  4. Exercise 2.7
  5. Exercise 2.11

### Homework Problem #6: Exercise 2.2

Write a program that reads in a radius $r$ and length $l$ of a cylinder and computes its area $A$ and volume $V$ using the following formulas:

$A = r^2 \pi$

$V = A \times l$

Ignore the sample output in the book. Instead, use the sample provided below to check your solution's correctness. Use the `fixed` and `setprecision` manipulators from `<iomanip>` to format the numeric output, ensuring that the area displays four decimal places and the volume displays one decimal place. Use the `numbers::pi` constant from `<numbers>` to represent the value of $\pi$.

#### Sample Input and Output

```
Enter the radius and length of a cylinder: 5.5 12
The area is 95.0332
The volume is 1140.4

```

### Homework Problem #7: Exercise 2.3

Write a program that reads a number in feet, converts it to meters, and displays the result. One foot equals 0.305 meters. Use a compile-time constant (`constexpr`) for the conversion factor where possible.

Use the `fixed` and `setprecision` manipulators from `iomanip` to format the numeric output according to the example below.

#### Sample Input and Output

```
Enter a value for feet: 16.5
16.5 feet is 5.0325 meters

```

### Homework Problem #8: Exercise 2.4

Write a program that converts pounds to kilograms. The program should prompt the user to enter a value in pounds, convert it to kilograms, and display the result. Use a compile-time constant (`constexpr`) for the conversion factor, where one pound is equal to 0.454 kilograms.

Use the `fixed` and `setprecision` manipulators from `iomanip` to format the numeric output according to the example below.

#### Sample Input and Output

```
Enter a number in pounds: 55.5
55.5 pounds is 25.197 kilograms

```

### Homework Problem #9: Exercise 2.7

Write a program that prompts the user to enter the minutes (e.g., 1 billion) and displays the maximum number of years and remaining days for the minutes. For simplicity, assume that a year has 365 days.

#### Sample Input and Output

```
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days

```

### Homework Problem #10: Exercise 2.11

Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and display the population after the number of years.

Use `round` from `<cmath>` to round the results of calculations on `double` values. Use `static_cast` to convert the result of `round` to an integer type (not necessarily `int`) to avoid using `fixed` and `setprecision` from `<iomanip>` when printing with `cout`.

Ignore the sample output in the book. Instead, use the sample below to check the correctness of your solution.

#### Sample Input and Output

```
Enter the number of years: 5
The population in 5 years is 325932970

```

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, .clang-format, CMakeLists.txt, Readme.md)
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

If the files with assignments are named incorrectly, you will be penalized.

---

## Documentation

* `iostream`: <https://en.cppreference.com/w/cpp/header/iostream>
* `iomanip`: <https://en.cppreference.com/w/cpp/header/iomanip>
* `cmath`: <https://en.cppreference.com/w/cpp/header/cmath>
* `const`: <https://en.cppreference.com/w/cpp/language/cv.html>
* `constexpr`: <https://en.cppreference.com/w/cpp/language/constexpr.html>
* `math constants`: <https://en.cppreference.com/w/cpp/numeric/constants.html>
* `static_cast`: <https://en.cppreference.com/w/cpp/language/static_cast.html>
