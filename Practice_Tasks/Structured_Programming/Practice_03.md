Introduction to Programming, Practice #3
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Canvas. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor on Canvas under the Discussions tab if you have any questions.

## Problem #1: Absolute Value

Create a program that reads a real number from the standard input and then outputs its absolute value.

### Sample Input and Output

```
Enter a real number: -123.345
|-123.3450| = 123.3450

```

```
Enter a real number: 12.4
|12.4000| = 12.4000

```

## Problem #2: Pass or Fail

Create a program that reads the total number of points earned by a student in the course 'Intro to Programming' and prints whether a student passed or failed the course (reminder, that anything less than 40% is 'F').

### Sample Input and Output

```
Enter the number of points: 77
You have passed the "Intro to Programming" course.

```

```
Enter the number of points: 22
You have failed the "Intro to Programming" course.

```

## Problem #3: Comparing Numbers

Create a program that compares two integers and prints the larger one. If the numbers are equal, print a message stating that the numbers are equal.

### Sample Input and Output

```
Enter the first number: 2
Enter the second number: 3
The larger number is 3.

```

```
Enter the first number: -5
Enter the second number: 10
The larger number is 10.

```

```
Enter the first number: 7
Enter the second number: 7
The numbers are equal.

```

## Problem #4: Leap Year

Create a program that determines whether a certain year is a leap year or not.

### Test data:

*Leap years*:
1796, 1804, 1896, 1904, 1992, 1996, 2000, 2004, 2008

*Common years*:
1799, 1800, 1801, 1802, 1803, 1805, 1899, 1900, 1901

### Sample Input and Output

```
Enter the year: 2000
2000 is a leap year.

```

```
Enter the year: 1800
1800 is not a leap year.

```

## Problem #5: Grades

Create a program that for a given grade in points displays the alphabetical grade.

Conversion table:

$$
\begin{array}{ll}
90 \leq A \leq 100 \\
80 \leq B \lt 90 \\
70 \leq C \lt 80 \\
60 \leq D \lt 70 \\
~~0 \leq F \lt 60
\end{array}
$$

### Sample Input and Output

```
Enter the number of points: 73
Grade: C

```

```
Enter the number of points: 120
120 is not in the permitted range.

```

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 3

* Do programming exercises from chapter 3:

  1. Exercise 3.1
  2. Exercise 3.5
  3. Exercise 3.7
  4. Exercise 3.17
  5. Exercise 3.19

### Homework Problem #6: Exercise 3.1

The two roots of a quadratic equation $ax^2 + bx + c = 0$ can be obtained using the following formula:

$r_1 = \frac{-b + \sqrt{b^2 - 4ac}}{2a}$

and

$r_2 = \frac{-b - \sqrt{b^2 - 4ac}}{2a}$

$b2 - 4ac$ is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.

Write a program that prompts the user to enter values for $a$, $b$, and $c$ and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root. Otherwise, display "The equation has no real roots."

Note you can use `pow(x, 0.5)` or `sqrt(x)` to compute $\sqrt{x}$.

### Sample Input and Output

```
Enter a, b, c: 1.0 3 1
The equation has two roots -0.3820 and -2.6180

```

```
Enter a, b, c: 1 2.0 1
The equation has one root -1.0000

```

```
Enter a, b, c: 1 2 3
The equation has no real roots

```

### Homework Problem #7: Exercise 3.5

Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also prompt the user to enter the number of days after today for a future day and display the future day of the week.

### Sample Input and Output

```
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday

```

```
Enter today's day: 0
Enter the number of days elapsed since today: 31
Today is Sunday and the future day is Wednesday

```

### Homework Problem #8: Exercise 3.7

Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.

### Sample Input and Output

```
Enter three integer numbers: 5 2 10
2
5
10

```

### Homework Problem #9: Exercise 3.17

Write a program that prompts the user to enter a three-digit integer. The program displays the sum of all digits in the integer if the input is valid; otherwise, it displays a message indicating that the integer is not a three-digit number and hence, is invalid.

### Sample Input and Output

```
Enter a three-digit integer: 123
The sum of all digits is 6.

```

```
Enter a three-digit integer: 12
12 is not a three-digit number.

```

```
Enter a three-digit integer: 12345
12345 is not a three-digit number.

```

### Homework Problem #10: Exercise 3.19

Write a program that prompts the user to enter a point $(x, y)$ and checks whether the point is within the circle centered at $(0, 0)$ with radius 10. For example, $(4, 5)$ is inside the circle and $(9, 9)$ is outside the circle, as shown in the following [Figure](https://i.imgur.com/i2dhV4I.png).

A point is in the circle if its distance to $(0, 0)$ is less than or equal to 10. The formula for computing the distance is

$\sqrt{(x_1 - x_2)^2+(y_1 - y_2)^2}$

Test your program to cover all cases.

```
Enter a point with two coordinates: 4 5
Point (4.0, 5.0) is in the circle

```

```
Enter a point with two coordinates: 9 9
Point (9.0, 9.0) is not in the circle

```

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, other lab dirs)
└── lab03
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
* `operators`: <https://en.cppreference.com/w/cpp/language/operator_precedence>
