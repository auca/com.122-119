Introduction to Programming, Practice #4
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Canvas. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor on Canvas under the Discussions tab if you have any questions.

## Problem #1: Dangerous Comparison

Create a variable named `result` of the `double` data type and assign the value 0 to it. Then add 0.1 to it 10 times. Compare the result with 1.0. If the numbers are equal, print "Equal". Otherwise, print "Not equal". Do not forget to output '\n' at the end. Explain the result. Write a correct solution.

### Sample Output

```
Equal

```

## Problem #2: Month Name (if-else-if)

Create a program that determines a month name for a given month number. Use the `if-else-if` construct to solve the task.

### Sample Input and Output

```
Enter the month number (1-12): 12
December

```

```
Enter the month number (1-12): 1
January

```

```
Enter the month number (1-12): -1
Incorrect month number.

```

```
Enter the month number (1-12): 20
Incorrect month number.

```

## Problem #3: Month Name (switch)

Rewrite the solution to Problem #2 by using the `switch` statement.

### Sample Input and Output

```
Enter the month number (1-12): 12
December

```

```
Enter the month number (1-12): 1
January

```

```
Enter the month number (1-12): -1
Incorrect month number.

```

```
Enter the month number (1-12): 20
Incorrect month number.

```

## Problem #4: Season Name (switch)

Create a program that determines a season name for a given month number. Use the `switch` construct to solve the task.

### Sample Input and Output

```
Enter the month number (1-12): 11
Fall

```

```
Enter the month number (1-12): 12
Winter

```

```
Enter the month number (1-12): 8
Summer

```

```
Enter the month number (1-12): 5
Spring

```

```
Enter the month number (1-12): 0
Incorrect month number.

```

## Problem #5: Number of Days

Create a program that determines the number of days in a specific month for a given year.

### Sample Input and Output

```
Enter the year: 2000
Enter the month: 2
Number of days: 29

```

```
Enter the year: 1900
Enter the month: 2
Number of days: 28

```

```
Enter the year: 2004
Enter the month: 4
Number of days: 30

```

```
Enter the year: 2004
Enter the month: -5
Incorrect month number.

```

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 3

* Do programming exercises from chapter 3:

  1. Exercise 3.20
  2. Exercise 3.5
  3. Exercise 3.7
  4. Exercise 3.17
  5. Exercise 3.21

### Homework Problem #6: Exercise 3.20

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

### Homework Problem #10: Exercise 3.21

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

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, other lab dirs)
└── lab04
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
* `if`: <https://en.cppreference.com/w/cpp/language/if>
* `switch`: <https://en.cppreference.com/w/cpp/language/switch>
