Structured Programming, Practice #4
===================================

## Original Requirements

* <https://drive.google.com/file/d/1c56tLA48z_9De6BriV-UDi3fBo3e47TH/view?usp=sharing>

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before sending it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Do not hesitate to contact your practice instructor on Canvas in the Discussions tab if you have any questions.

Moreover, your repository should not have additional files with unrelated code, especially the folder with lab tasks.

## Problem #1: Dangerous Comparison of Double Values

Create a variable named `result` of the `double` data type and assign the value 0 to it. Then add 0.1 to it 10 times. Compare the result with 1.0. If the numbers are equal, print "Equal". Otherwise, print "Not equal". Explain the result. Write a correct solution.

## Problem #2: Season Name (If-Else-If)

Create an application that determines a season name for a given month number. Use the `if-else-if` construct to solve the task.

### Sample Input and Output

```
month? 12
winter
```

```
month? 3
spring
```

## Problem #3: Season Name (Switch-Case)

Redo the previous solution by using the `switch-case` construct.

## Problem #4: Experience Level

Create an application that determines your professional level for a given integer number ranging from one to five. The number represents a complexity level of a game.

### Sample Input and Output

```
complexity level? 1
You are a beginner.
```

```
complexity level? 2
You are an experienced gamer.
```

## Problem #5: Number of Days

Create an application that determines the number of days in a specific month for a given year.

### Sample Input and Output

```
Year? 2000
Month? 2
Number of days: 29
```

```
Year? 1900
Month? 2
Number of days: 28
```

```
Year? 2004
Month? 4
Number of days: 30
```

## Homework

Read Introduction to Java Programming, 12th Edition by Y. Daniel Liang, Chapter 3 and 4

* Do programming exercises from chapter 3:

  1. Exercise 3.15
  2. Exercise 3.18
  3. Exercise 3.19
  4. Exercise 3.23
  5. Exercise 3.24

### Homework Problem #6: Exercise 3.15

### Sample Input and Output

```
Enter your lottery pick (three digits): 123
The lottery number is 123
Exact match: you win $10.000
```

```
Enter your lottery pick (three digits): 123
The lottery number is 312
Match all digits: you win $3.000
```

```
Enter your lottery pick:  123
The lottery number is 416
Match one digit: you win $1.000
```

```
Enter your lottery pick: 123
The lottery number is 456
Sorry: no match
```

### Homework Problem #7: Exercise 3.18

### Sample Input and Output

Note, that the book has a mistake in edition 10. It is written in the book 'If the weight is greater than 50, display a message "the package cannot be shipped."'. It should be 'If the weight is greater than 20'.

```
Enter the weight of the package: 0.5
The shipping cost: 3.5
```

```
Enter the weight of the package: 15
The shipping cost: 10.5
```

```
Enter the weight of the package: 21
The package cannot be shipped.
```

### Homework Problem #8: Exercise 3.19

### Sample Input and Output

```
Enter the length of edges of a triangle: 3 5 7
The perimeter: 15
```

```
Enter the length of edges of a triangle: 2 5 7
The input is invalid.
```

### Homework Problem #9: Exercise 3.23

### Sample Input and Output

```
Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle
```

```
Enter a point with two coordinates: 6 4
Point (6.0, 4.0) is not in the rectangle
```

### Homework Problem #10: Exercise 3.24

### Sample Input and Output

```
The card you picked is Jack of Hearts
```

```
The card you picked is Ace of Spades
```

## Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
. (.idea, .gitignore, other lab dirs)
└── lab-04
    ├── lab-04.iml
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
