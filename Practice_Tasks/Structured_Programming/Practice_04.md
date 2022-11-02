Structured Programming, Practice #4
===================================

## Original Requirements

* <https://drive.google.com/file/d/18q8uK_HxNPbW3wn_rb_FGQ62zv7AbLQB/view?usp=sharing>

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

Note: use 'fall' instead of 'autumn'.

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

Conversion Table:

```
4 <= pro gamer <=5
2 <= experienced gamer <= 3
1 = beginner
0 = total newbie
```

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

  1. Exercise 3.23
  2. Exercise 3.15
  3. Exercise 3.18
  4. Exercise 3.19
  5. Exercise 3.24

### Homework Problem #6: Exercise 3.23

Write a program that prompts the user to enter a point $(x, y)$ and checks whether the point is within the rectangle centered at $(0, 0)$ with width 10 and height 5. For example, $(2, 2)$ is inside the rectangle and $(6, 4)$ is outside the rectangle, as shown in the following [Figure](https://i.imgur.com/i2dhV4I.png).

A point is in the rectangle if its horizontal distance to $(0, 0)$ is less than or equal to $10 / 2$ and its vertical distance to $(0, 0)$ is less than or equal to $5.0 / 2$. Test your program to cover all cases.

### Sample Input and Output

```
Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle
```

```
Enter a point with two coordinates: 6 4
Point (6.0, 4.0) is not in the rectangle
```

### Homework Problem #7: Exercise 3.15

Revise Listing 3.8, 'Lottery.java' from the book, to generate a lottery of a three-digit integer. The program prompts the user to enter a three-digit integer and determines whether the user wins according to the following rules:

1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.

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
Enter your lottery pick (three digits):  123
The lottery number is 416
Match one digit: you win $1.000
```

```
Enter your lottery pick (three digits): 123
The lottery number is 456
Sorry: no match
```

### Homework Problem #8: Exercise 3.18

A shipping company uses the following table to calculate the cost (in dollars) of shipping based on the weight of the package (in pounds).

$$
\begin{array}{ll}
3.5,& \text{if } 0 \lt w \leq 1 \\
5.5,& \text{if } 1 \lt w \leq 3 \\
8.5,& \text{if } 3 \lt w \leq 10 \\
10.5,& \text{if } 10 \lt w \leq 20 \\
\end{array}
$$

Write a program that prompts the user to enter the weight of the package and displays the shipping cost. If the weight is negative or zero, display a message "Invalid input." If the weight is greater than 20, display a message "The package cannot be shipped."

### Sample Input and Output

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

```
Enter the weight of the package: -42
Invalid input.
```

### Homework Problem #9: Exercise 3.19

Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge.

### Sample Input and Output

```
Enter the length of edges of a triangle: 3 5 7
The perimeter: 15
```

```
Enter the length of edges of a triangle: 2 5 7
The input is invalid.
```

### Homework Problem #10: Exercise 3.24

Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.

Here are the two sample runs of the program. The random generator may select different cards in your case.

### Sample Output

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
