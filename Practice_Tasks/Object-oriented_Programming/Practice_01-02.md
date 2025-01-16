Object-oriented Programming, Practice #1
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

---

## Important Notes

The checkpoint will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Moodle. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor if you have any questions.

---

## Practice #1, Problem #1: Turtle Graphics, Procedural Style

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

### Example

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
. (.idea, .gitignore, CMakeLists.txt, Readme.md)
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
* `cctype`: <https://en.cppreference.com/w/cpp/header/cctype>
* `operators`: <https://en.cppreference.com/w/cpp/language/operator_precedence>
* `if`: <https://en.cppreference.com/w/cpp/language/if>
* `switch`: <https://en.cppreference.com/w/cpp/language/switch>
* `srand`: <https://en.cppreference.com/w/cpp/numeric/random/srand>
* `rand`: <https://en.cppreference.com/w/cpp/numeric/random/rand>
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

---

## Practice #2, Problem #1: Turtle Graphics, OOP Style

Write an application to implement the same Turtle Graphics program discussed here using an *object-oriented programming* style. Design and implement the `turtle`, `field`, and `cmd` classes. In the `main` function, instantiate all the objects. Place two turtles on the field and enable the selection of a turtle using the command `select <turtle number (1 or 2)>`. Position one turtle in the lower right corner of the field, facing the left side. Use instances of the `cmd` class to parse text input in order to extract the command type and its arguments.

### Example

```
Turtle Graphics
===============
Type your commands (`select <turtle num>`, `pen-up`, `pen-down`, `turn-right`, `turn-left`, `move <n>`, `display`, `exit`) below.
move 1
turn-right
move 1
turn-left
pen-down
move 17
select 2
move 10
turn-right
move 1
pen-down
move 16
display
....................
.*****************T.
.........T..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
.........*..........
....................
exit
```

### Error Handling

Check for incorrect input in the constructor of the `cmd` instances and throw exceptions. There should be one central location in `main` to catch these exceptions. This central location is for formatting and printing errors to the screen, which helps avoid code repetition. Use the `std::runtime_error` class from the `stdexcept` header where appropriate (do not create your own exception classes yet). Your program should check for at least the following error conditions:

1. No input (e.g., an empty line with or without whitespaces was provided)

    The message that you must print should be `No commands to execute were provided. Please, try again.`

2. Unknown command

    The message that you must print should be `Unknown command. Please, try again.`

3. Incorrect number of arguments for the `select` command

    If the number of arguments is zero, the message must be `The turtle number was not provided. Please, try again.`

    If the number of arguments is greater than one, the message must be `More arguments than necessary were provided for the "select" command. Please, try again.`

4. Invalid argument for the `select` command (not a number)

    You must print the message `The turtle number is not valid. Please, try again.`

5. Argument out of range for the `select` command (not 1 or 2 for two turtles)

    You must print `There is no turtle with the number "<the number provided by the user>". Please, try again.`

6. Incorrect number of arguments for the `move` command

    If the number of arguments is zero, the message must be `The number of steps was not provided. Please, try again.`

    If the number of arguments is greater than one, the message must be `More arguments than necessary were provided for the "move" command. Please, try again.`

7. Invalid argument for the `move` command (not a number)

    The message that you must print is `The number of steps is not valid. Please, try again.`

8. A negative number for the `move` command

    You must print the message `The number of steps can't be negative. Please, try again.`

All error conditions listed above must be recoverable; the program must not stop or crash. Additionally, all errors must be printed to the STDERR stream, including the `Please, try again.` message that must follow the error description on the same line.

### Example

Please, note that some empty lines in the example below contain invisible whitespace and tab sequences of characters.

```
Turtle Graphics
===============
Type your commands (`select <turtle num>`, `pen-up`, `pen-down`, `turn-right`, `turn-left`, `move <n>`, `display`, `exit`) below.

    
			
    		
not-a-real-command
not a real command
not a
select
select    
select		
select    		
select 1 2 3
select abyrvalg
select 42
move
move    
move		
move    		
move 1 2 3
move -42
move abyrvalg
display
No commands to execute were provided. Please, try again.
No commands to execute were provided. Please, try again.
No commands to execute were provided. Please, try again.
No commands to execute were provided. Please, try again.
Unknown command. Please, try again.
Unknown command. Please, try again.
Unknown command. Please, try again.
The turtle number was not provided. Please, try again.
The turtle number was not provided. Please, try again.
The turtle number was not provided. Please, try again.
The turtle number was not provided. Please, try again.
More arguments than necessary were provided for the "select" command. Please, try again.
The turtle number is not valid. Please, try again.
There is no turtle with the number "42". Please, try again.
The number of steps was not provided. Please, try again.
The number of steps was not provided. Please, try again.
The number of steps was not provided. Please, try again.
The number of steps was not provided. Please, try again.
More arguments than necessary were provided for the "move" command. Please, try again.
The number of steps can't be negative. Please, try again.
The number of steps is not valid. Please, try again.
T...................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
...................T
exit
```

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 9, 10, 11

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, Readme.md)
├── field.h
├── field.cpp
├── turtle.h
├── turtle.cpp
├── cmd.h
├── cmd.cpp
└── main.cpp
```

If the files with assignments are named incorrectly, you will be penalized.

---

## Documentation

* `class`: <https://en.cppreference.com/w/cpp/language/class>
* `constructor`: <https://en.cppreference.com/w/cpp/language/constructor>
* `this`: <https://en.cppreference.com/w/cpp/language/this>
* `access-specifier`: <https://en.cppreference.com/w/cpp/language/access>
* `static`: <https://en.cppreference.com/w/cpp/language/static>
* `throw`: <https://en.cppreference.com/w/cpp/language/throw>
* `try-block`: <https://en.cppreference.com/w/cpp/language/try_catch>
* `stdexcept`: <https://en.cppreference.com/w/cpp/header/stdexcept>
* `runtime_error`: <https://en.cppreference.com/w/cpp/error/runtime_error>
