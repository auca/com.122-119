Structured Programming, Practice #1
===================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before sending it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Do not hesitate to contact your practice instructor on Canvas in the Discussions tab if you have any questions.

Moreover, your repository should not have additional files with unrelated code, especially the folder with lab tasks.

## Problem #1: Hello, World

Write a program that outputs the `hello, world` message to the screen.

### Sample Output

```
hello, world
```

## Problem #2: A Message in a Rectangle

Create a program that prints the `hello, world` message surrounded by the asterisk symbols.

### Sample Output

```
**************
*hello, world*
**************
```

## Problem #3: What is Your Name?

Write a program that reads a user name from the console, then forms and prints a greeting message for that user.

### Sample Input and Output

```
What is your name? John Doe
Hello, John Doe!
```

## Problem #4: Operations on Two Integer Numbers

Create a program that reads two integer numbers from the user and finds their sum, difference, product, quotient, and remainder.

### Sample Input and Output

```
Enter the first integer? 5
Enter the second integer? 2
5 + 2 = 7
5 - 2 = 3
5 * 2 = 10
5 / 2 = 2
5 % 2 = 1
```

## Problem #5: Operations on Two Real Numbers

Create a program that reads two real numbers from the user and finds their sum, difference, product, quotient, and remainder. Use `fmod` functionn from the `cmath` header to find the remainder.

### Sample Input and Output

```
Enter the first double? 5.1
Enter the second double? 2.6
5.1 + 2.6 = 7.7
5.1 - 2.6 = 2.5
5.1 * 2.6 = 13.26
5.1 / 2.6 = 1.96154
5.1 % 2.6 = 2.5
```

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 1

* Do programming exercises from chapter 1:

  1. Exercise 1.3
  2. Exercise 1.4
  3. Exercise 1.6
  4. Exercise 1.7
  5. Exercise 1.11

### Homework Problem #6: Exercise 1.3

Write a program that displays the following pattern:

### Sample Output

```
    *        *********
   ***        *******
  *****        *****
 *******        ***
*********        *
```

### Homework Problem #7: Exercise 1.4

Write a program that calculates the values of `p`.

Note that you must create a variable (or variables) to store the values of `p` for every row. You also have to force the computer to calculate its table values before formatting and outputting the answers to the screen.

### Sample Output

```
p       p*5      p*10
5       25       50
10      50       100
25      125      250
50      250      500
```

### Homework Problem #8: Exercise 1.6

Write a program that displays the sum of the first ten odd numbers.

$1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19$

Note that you have to create a variable to store the final result. You also have to force the computer to calculate the mathematical expression. Do NOT use loops or selection constructs.

### Sample output

```
100
```

### Homework Problem #9: Exercise 1.7

Write the code which computes the following two equations to approximate the value of $\pi$:

$\pi = \sqrt{6 \times (1 + \frac{1}{4} + \frac{1}{9} + \frac{1}{16} + \frac{1}{25})}$

$\pi = \sqrt{6 \times (1 + \frac{1}{4} + \frac{1}{9} + \frac{1}{16} + \frac{1}{25} + \frac{1}{36})}$

Note that you have to create a variable to store the final result. You also have to force the computer to calculate the mathematical expressions.

### Sample Output

```
2.96339
2.99138
```

### Homework Problem #10: Exercise 1.11

The U.S. Census Bureau projects population based on the following assumptions:

* One birth every 7 seconds
* One death every 13 seconds
* One new immigrant every 45 seconds

Write a program to display the population for each of the next five years. Assume that the current population is 312,032,486, and one year has 365 days.

### Sample Output

```
314812583
317592679
320372776
323152873
325932970
```

## Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, other lab dirs)
└── lab-01
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

If the files with assignments are named differently, you will be penalized.
