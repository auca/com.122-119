Object-oriented Programming, Practice #1, #2
============================================

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git](https://git-scm.com)

## Practice #1, Problem #1: "Turtle Graphics, Procedural Style" (4%)

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

| Command    | Meaning                |
| ---------: | :--------------------- |
| pen-up     | Put pen up             |
| pen-down   | Put pen down           |
| turn-right | Turn the turtle right  |
| turn-left  | Turn the turtle left   |
| move 10    | Move forward 10 steps  |
| display    | Display the field      |
| exit       | Exit from the program. |

### Example

Suppose that after several commands, the turtle is somewhere near the center of
the floor. The following list of commands would draw and display a 12-by-12
square, leaving the pen in the up position:

```
pen-down
move 12
turn-right
move 12
turn-right
move 12
turn-right
move 12
pen-up
display
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
exit
```

As the turtle moves with the pen down, we set the appropriate elements of array
to '`*`'.

Write an application to implement the 'turtle graphics' capabilities discussed
here in a (!) *procedural style*. Write several 'turtle graphics' lists of
commands to draw interesting shapes.

## Practice #2, Problem #1: "Turtle Graphics, OOP Style" (4%)

Write an application to implement the 'turtle graphics' capabilities discussed
here in an (!) *object-oriented programming style*.

Check for incorrect input and use Exceptions to handle input processing errors.
