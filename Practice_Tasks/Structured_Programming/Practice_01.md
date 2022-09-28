Structured Programming, Practice #1
===================================

## Original Requirements

* <https://drive.google.com/file/d/1WstT5IKD1gnWfsgKbxQlFOYg-iVIUGXd/view?usp=sharing>

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before sending it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Do not hesitate to contact your practice instructor on Canvas in the Discussions tab if you have any questions.

Moreover, your repository should not have additional files with unrelated code, especially the folder with lab tasks.

## Problem #1: Hello, World

Write a program that outputs the `Hello, World!!!` message to the screen.

### Sample Output

```
Hello, World!!!
```

## Problem #2: A Message in a Rectangle

Create a program that prints the `I like programming!` message surrounded by the asterisk symbols.

### Sample Output

```
*********************
*I like programming!*
*********************
```

## Problem #3: What is Your Name?

Write a program that reads a user name from the console, then forms and prints a greeting message for that user.

In your program, you should also capitalize the input and make the text printed in all lowercase letters. In the end, you should output the length of the string to the screen.

### Sample Input and Output

```
What is your name? John Doe
Hello, John Doe!
Your name in upper-case: JOHN DOE
Your name in lower-case: john doe
The total number of characters is 8
```

## Problem #4: Operations on Two Integer Numbers

Create a program that reads two integer numbers from the user and finds their sum, difference, product, quotient, and remainder.

### Sample Input and Output

```
1st int? 5
2nd int? 2
5 + 2 = 7
5 - 2 = 3
5 * 2 = 10
5 / 2 = 2
5 % 2 = 1
```

## Problem #5: Operations on Two Real Numbers

Create a program that reads two real numbers from the user and finds their sum, difference, product, quotient, and remainder.

### Sample Input and Output

```
1st double? 5.1
2nd double? 2.6
5.1 + 2.6 = 7.699999999999999
5.1 - 2.6 = 2.4999999999999996
5.1 * 2.6 = 13.26
5.1 / 2.6 = 1.9615384615384612
5.1 % 2.6 = 2.4999999999999996
```

## Homework

Read Introduction to Java Programming, 12th Edition by Y. Daniel Liang, Chapter 1

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
    J     A    V     V    A
    J    A A    V   V    A A
J   J   AAAAA    V V    AAAAA
 J J   A     A    V    A     A
```

### Homework Problem #7: Exercise 1.4

Write a program that calculates the squared and cubed value of `a`.

Note that you must create a variable (or variables) to store the values of `a` for every row. You also have to force the computer to calculate the squared and cubed values before formatting and outputting the answers to the screen.

We recommend using the multiplication operator `*` and NOT the `Math.pow()` method for small integer values and integer powers of numbers.

### Sample Output

```
a    a^2   a^3
1    1     1
2    4     8
3    9     27
4    16    64
```

### Homework Problem #8: Exercise 1.6

Write a program to find the sum of numbers from 1 to 9.

$1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9$

Note that you have to create a variable to store the final result. You also have to force the computer to calculate the mathematical expression.

### Sample output

```
45
```

### Homework Problem #9: Exercise 1.7

Write the code which computes the following two equations to approximate the value of $\pi$:

$\pi = 4 \times ( 1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \frac{1}{9} - \frac{1}{11})$

$\pi = 4 \times ( 1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \frac{1}{9} - \frac{1}{11} + \frac{1}{13})$

Note that you have to create a variable to store the final result. You also have to force the computer to calculate the mathematical expressions.

### Sample Output

```
2.9760461760461765
3.2837384837384844
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
. (.idea, .gitignore, other lab dirs)
└── lab-01
    ├── lab-01.iml
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
