Introduction to Programming, Practice #5
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Canvas. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor on Canvas under the Discussions tab if you have any questions.

## Problem #1: Arithmetic Mean

Create an application that calculates an arithmetic mean for a list of grades (from one to five). All grades should be read from the standard input one at a time. A zero value should be considered the end of the input and not be used in the calculation.

Use the `do...while` loop in this task.

### Sample Input and Output

```
Enter the next grade or '0' to exit: 3
Enter the next grade or '0' to exit: 4
Enter the next grade or '0' to exit: 2
Enter the next grade or '0' to exit: 5
Enter the next grade or '0' to exit: 0
The arithmetic mean is 3.5
```

```
Enter the next grade or '0' to exit: 5
Enter the next grade or '0' to exit: 5
Enter the next grade or '0' to exit: 4
Enter the next grade or '0' to exit: 4
Enter the next grade or '0' to exit: 0
The arithmetic mean is 4.5
```

```
Enter the next grade or '0' to exit: 0
Nothing to calculate
```

## Problem #2: Sum of Digits

Create a program that reads an integer from the standard input and finds the sum of all its digits.

Use the `while` loop in this task.

### Sample Input and Output

```
Enter an integer: 6427572
The sum of all digits is 33.
```

```
Enter an integer: 784
The sum of all digits is 19.
```

## Problem #3: Simple Math Test

Create a program that generates tests to check students' ability to add numbers. The program should print each test with random operands on a separate line, read each answer from a student, and provide statistics with a number of correct and incorrect answers at the end.

Use the `while` loop first in your solution, comment it out, write a `for` loop solution.

Use `srand` from `cstdlib` to seed the random number generator with the value of `42` to get a predicatable sequence to help us evaluate your program with an automated script. Other `srand` values to make the values less predictable will be discussed in the next lecture. Note that the examples below may not use `42` in `srand` and will produce different results compared to your program.

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

## Problem #4: Circles

Create an application that draws many circles of random sizes, at random coordinates, and of random colors. The number of circles has to be decided by you and stored in a constant in your code.

### Sample

![Random Circles](https://i.imgur.com/xEHP8Jy.png)

## Problem #5: Gradient

Create an application that draws a number of circles of different shades of red at the center of the screen (like in the screenshot below). The number of circles has to be decided by you and has to be stored in a constant in your code. It should be a number to achieve a similar-looking picture below.

### Sample

![Gradient](https://i.imgur.com/70XUgkS.png)

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 5

* Read, try to understand, and rewrite the following code examples from Chapter 5 as is:

 1. `TestBreak.cpp` (name your file `p06.cpp`)
 2. `TestContinue.cpp` (name your file `p07.cpp`)
 3. `MultiplicationTable.cpp` (name your file `p08.cpp`)
 4. `TestPalindrome.cpp` (name your file `p09.cpp`)
 5. `PrimeNumber.cpp` (name your file `p10.cpp`)

Even though you can copy and paste code from the book, avoiding it is highly recommended. Try to retype the code on your own for educational purposes. It will help you to prepare for the Final Exam.

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
* `srand`: <https://en.cppreference.com/w/cpp/numeric/random/srand>
* `rand`: <https://en.cppreference.com/w/cpp/numeric/random/rand>
* `do...while`: <https://en.cppreference.com/w/cpp/language/do>
* `while`: <https://en.cppreference.com/w/cpp/language/while>
* `for`: <https://en.cppreference.com/w/cpp/language/for>
