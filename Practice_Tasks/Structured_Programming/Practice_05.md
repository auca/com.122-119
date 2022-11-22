Structured Programming, Practice #5
===================================

## Original Requirements

* <https://drive.google.com/file/d/1L1byWaeEe_CthvXSy-BH7z-H2ur_xRHV/view?usp=sharing>

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before sending it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Do not hesitate to contact your practice instructor on Canvas in the Discussions tab if you have any questions.

Moreover, your repository should not have additional files with unrelated code, especially the folder with lab tasks.

## Problem #1: Arithmetic Mean

Create an application that calculates an arithmetic mean for a list of grades (from one to five). All grades should be read from the standard input one at a time. A zero value should be considered the end of the input and not be used in the calculation.

Use the `do...while` loop in this task.

### Sample Input and Output

```
3
4
2
5
0
The arithmetic mean is 3.5
```

```
5
5
4
4
0
The arithmetic mean is 4.5
```

```
0
Nothing to calculate
```

## Problem #2: Sum of Digits

Create a program that reads an integer from the standard input and finds the sum of all its digits.

Use the `while` loop in this task.

### Sample Input and Output

```
Integer? 6427572
The sum of all digits is 33
```

```
Integer? 784
The sum of all digits is 19
```

## Problem #3: Simple Math Test

The program asks for a number of tests to check students' ability to add numbers, prints each test on a separate line, reads each answer from a student each time, and provides statistics with a number of correct and incorrect answers at the end. Each test number is generated with the class `Random`.

Use the `while` loop first in your solution, comment it out, write a `for` loop solution.

### Sample Input and Output

```
Number of tests? 3
5 + 3 = 8
4 + 2 = 5
-3 + 11 = 9
Number of correct answers: 1
Number of incorrect answers: 2
```

```
Number of tests? 2
-2 + 1 = -1
2 + (-1) = 1
Number of correct answers: 2
Number of incorrect answers: 0
```

## Problem #4: Random Circles

Create an application that draws many circles of random sizes, at random coordinates, and of random colors. The number of circles has to be decided by you and stored in a constant in your code.

### Sample

![Random Circles](https://i.imgur.com/xEHP8Jy.png)

## Problem #5: Gradient

Create an application that draws a number of circles of different shades of red at the center of the screen (like in the screenshot below). The number of circles has to be decided by you and has to be stored in a constant in your code. It should be a number to achieve a similar-looking picture below.

### Sample

![Gradient](https://i.imgur.com/70XUgkS.png)

## Homework

Read Introduction to Java Programming, 12th Edition by Y. Daniel Liang, Chapter 5

* Read, try to understand, and rewrite the following code examples from Chapter 5 as is:

 1. `TestDoWhile.java` (name your file `Problem01.java`)
 3. `TestBreak.java` (name your file `Problem02.java`)
 2. `MultiplicationTable.java` (name your file `Problem03.java`)
 4. `Palindrome.java` (name your file `Problem04.java`)
 5. `PrimeNumber.java` (name your file `Problem05.java`)

Even though you can copy and paste code from the book, avoiding it is highly recommended. Try to retype the code on your own. It will help you to prepare for the Final Exam.

## Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
. (.idea, .gitignore, other lab dirs)
└── lab-05
    ├── lab-05.iml
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
