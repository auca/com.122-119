Object-oriented Programming, Practice #4
========================================

## Developer Tools

* [Amazon Corretto JDK 8](https://aws.amazon.com/corretto)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git](https://git-scm.com)

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
