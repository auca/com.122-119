Introduction to Programming, Practice #2
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Canvas. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor on Canvas under the Discussions tab if you have any questions.

## Problem #1: Swap Two Numbers

Declare two integer variables, `a` and `b`, and initialize them with values provided by the user. Then, print both variables, swap their values, and print the variables again.

### Sample Input and Output

```
Enter the first value: 2
Enter the second value: 3
Before swapping: a = 2; b = 3;
After swapping: a = 3; b = 2;
```

## Problem #2: Swap Two Numbers Without Temporary Variables

Declare two integer variables, `a` and `b`, and initialize them with values provided by the user. Then, print both variables, swap their values, and print the variables again. In this task, it is prohibited to use temporary variables.

### Sample Input and Output

```
Enter the first value: 2
Enter the second value: 3
Before swapping: a = 2; b = 3;
After swapping: a = 3; b = 2;
```

## Problem #3: Sum of Digits

Read a four-digit integer from the standard input and find the sum of all its digits.

### Sample Input and Output

```
Enter a four-digit integer: 1237
The sum of all digits is 13
```

## Problem #4: Inches to Centimeters Converter

Create an application that converts inches to centimeters. Note that one inch is equal to 2.54 centimeters. Try to use a constant here.

### Sample Input and Output

```
Enter the length in inches: 17
17.00 in. = 43.18 cm.
```

## Problem #5: Fahrenheit to Celsius Converter

Create an application that converts degrees Fahrenheit to degrees Celsius. Use the following formula to convert the values:

$\degree C = \frac{5}{9} \times ( \degree F - 32 )$

### Sample Input and Output

```
Enter the temperature in degrees Fahrenheit: 114
The temperature in degrees Celsius is 45.56
```

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 2

* Do programming exercises from chapter 2:

  1. Exercise 2.2
  2. Exercise 2.3
  3. Exercise 2.4
  4. Exercise 2.7
  5. Exercise 2.11

### Homework Problem #6: Exercise 2.2

Write a program that reads in a radius $r$ and length $l$ of a cylinder and computes its area $A$ and volume $V$ using the following formulas:

$A = r^2 \pi$

$V = A \times l$

Ignore the sample output in the book. Instead, use the sample below to check the correctness of your solution.

### Sample Input and Output

```
Enter the radius and length of a cylinder: 5.5 12
The area is 95.0332
The volume is 1140.4
```

### Homework Problem #7: Exercise 2.3

Write a program that reads a number in feet, converts it to meters, and displays the result. One foot is 0.305 meter.

### Sample Input and Output

```
Enter a value for feet: 16.5
16.5 feet is 5.0325 meters
```

### Homework Problem #8: Exercise 2.4

Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. One pound is 0.454 kilogram.

### Sample Input and Output

```
Enter a number in pounds: 55.5
55.5 pounds is 25.197 kilograms
```

### Homework Problem #9: Exercise 2.7

Write a program that prompts the user to enter the minutes (e.g., 1 billion) and displays the maximum number of years and remaining days for the minutes. For simplicity, assume that a year has 365 days.

### Sample Input and Output

```
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
```

### Homework Problem #10: Exercise 2.11

Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and display the population after the number of years.

Use the `round` function from `cmath` to round calculations performed on `double` values. Use the `static_cast` operator to convert the result of `round` to an `int` value to avoid the need of `fixed` and `setprecision` from `iomanip` for `cout`.

Ignore the sample output in the book. Instead, use the sample below to check the correctness of your solution.

### Sample Input and Output

```
Enter the number of years: 5
The population in 5 years is 325932970
```

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, other lab dirs)
└── lab02
    ├── p01.cpp
    ├── p02.cpp
    ├── p03.cpp
    ├── p04.cpp
    ├── p05.cpp
    ├── p06.cpp
    ├── p07.cpp
    ├── p08.cpp
    ├── p09.cpp
    └── p10.cpp
```

If the files with assignments are named incorrectly, you will be penalized.

## Documentation

* `iostream`: <https://en.cppreference.com/w/cpp/header/iostream>
* `iomanip`: <https://en.cppreference.com/w/cpp/header/iomanip>
* `cmath`: <https://en.cppreference.com/w/cpp/header/cmath>
