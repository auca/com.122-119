Object-oriented Programming, Practice #4
========================================

## Developer Tools

* [Amazon Corretto JDK 8](https://aws.amazon.com/corretto)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git](https://git-scm.com)

## Problem #1: "ArrayList from JDK 1" (1%)

Write a program using the class `java.util.ArrayList` which reads an unknown
amount of integer numbers from the standard input; prints them, reverses and
prints them again.  You have to use an object of type `ArrayList<Integer>` to
store and reverse list of integer numbers entered by the user.

### Example

```
1 2 3 4 5 6 7
^Z
Before reversing:
[1, 2, 3, 4, 5, 6, 7]
After reversing:
[7, 6, 5, 4, 3, 2, 1]
```

## Problem #2: "ArrayList from JDK 2" (1%)

Write a program using the class `java.util.ArrayList` which reads an unknown
amount of integer numbers from the standard input; inserts value 0 before each
even number in the list; prints the content of the list; removes all odd values;
prints content of the list again. You have to use an object of type
`ArrayList<Integer>` to work with integer numbers entered by the user.

### Example

```
2 2 3 4 5 6 7 7 8
^Z
After insertions:
[0, 2, 0, 2, 3, 0, 4, 5, 0, 6, 7, 7, 0, 8]
After deletions:
[0, 2, 0, 2, 0, 4, 0, 6, 0, 8]
```

## Problem #3: "ArrayListInt Naive" (1%)

Create an `ArrayListInt` class similar to `java.util.ArrayList` that supports
`int size()`, `int get(int index)`, `void set(int index, int value)`, `void
add(int value)`, `void add(int index, int value)`, and `void remove(int index)`
operations and works with the primitive `int` type instead of a boxed reference
type `Integer`. The addition, insertions, and removal operations must be naive
(use the most basic implementation that recreates the whole data container on
every request to change the data structure's size). Use your own `ArrayListInt`
in Problem 1 and 2.

## Problem #4: "ArrayListInt Optimized" (1%)

Improve the `ArrayListInt` class by changing the allocation logic to get more
space than necessary to lower the frequency of data copying operations. Change
the removal operation's logic not to deallocate data containers to make them
smaller on every remove request. Benchmark the `java.util.ArrayList` class from
JDK and your `ArrayListInt` with the `System.nanoTime()` call. Find which class
is faster for a sequence for add, insert, and remove operations for an array of
random 10000 elements (add 10000 elements, insert another 10000, remove all the
20000 elements one by one, measure the time to compare).
