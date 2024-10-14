Introduction to Programming, Practice #4
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

## Important Notes

The checkpoint will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Moodle. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a \n control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor if you have any questions.

---

## Lab Tasks

Complete the following programming exercises with your lab instructor or on your own.

### Problem #1: Dangerous Comparison

Create a variable named `result` of type `double` and initialize it to 0. Then, add 0.1 to it ten times. Compare the final value of `result` with 1.0. If the values are equal, print "Equal"; otherwise, print "Not equal". Be sure to include a newline character ('\n') at the end of the output.

Next, explain the outcome of this comparison. Write a correct solution that compares floating-point values accurately and prints "Equal".

#### Sample Output

```
Equal

```

### Problem #2: Month Name (if-else-if)

Create a program that determines a month name for a given month number. Use the `if-else-if` construct to solve the task.

#### Sample Input and Output

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

### Problem #3: Month Name (switch)

Rewrite the solution to Problem #2 by using the `switch` statement.

#### Sample Input and Output

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

### Problem #4: Season Name (switch)

Create a program that determines a season name for a given month number. Use the `switch` construct to solve the task.

#### Sample Input and Output

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

### Problem #5: Number of Days

Create a program that determines the number of days in a specific month for a given year.

#### Sample Input and Output

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

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 3, 4

Do programming exercises from chapter 3 and 4:

  1. Exercise 3.11
  2. Exercise 3.20
  3. Exercise 3.21
  4. Exercise 4.15
  5. Exercise 4.21

### Homework Problem #6: Exercise 3.11

A bank uses the following function to calculate the rate of interest (in percentage) for a particular loan amount (in lakhs of dollars).

$$
\begin{array}{ll}
15.0,& \text{if } \$10000 \leq a \leq \$100000 \\
13.5,& \text{if } \$100000 \lt a \leq \$500000 \\
12.5,& \text{if } \$500000 \lt a \leq \$1000000 \\
11.0,& \text{if } \$1000000 \lt a \leq \$5000000 \\
\end{array}
$$

Write a program that prompts the user to enter the amount of the loan and displays the rate of interest. If the amount is less than $10000 or more than $5000000, display a message "Loan cannot be provided."

Use any selection construct to solve the task. The loan amount is guaranteed to be an integer.

#### Sample Input and Output

```
Enter the amount of the loan: 10000
The rate of interest: 15.0

```

```
Enter the amount of the loan: 5000000
The rate of interest: 11.0

```

```
Enter the amount of the loan: 510000
The rate of interest: 12.5

```

```
Enter the amount of the loan: 9999
Loan cannot be provided.

```

### Homework Problem #7: Exercise 3.20

Write a program that prompts the user to enter a point $(x, y)$ and checks whether the point is within the rectangle centered at $(0, 0)$ with width 10 and height 5. For example, $(2, 2)$ is inside the rectangle and $(6, 4)$ is outside the rectangle, as shown in the following [Figure](https://i.imgur.com/i2dhV4I.png).

A point is in the rectangle if its horizontal distance to $(0, 0)$ is less than or equal to $10 / 2$ and its vertical distance to $(0, 0)$ is less than or equal to $5.0 / 2$. Test your program to cover all cases.

Use any selection construct to solve the task.

#### Sample Input and Output

```
Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle

```

```
Enter a point with two coordinates: 6 4
Point (6.0, 4.0) is not in the rectangle

```

### Homework Problem #8: Exercise 3.21

Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.

Use `srand` from `cstdlib` to seed the random number generator with the value of `42` to get a predicatable sequence to help us evaluate your program with an automated script. Other `srand` values to make the values less predictable will be discussed in the next lecture. Note that the examples below may not use `42` in `srand` and will produce different results compared to your program.

Use the `switch` construct to solve the task.

#### Sample Output

```
The card you picked is Jack of Hearts

```

```
The card you picked is Ace of Spades

```

### Homework Problem #9: Exercise 4.15

The international standard letter/number mapping found on the telephone is shown [here](https://i.imgur.com/Zn6UdpC.png).

Write a program that prompts the user to enter a letter and displays its corresponding number. Use the `switch` construct to solve the task. You can use any selection construct for error checking.

#### Sample Input and Output

```
Enter a letter: A
The corresponding number is 2

```

```
Enter a letter: a
The corresponding number is 2

```

```
Enter a letter: +
+ is an invalid input

```

### Homework Problem #10: Exercise 4.21

Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. The first character indicates the major and the second is number character 1, 2, 3, 4, which indicates whether a student is a Freshman, Sophomore, Junior, or Senior. Suppose the following characters are used to denote the majors:

* `M` or `m`: Mathematics
* `C` or `c`: Computer Science
* `I` or `i`: Information Technology

Use the `switch` construct to solve the task. You can use any selection construct for error checking. Use the `tolower` or `toupper` functions from the `cctype` header to minimize the number of checks in your selection constructs.

#### Sample Input and Output

```
Enter two characters: M1
Mathematics Freshman

```

```
Enter two characters: m1
Mathematics Freshman

```

```
Enter two characters: C3
Computer Science Junior

```

```
Enter two characters: T3
Invalid major code

```

```
Enter two characters: M7
Invalid status code

```

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, Readme.md)
├── problem01.cpp
├── problem02.cpp
├── problem03.cpp
├── problem04.cpp
├── problem05.cpp
├── problem06.cpp
├── problem07.cpp
├── problem08.cpp
├── problem09.cpp
└── problem10.cpp
```

If the files with assignments are named incorrectly, you will be penalized.

---

## Documentation

* `iostream`: <https://en.cppreference.com/w/cpp/header/iostream>
* `iomanip`: <https://en.cppreference.com/w/cpp/header/iomanip>
* `cmath`: <https://en.cppreference.com/w/cpp/header/cmath>
* `cctype`: <https://en.cppreference.com/w/cpp/header/cctype>
* `operators`: <https://en.cppreference.com/w/cpp/language/operator_precedence>
* `if`: <https://en.cppreference.com/w/cpp/language/if>
* `switch`: <https://en.cppreference.com/w/cpp/language/switch>
* `srand`: <https://en.cppreference.com/w/cpp/numeric/random/srand>
* `rand`: <https://en.cppreference.com/w/cpp/numeric/random/rand>
