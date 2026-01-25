Object-oriented Programming, Practice #1
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

---

## Important Notes

The checkpoint will be graded based on your programs' output, the correctness of your repository structure, and the style of your code. You may be penalized and receive a lower grade if your program's output does not exactly match the expected output (wrong letters, extra spaces or newlines, or an incorrectly computed result). Please check your code and output before submitting your work to GitHub or Moodle. Ensure your program's output matches the specified output on this page. Print a `\n` newline after the final line of your program's output. Format real numbers precisely to the number of decimal places specified in the sample output.

Ensure your code style is consistent: indent code properly, separate logical blocks with a blank line, and use variable names that follow a consistent naming style and concisely describe the data they store. The code style for all files must conform to the configuration in `.clang-format`. By default, `.clang-format` is set to the WebKit style; see the [WebKit Code Style Guidelines](https://webkit.org/code-style-guidelines) for details. If you prefer a different style, update `.clang-format` accordingly. Ensure that your source files adhere to the selected style. If you receive the error `The file is not formatted consistently with the '.clang-format' configuration.` from the grader, it means you failed to follow the selected style in the `.clang-format` file. Format your source code manually or use CLion's autoformatting tools. However, we recommend starting with manual formatting to build good programming habits.

Your files and directories must be named according to the requirements outlined at the bottom of this page. Moreover, your repository must not contain extraneous files or unrelated code, especially within the folder designated for lab tasks.

If you are instructed to use a particular function, you must base your solution on that function, even if a better solution exists without it.

Do not hesitate to contact your practice instructor if you have any questions.

---

## Lab Task

Complete the following programming exercise with your lab instructor or on your own.

### Problem #1: Turtle Graphics, Procedural Style

>The Logo language made the concept of turtle graphics famous. Imagine a
>mechanical turtle that walks around the room under the control of an
>application. The turtle holds a pen in one of two positions up or down. While
>the pen is down, the turtle traces out shapes as it moves, and while the pen is
>up, the turtle moves about freely without writing anything.

— H. M. Deitel

In this problem, you will simulate the operation of a virtual turtle and create a digital sketchpad. Represent the field as a 20-by-20 rectangular 2-D array, initially filled with the character `.`. Sequentially read and execute the user's commands to control the turtle. The program should track the turtle's current position and the state of its pen (either up or down). The process stops when the user types `exit` or triggers the [EOF](https://en.wikipedia.org/wiki/End-of-file) condition on the keyboard. The program should ignore invalid input. Assume the turtle always starts at location (0, 0), with its initial direction set to the right and its pen in the up position.

| Command    | Meaning                |
| ---------: | :--------------------- |
| pen-up     | Put pen up             |
| pen-down   | Put pen down           |
| turn-right | Turn the turtle right  |
| turn-left  | Turn the turtle left   |
| move 10    | Move forward 10 steps  |
| display    | Display the field      |
| exit       | Exit from the program. |

Write an application to implement the Turtle Graphics capabilities discussed in this document using a *procedural programming* style. Then, test the program by composing several lists of commands designed to draw interesting shapes.

#### Example

The following list of commands will draw and display a square, leaving the pen in the 'up' position:

```
Turtle Graphics
===============
Type your commands (`pen-up`, `pen-down`, `turn-right`, `turn-left`, `move <steps>`, `display`, `exit`) below.
move 4
turn-right
move 4
turn-left
pen-down
move 11
turn-right
move 11
turn-right
move 11
turn-right
move 11
pen-up
display
....................
....................
....................
....................
....T***********....
....*..........*....
....*..........*....
....*..........*....
....*..........*....
....*..........*....
....*..........*....
....*..........*....
....*..........*....
....*..........*....
....*..........*....
....************....
....................
....................
....................
....................
exit

```

As the turtle moves with its pen in the 'down' position, we set the corresponding elements of the array to `*` to represent its path.

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 9, 10, 11

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, .clang-format, CMakeLists.txt, Readme.md)
└── turtle.cpp
```

If the files with assignments are named incorrectly, you will be penalized.

---

## Documentation

* `iostream`: <https://en.cppreference.com/w/cpp/header/iostream>
* `sstream`: <https://en.cppreference.com/w/cpp/header/sstream>
* `cerr`: <https://en.cppreference.com/w/cpp/io/cerr>
* `iomanip`: <https://en.cppreference.com/w/cpp/header/iomanip>
* `cmath`: <https://en.cppreference.com/w/cpp/header/cmath>
* `const`: <https://en.cppreference.com/w/cpp/language/cv.html>
* `constexpr`: <https://en.cppreference.com/w/cpp/language/constexpr.html>
* `math constants`: <https://en.cppreference.com/w/cpp/numeric/constants.html>
* `static_cast`: <https://en.cppreference.com/w/cpp/language/static_cast.html>
* `if`: <https://en.cppreference.com/w/cpp/language/if>
* `operators`: <https://en.cppreference.com/w/cpp/language/operator_precedence>
* `switch`: <https://en.cppreference.com/w/cpp/language/switch>
* `srand`: <https://en.cppreference.com/w/cpp/numeric/random/srand>
* `rand`: <https://en.cppreference.com/w/cpp/numeric/random/rand>
* `cctype`: <https://en.cppreference.com/w/cpp/header/cctype>
* `while`: <https://en.cppreference.com/w/cpp/language/while>
* `do...while`: <https://en.cppreference.com/w/cpp/language/do>
* `for`: <https://en.cppreference.com/w/cpp/language/for>
* `continue`: <https://en.cppreference.com/w/cpp/language/continue>
* `break`: <https://en.cppreference.com/w/cpp/language/break>
* `functions`: <https://en.cppreference.com/w/cpp/language/functions>
* `pointers`: <https://en.cppreference.com/w/cpp/language/pointer>
* `references`: <https://en.cppreference.com/w/cpp/language/reference>
* `arrays`: <https://en.cppreference.com/w/cpp/language/array>
* `struct`: <https://en.cppreference.com/w/c/language/struct>
