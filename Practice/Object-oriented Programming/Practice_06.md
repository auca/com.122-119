Object-oriented Programming, Practice #6
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

On macOS, to use Processing libraries you have to install and use
[JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
To download JDK 8, you have to create a free Oracle [account](https://oracle.com).

## Problem #1: "Prototype v0.1 of a Graphics Editor" (0.5%)

This console program has to emulate important parts of a vector graphics editor:
a user can right-click on some shape to see its properties.

This simple prototype has to create several rectangles with arbitrary coordinates
and size and read sequences of `x`, `y` integer numbers (mouse coordinates). If some
rectangle contains the point with entered coordinates program has to show
properties of that figure. Coordinates (-1, 1) signal the end of the input.

```
x: 100
y: 100
Rect: 10, 10, 100, 100
x: 1000
y: 1000
x: 450
y: 450
Rect: 400, 400, 100, 100
x: -1
y: -1
```

## Problem #2: "Prototype v0.2" (1.0%)

Add several circles to the previous prototype. This version has to have unrelated
classes:

* Rect
* Circle

Explain disadvantages of this version.

```
x: 30
y: 30
Rect: 10, 10, 100, 100
x: 500
y: 15
Circle: 500, 10, 100
x: 420
y: 410
Rect: 400, 400, 100, 100
x: 850
y: 850
Circle: 800, 800, 100
x: -1
y: -1
```

## Problem #3: "Prototype v0.3" (1.5%)

Improve the structure of the previous prototype by introducing the hierarchy of classes.
The root of this hierarchy is an abstract class `Shape` with common properties and methods of
the classes `Rect` and `Circle`. The classes `Rect` and `Circle` must be subclasses of the
class Shape.

## Problem #4: "Prototype v0.4" (2.5%)

Add commands “click”, “move”, “present” to the previous prototype. Add a new shape
`Cross` (two rectangles crossed).

```
cmd: click
x: 20
y: 20
Rect: 10, 10, 100, 100
cmd: showAll
Rect: 10, 10, 100, 100
Rect: 400, 400, 100, 100
Circle: 500, 10, 100
Circle: 800, 800, 100
Cross: (Rect: 195, 575, 10, 50), (Rect: 175, 595, 50, 10)
cmd: move
x1: 510
y1: 20
x2: 600
y2: 100
cmd: showAll
Rect: 10, 10, 100, 100
Rect: 400, 400, 100, 100
Circle: 590, 90, 100
Circle: 800, 800, 100
Cross: (Rect: 195, 575, 10, 50), (Rect: 175, 595, 50, 10)
cmd: stop
```

## Problem #5: "The Final Program" (3.5%)

Create a simple vector graphics editor:

* The editor can create shapes of three types: Rectangles, Circles, Crosses
* Left clicks on a shape selects the shape.

* Right click on a shape selects the shape and shows the dialog window with the selected figure’s properties.
* The `Del` key removes the selected shape.
* It is possible to move shapes with the mouse (dragging).

[Editor](https://i.imgur.com/ctRNEMU.png)
