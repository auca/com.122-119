Structured Programming, Practice #4
===================================

## Developer Tools

* [Amazon Corretto JDK 11](https://aws.amazon.com/corretto)
* [Eclipse Temurin JDK 17](https://adoptium.net) for AUAF Group
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before committing it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Don't hesitate to contact TA (teacher assistant) on Canvas in the Discussions tab if you have any questions.

Moreover, your repository, especially the folder with lab tasks, should not have additional files with unrelated code.

## Problem #1: "Dangerous Comparison of Double Values" (0.4%)

Create variable `result` of the data type double and assign to it the value 0. Then add 0.1 to it 10 times. Compare the result with 1.0. If the numbers are equal, print "Equal". Otherwise, print "Not equal". Explain the result.

## Problem #2: "Season Name (If-Else-If)" (0.4%)

The application determines a season name by a given month number. Use `if-else if` construct to solve the task.

### Sample Input and Output

```
Enter the month number: 12
Winter
```

```
Enter the month number: 3
Spring
```

```
Enter the month number: 100
Invalid month number
```

## Problem #3: "Season Name (Switch-Case)" (0.4%)

Redo the previous solution by using the `switch-case` construct.

## Problem #4: "Experience Level" (0.4%)

The application determines you professional level by a given integer number in a range from
one to five, which represents the complexity level of a certain game.

Conversion table

```
4 <= pro gamer <= 5
2 <= experienced gamer <= 3
1 = beginner
0 = total newbie
```

### Sample Input and Output

```
Complexity level: 1
You are a beginner.
```

```
Complexity level: 2
You are an experienced gamer.
```

```
Complexity level: 9000
Invalid input
```

## Problem #5: "Number of Days" (0.4%)

The application determines a number of days in a specific month for a predefined year.

### Sample Input and Output

```
Enter the year: 2000
Enter the month number: 2
Number of days: 29
```

## Homework

Read Introduction to Java Programming, 10th Edition by Y. Daniel Liang, Chapter 3

* Do programming exercises from chapter 3:
  1. 3.15 (0.4%)
  2. 3.18 (0.4%)
  3. 3.19 (0.4%)
  4. 3.23 (0.4%)
  5. 3.24 (0.4%)


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
.
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

If the files with assignments are named differently, you will be penalised.
