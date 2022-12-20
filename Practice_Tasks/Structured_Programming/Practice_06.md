Structured Programming, Practice #6
===================================

## Original Requirements

* <https://drive.google.com/file/d/1hN4SHj5BMC7FX2oRjvch7bR9j-PjKp23/view?usp=sharing>

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before sending it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Do not hesitate to contact your practice instructor on Canvas in the Discussions tab if you have any questions.

Moreover, your repository should not have additional files with unrelated code, especially the folder with lab tasks.

## Problem #1: Which Coordinate is Closer?

In this task, students are required to write a program that asks the user for a coordinate (an integer number) on a number line and the coordinates of two other points (two integer numbers) on the same line. The program should determine which of these points is closer to the user. To solve this task, students must implement the method `int abs(int x)`.

### Sample Input and Output

```
Your coordinate: 23
Coordinate of 1st point: 1
Coordinate of 2nd point: 25
2st point is closer. Distance 2
```

## Problem #2: Number of Days in a Month

Write a program that prompts the user for the month number (from 1 to 12) and a year (from 1970 to 2038) and prints the number of days in that month. To solve this problem, implement the methods `int getDaysOfMonth(int year, int month)` and `boolean isLeapYear(int year)`. Then, use the method `int readInt(String prompt, String errorMessage, int minValue, int maxValue)` to read the year and month values. Suppose the entered integer is incorrect (out of range between `minValue` and `maxValue`). In that case, the method `readInt` should print the content of the `errorMessage` parameter and exit the program with the `System.exit(-1)` command.

### Sample Input and Output

```
Year: 2004
Month: 2
Number of days: 29
```

## Problem #3: Stars

Write a GUI application that creates the following picture. In this program, you have to define a method `void star(int rays, float x, float y, float outerRadius, float innerRadius, int color, float angle)` and use it to draw five different stars. The stars should rotate slowly, clockwise or counterclockwise.

### Sample

![Star](https://i.imgur.com/JZ5oIx5.png)

## Problem #4: Greatest Common Divisor (Slow Variant)

Write a program that takes two arbitrary integer numbers and prints their greatest common divisor. It is necessary to define a method `int gcd(int a, b)` in this program. This method should return the greatest common
divisor of numbers `a` and `b`.

### Sample Input and Output

```
A = 25
B = 10
GCD(25, 10) = 5
```

```
A = 0
B = 0
GCD(0, 0) is not defined.
```

## Problem #5: Greatest Common Divisor (Euclid’s Algorithm)

Solve Problem #4 using Euclid’s algorithm. The format of the input and output is the same.

## Homework

Read Introduction to Java Programming, 12th Edition by Y. Daniel Liang, Chapter 6

* Do programming exercises from chapter 6:

  1. Exercise 6.2
  2. Exercise 6.3
  3. Exercise 6.6
  4. Exercise 6.14
  5. Exercise 6.13

### Homework Problem #6: Exercise 6.2

Write a method that computes the sum of the digits in an integer. Use the following method header:

```java
public static int sumDigits(long n)
```

### Sample Input and Output

```
An integer? 123
The sum of all digits is 6
```

### Homework Problem #7: Exercise 6.3

Write the methods with the following headers:

```java
// Return the reversal of an integer, e.g., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)
```

Use the `reverse` method to implement `isPalindrome`. A number is a palindrome if its reversal is the same as itself. Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.

### Sample Input and Output

```
An integer? 123
123 is not a palindrome
```

```
An integer? 1221
1221 is a palindrome
```

### Homework Problem #8: Exercise 6.6

Write a method to display a pattern as follows:

```
              1
            2 1
          3 2 1
...
n n–1 ... 3 2 1
```

The method header is

```java
public static void displayPattern(int n)
```

Write a test program that prompts the user to enter a number `n` and invokes `displayPattern(n)` to display the pattern.

### Sample Input and Output

```
n? 10
                   1
                 2 1
               3 2 1
             4 3 2 1
           5 4 3 2 1
         6 5 4 3 2 1
       7 6 5 4 3 2 1
     8 7 6 5 4 3 2 1
   9 8 7 6 5 4 3 2 1
10 9 8 7 6 5 4 3 2 1
```

### Homework Problem #9: Exercise 6.14

$\pi$ can be computed using the following summation:

$\pi = 4 \times (1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \frac{1}{9} - \frac{1}{11} + \dots + \frac{-1^{i+1}}{2i-1})$

Write a method that returns `m(i)` for a given `i` and write a test program that displays the following table:

### Sample Output

```
i           m(i)
1           4.0000
101         3.1515
201         3.1466
301         3.1449
401         3.1441
501         3.1436
601         3.1433
701         3.1430
801         3.1428
901         3.1427
```

### Homework Problem #10: Exercise 6.13

Write a method to compute the following summation:

$m(i) = \frac{1}{2} + \frac{2}{3} + \dots + \frac{i}{i+1}$

Write a test program that displays the following table:

### Sample Output

```
i           m(i)
1           0.5000
2           1.1667
3           1.9167
4           2.7167
5           3.5500
6           4.4071
7           5.2821
8           6.1710
9           7.0710
10          7.9801
11          8.8968
12          9.8199
13          10.7484
14          11.6818
15          12.6193
16          13.5604
17          14.5049
18          15.4523
19          16.4023
20          17.3546
```

## Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
. (.idea, .gitignore, other lab dirs)
└── lab-06
    ├── lab-06.iml
    └── src
        ├── Problem01.java
        ├── Problem02.java
        ├── Problem03.java
        ├── Problem04.java
        ├── Problem05.java
        ├── Problem06.java
        ├── Problem07.java
        ├── Problem08.java
        ├── Problem09.java
        └── Problem10.java
```

If the files with assignments are named differently, you will be penalized.
