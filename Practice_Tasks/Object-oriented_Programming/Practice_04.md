Object-oriented Programming, Practice #4
========================================

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git](https://git-scm.com)

## Problem #1: ArrayList from JDK, Part #1

Write a program using the class `java.util.ArrayList`, which reads an unspecified number of integers from the standard input, prints them, reverses them in the `java.util.ArrayList` container in memory in place, and outputs the numbers again. To reverse the container, you must create your method `void reverseNumbers(ArrayList<Integer> numbers)`. You are prohibited from using the `Collections.reverse(...)` from the standard library. Note that input is terminated by the [EOF](https://en.wikipedia.org/wiki/End-of-file) signal issued by the user.

### Example

```
1 2 3 4 5 6 7
^Z
Before reversing:
[1, 2, 3, 4, 5, 6, 7]
After reversing:
[7, 6, 5, 4, 3, 2, 1]
```

## Problem #2: ArrayList from JDK, Part #2

Write a program using the class `java.util.ArrayList`, which reads an unspecified number of integers from the standard input, adds zero before every even number, prints the numbers, removes every odd number, and outputs the numbers again. To add zeros, you must create and use a method `void insertZeroBeforeEven(ArrayList<Integer> numbers)`. To remove odd numbers, you must create another method `void removeOdd(ArrayList<Integer> numbers)`. You are prohibited from using the Java Stream API from the standard library. Note that input is terminated by the [EOF](https://en.wikipedia.org/wiki/End-of-file) signal issued by the user.

### Example

```
2 2 3 4 5 6 7 7 8
^Z
After insertions:
[0, 2, 0, 2, 3, 0, 4, 5, 0, 6, 7, 7, 0, 8]
After deletions:
[0, 2, 0, 2, 0, 4, 0, 6, 0, 8]
```

## Problem #3: ArrayListInt Naive

Create an `ArrayListInt` class similar to `java.util.ArrayList` that supports `int size()`, `int get(int index)`, `void set(int index, int value)`, `void add(int value)`, `void add(int index, int value)`, and `void remove(int index)` operations and works with the primitive `int` type instead of a boxed reference type `Integer`. The addition, insertions, and removal operations must be naive (use the most basic implementation that recreates the whole data container on every request to change the data structure's size). Replace `java.util.ArrayList` with your `ArrayListInt` class in Problems #1 and #2. Ensure you still get correct results in those problems. If you have accomplished this task, Submit Problem #1 and #2 files with your `ArrayListInt` class and not with `java.util.ArrayList`.

## Problem #4: ArrayListInt Optimized

Improve the `ArrayListInt` class by changing the insertion logic to get more space than necessary to lower the frequency of data copying operations. Change the removal operation's logic not to deallocate data containers to make them smaller on every remove request. Benchmark the `java.util.ArrayList` class from JDK and your `ArrayListInt` with the `System.nanoTime()` call. Find which class is faster for a sequence for add, insert, and remove operations for an array of random 10000 elements (add 10000 elements, insert another 10000, remove all the 20000 elements one by one, measure the time to compare).

### Homework

Read Introduction to Java Programming, 12th Edition by Y. Daniel Liang, Chapter 9, 10, 12, Sections 12.1–12.8 (ignore Sections 12.9–12.13)

### Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
.
└── lab-04
    ├── lab-04.iml
    └── src
        ├── Problem01.java
        ├── Problem02.java
        ├── Problem04.java
        └── ArrayListInt.java
```

If the files with assignments are named differently, you will be penalised.
