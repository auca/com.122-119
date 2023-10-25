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

* TBD (there was a copy-paste mistake of old tasks from the Java course, we are reworking the homework part)

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
