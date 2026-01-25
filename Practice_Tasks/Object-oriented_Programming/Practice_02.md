Object-oriented Programming, Practice #2
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

---

## Important Notes

The checkpoint will be graded based on your programs' output, the correctness of your repository structure, and the style of your code. You may be penalized and receive a lower grade if your program's output does not exactly match the expected output (wrong letters, extra spaces or newlines, or an incorrectly computed result). Please check your code and output before submitting your work to GitHub or Moodle. Ensure your program's output matches the specified output on this page. Print a `\n` newline after the final line of your program's output. Format real numbers precisely to the number of decimal places specified in the sample output.

Ensure your code style is consistent: indent code properly, separate logical blocks with a blank line, and use variable names that follow a consistent naming style and concisely describe the data they store. The code style for all files must conform to the configuration in `.clang-format`. By default, `.clang-format` is set to the WebKit style; see the [WebKit Code Style Guidelines](https://webkit.org/code-style-guidelines) for details. If you prefer a different style, update `.clang-format` accordingly. Ensure that your source files adhere to the selected style. If you receive the error `The file is not formatted consistently with the '.clang-format' configuration.` from the grader, it means you failed to follow the selected style in the `.clang-format` file. Format your source code manually or use CLion's autoformatting tools. However, we recommend starting with manual formatting to build good programming habits.

Your files and directories must be named according to the requirements outlined at the bottom of this page. Moreover, your repository must not contain extraneous files or unrelated code, especially within the folder designated for lab tasks.

If you are instructed to use a particular function, you must base your solution on that function, even if a better solution exists without it. Use only language facilities that have been discussed during class.

Remember that this requirements document, the grader file, and any requirements mentioned informally by the instructors during lectures or labs are all considered official and must be followed. Failure to do so may result in lost points. Do not assume that the document below is the only set of rules to follow.

To ensure you are aware of all requirements, attend classes regularly and actively engage with your instructors. If you are unsure about the correct approach, visit office hours to clarify expectations and avoid losing points. If you cannot attend office hours, do not hesitate to reach out to your instructors through other means, such as email.

---

## Lab Task

Complete the following programming exercise with your lab instructor or on your own.

### Problem #1: Turtle Graphics, Object-oriented Style

#### Two Turtles

Write an application to implement the same Turtle Graphics program discussed in Practice #1 using an *object-oriented programming* style. Design and implement the `turtle`, `field`, and `cmd` classes (or C++ structs). In the `main` function, instantiate all the objects. Place two turtles on the field and enable the selection of a turtle using the command `select <turtle number (1 or 2)>`. Position the second turtle in the lower right corner of the field, facing the left side. Use instances of the `cmd` class to parse text input in order to extract the command type and its arguments.

##### Example

```
Turtle Graphics
===============
Type your commands (`select <turtle number>`, `pen-up`, `pen-down`, `turn-right`, `turn-left`, `move <steps>`, `display`, `exit`) below.
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

#### Error Handling

Check for incorrect input in the constructor of the `cmd` instances and throw exceptions. There should be one central location in `main` to catch these exceptions. This central location is for formatting and printing errors to the screen, which helps avoid code repetition. Use the `std::invalid_argument` class from the `stdexcept` header where appropriate (do not create your own exception classes yet). Your program should check for at least the following error conditions:

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

All error conditions listed above must be recoverable; the program must not stop or crash. Additionally, all errors must be printed to the `STDERR` stream, including the `Please, try again.` message that must follow the error description on the same line.

##### Example

Please, note that some empty lines in the example below contain invisible whitespace and tab sequences of characters.

```
Turtle Graphics
===============
Type your commands (`select <turtle number>`, `pen-up`, `pen-down`, `turn-right`, `turn-left`, `move <steps>`, `display`, `exit`) below.

    
			
    		
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
. (.idea, .gitignore, .clang-format, CMakeLists.txt, Readme.md)
├── main.cpp
├── cmd.h
├── cmd.cpp
├── field.h
├── field.cpp
├── turtle.h
└── turtle.cpp
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
* `try-block`: <https://en.cppreference.com/w/cpp/language/try>
* `stdexcept`: <https://en.cppreference.com/w/cpp/header/stdexcept>
* `invalid_argument`: <https://en.cppreference.com/w/cpp/error/invalid_argument>
