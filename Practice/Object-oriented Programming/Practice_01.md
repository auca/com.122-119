Object-oriented Programming, Practice #1
========================================

## Work Organization

Here you can find the required organization of your course directory.

### Example

```
Z:\
|
|--programming02
|----lab01problem01
|----lab01problem02
|----...
|----lab02problem01
|----...
|----uri2936
|----uri2937
|----...
```

## Developer Tools

* [Java Development Kit](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html)
* [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/)

On macOS, to use Processing libraries you have to install and us
[JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
To download JDK 8, you have to create a free Oracle [account](https://oracle.com).

## Problem #1: "Turtle Graphics" (4%)

>The Logo language made the concept of turtle graphics famous. Imagine a
>mechanical turtle that walks around the room under the control of an
>application. The turtle holds a pen in one of two positions up or down. While
>the pen is down, the turtle traces out shapes as it moves, and while the pen is
>up, the turtle moves about freely without writing anything.

— H. M. Deitel

In this problem, you will simulate the operation of the turtle and create a
digital sketchpad. Use a 20-by-20 rectangular 2-D array to represent the field.
Fill it with the character '`.`'. Read commands from the user to the turtle
one by one and execute them. Keep track of the current position of the turtle
and whether the pen is currently up or down. Please assume that the turtle
always starts at the location (0, 0), it looks to the east, and its pen is up.

| Command  | Meaning                  |
| -------: | :----------------------- |
| 1        | Put pen up               |
| 2        | Put pen down             |
| 3        | Turn right               |
| 4        | Turn left                |
| 5 10     | Move forward 10 steps    |
| 6        | Display the field        |
| 7        | Exit from the program.   |

### Example

Suppose that after several commands, the turtle is somewhere near the center of the floor. The following list of commands would draw and display a 12-by-12 square, leaving the pen in the up position:

```
2
5 12
4
5 12
4
5 12
4
5 12
1
6
************........
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
***********T........
....................
....................
....................
....................
....................
....................
....................
7
```

As the turtle moves with the pen down, we set the appropriate elements of array
to '`*`'.

Write an application to implement the 'turtle graphics' capabilities discussed
here in a (!) *procedural style*. Write several 'turtle graphics' lists of
commands to draw interesting shapes.

