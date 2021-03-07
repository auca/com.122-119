Object-oriented Programming, Practice #1, #2
============================================

## Developer Tools

* [Amazon Corretto JDK 8](https://aws.amazon.com/corretto)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git](https://git-scm.com)

## Problem #1: "Turtle Graphics, Procedural Style" (4%)

>The Logo language made the concept of turtle graphics famous. Imagine a
>mechanical turtle that walks around the room under the control of an
>application. The turtle holds a pen in one of two positions up or down. While
>the pen is down, the turtle traces out shapes as it moves, and while the pen is
>up, the turtle moves about freely without writing anything.

— H. M. Deitel

In this problem, you will simulate the operation of the turtle and create a
digital sketchpad. Use a 20-by-20 rectangular 2-D array to represent the field.
Fill it with the character '`.`'. Read commands from the user to the turtle one
by one and execute them. Keep track of the current position of the turtle and
whether the pen is currently up or down. Assume that the turtle always starts at
the location (0, 0), it looks to the right, and its pen is up.

| Command   | Meaning                |
| --------: | :--------------------- |
| PenUp     | Put pen up             |
| PenDown   | Put pen down           |
| TurnRight | Turn right             |
| TurnLeft  | Turn left              |
| Move 10   | Move forward 10 steps  |
| Display   | Display the field      |
| Exit      | Exit from the program. |

### Example

Suppose that after several commands, the turtle is somewhere near the center of
the floor. The following list of commands would draw and display a 12-by-12
square, leaving the pen in the up position:

```
PenDown
Move 12
TurnRight
Move 12
TurnRight
Move 12
TurnRight
Move 12
PenUp
Display
T***********........
*..........*........
*..........*........
*..........*........
*..........*........
*..........*........
*..........*........
*..........*........
*..........*........
*..........*........
*..........*........
*..........*........
************........
....................
....................
....................
....................
....................
....................
....................
Exit
```

As the turtle moves with the pen down, we set the appropriate elements of array
to '`*`'.

Write an application to implement the 'turtle graphics' capabilities discussed
here in a (!) *procedural style*. Write several 'turtle graphics' lists of
commands to draw interesting shapes.

### Practice 2

## Problem #1: "Turtle Graphics, OOP Style" (4%)

Write an application to implement the 'turtle graphics' capabilities discussed
here in an (!) *object-oriented programming style*.

Check for incorrect input and use Exceptions to handle input processing errors.
