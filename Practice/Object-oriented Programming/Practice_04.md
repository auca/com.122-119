Object-oriented Programming, Practice #4
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

## Problem #1: "ArrayList from JDK 1" (2%)

Write a program using the class `java.util.ArrayList` which reads an unknown amount of
integer numbers from the standard input; prints them, reverses and prints them again.
You have to use an object of type `ArrayList<Integer>` to store and reverse list of
integer numbers entered by the user.

```
1 2 3 4 5 6 7
^Z
Before reversing:
[1,2,3,4,5,6,7]
After reversing:
[7,6,5,4,3,2,1]
```

## Problem #2: "ArrayList from JDK 2" (2%)

Write a program using the class `java.util.ArrayList` which reads an unknown amount of
integer numbers from the standard input; inserts value 0 before each even number in
the list; prints the content of the list; removes all odd values; prints content of the list
again. You have to use an object of type `ArrayList<Integer>` to work with integer numbers
entered by the user.

```
2 2 3 4 5 6 7 7 8
^Z
After insertions:
[0,2,0,2,3,0,4,5,0,6,7,7,0,8]
After deletions:
[0,2,0,2,0,4,0,6,0,8]
```
