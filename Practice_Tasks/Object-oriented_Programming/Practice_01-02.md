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

In this problem, you will simulate the operation of the turtle and create a digital sketchpad. Use a 20-by-20 rectangular 2-D array to represent the field. Fill it with the character '`.`'. Read commands from the user to the turtle one by one and execute them. Keep track of the turtle's current position and whether the pen is currently up or down. Stop when the user types `exit` or triggers the [EOF](https://en.wikipedia.org/wiki/End-of-file) condition on the keyboard. Please assume that the turtle always starts at the location (0, 0), it looks to the right, and its pen is up.

| Command    | Meaning                |
| ---------: | :--------------------- |
| pen-up     | Put pen up             |
| pen-down   | Put pen down           |
| turn-right | Turn the turtle right  |
| turn-left  | Turn the turtle left   |
| move 10    | Move forward 10 steps  |
| display    | Display the field      |
| exit       | Exit from the program. |

#### Example

The following list of commands would draw and display a square, leaving the pen in the up position:

```
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

As the turtle moves with the pen down, we set the appropriate elements of the array to '`*`'.

Write an application to implement the 'turtle graphics' capabilities discussed here in a (!) *procedural style*. Then, test the program by writing several 'turtle graphics' lists of commands to draw interesting shapes.

### Homework

Read Introduction to Java Programming, 10th Edition by Y. Daniel Liang, Chapter 9

### Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
.
└── lab-01
    ├── lab-01.iml
    └── src
        └── Problem01.java
```

If the files with assignments are named differently, you will be penalised.

## Practice #2, Problem #1: "Turtle Graphics, OOP Style" (4%)

Write an application to implement the 'turtle graphics' capabilities discussed here in an (!) *object-oriented programming style*. Design and implement the `Turtle` and `Field` classes. In the main `Problem01` class, instantiate all the objects. Place two turtles on the field and allow the selection of turtle with the command `select <turtle number (1 or 2)>`. One turtle should be placed into the lower right corner of the field. It should look to the left side.

### Example

```
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

Check for incorrect input and use Exceptions to handle input processing errors. You should have one central place to format and print errors to the screen avoiding repetition in code. Use the `NumberFormatException` or `IllegalArgumentException` classes where appropriate (do not create your own). Your program should check at least for the following error conditions:

1. No input (e.g., an empty line with or without whitespaces was provided)

    The message that you must print should be `No commands to execute were provided. Please, try again.`

2. Unknown command

    The message that you must print should be '`Unknown command. Please, try again.`'

3. Incorrect number of arguments for the `select` command

    If the number of arguments is zero, the message must be '`The turtle number was not provided. Please, try again.`'

    If the number of arguments is zero, the message must be '`More arguments than necessary were provided for the "select" command. Please, try again.`'

4. Invalid argument for the `select` command (not a number)

    You must print the message '`The turtle number is not valid. Please, try again.`'

5. And argument out of range for the `select` command (not 1 or 2 for two turtles)

    You must print '`There is no turtle with the number "<the number provided by the user>". Please, try again.`'

6. Incorrect number of arguments for the `move` command

    If the number of arguments is zero, the message must be '`The number of steps was not provided. Please, try again.`'

    If the number of arguments is greater than one, the message must be '`More arguments than necessary were provided for the "move" command. Please, try again.`'

7. Invalid argument for the `move` command (not a number)

    The message that you must print is '`The number of steps is not valid. Please, try again.`'

8. A negative number for the `move` command

    You must print the message '`The number of steps can't be negative. Please, try again.`'

All error conditions listed above must be recoverable. The program must not stop or crash.

All errors must be printed to the STDERR stream (including the '`Please, try again.`' message that must follow the error description on the same line).

The error messages may differ in this requirement document compared to what the instructor demonstrated to you in the class. Consider that the customer has changed one's mind. You must follow the new requirements.

Error handling with Exceptions must also be implemented in the code of Problem #1 of Practice #1. Do not forget to do that.

### Example

Please, note that some empty lines in the example below contain invisible whitespace and tab sequences of characters.

```

No commands to execute were provided. Please, try again.
    
No commands to execute were provided. Please, try again.
			
No commands to execute were provided. Please, try again.
    		
No commands to execute were provided. Please, try again.
not-a-real-command
Unknown command. Please, try again.
not a real command
Unknown command. Please, try again.
not a
Unknown command. Please, try again.
select
The turtle number was not provided. Please, try again.
select    
The turtle number was not provided. Please, try again.
select		
The turtle number was not provided. Please, try again.
select    		
The turtle number was not provided. Please, try again.
select 1 2 3
More arguments than necessary were provided for the "select" command. Please, try again.
select abyrvalg
The turtle number is not valid. Please, try again.
select 42
There is no turtle with the number "42". Please, try again.
move
The number of steps was not provided. Please, try again.
move    
The number of steps was not provided. Please, try again.
move		
The number of steps was not provided. Please, try again.
move    		
The number of steps was not provided. Please, try again.
move 1 2 3
More arguments than necessary were provided for the "move" command. Please, try again.
move -42
The number of steps can't be negative. Please, try again.
move abyrvalg
The number of steps is not valid. Please, try again.
display
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

### Homework

Read Introduction to Java Programming, 10th Edition by Y. Daniel Liang, Chapter 10

### Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
.
└── lab-02
    ├── lab-02.iml
    └── src
        ├── Problem01.java
        ├── Turtle.java
        └── Field.java
```

If the files with assignments are named differently, you will be penalised.
