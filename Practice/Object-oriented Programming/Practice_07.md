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

## Problem #1: "Method Arrays.sort with the Interface Comparable<T>" (1.5%)

Write a program to sort

* An arbitrary array of integer values
* An arbitrary array of `String` values
* An arbitrary array of `BigInteger` values
* An arbitrary array of `Rational` numbers (implement the interface `Comparable` in the class
`Rational` on your own)

...with the method `Arrays.sort` from JDK.

```
1 2 3 5 6 8 9
C C# C++ Java Kotlin Scala
24 32 50
1/3 1/2 2/3 5/7 7/2
```

## Problem #2: "Method Arrays.sort with the Interface Comparator<T>" (1.5%)

Write a program to sort an arbitrary array of students by

* Name (lexicographically)
* GPA (in non-decreasing order)
* Birth year

Use `java.util.Arrays` to sort the data. Create the `Student` class with the
field `name`, `GPA`, and `birthYear`. Create classes `CompareByName` and `CompareByGPA`
implementing the interface `Comparator<T>`. Use a lambda expression to sort students
by their birth year.

```
Student(StudentA, 4.0, 2001)
Student(StudentB, 3.0, 2001)
Student(StudentC, 3.5, 2000)
Student(StudentD, 2.5, 1998)
---
Student(StudentD, 2.5, 1998)
Student(StudentB, 3.0, 2001)
Student(StudentC, 3.5, 2000)
Student(StudentA, 4.0, 2001)
---
Student(StudentD, 2.5, 1998)
Student(StudentC, 3.5, 2000)
Student(StudentB, 3.0, 2001)
Student(StudentA, 4.0, 2001)
```

## Problem #3: "Class MyArrays, interfaces MyComparable, MyComparator" (3.0%)

Write your own class `MyArrays` with a simple implementation of the [insertion sort](https://en.wikipedia.org/wiki/Insertion_sort)
algorithm and interfaces `MyComparable` and `MyComparator.

Sort:

* An arbitrary array of integer values
* An arbitrary array of `Student` values by name (lexicographically)
* An arbitrary array of `Rational` values

```
1 2 4 4 6 8
---
Student(StudentA, 4.0, 2001)
Student(StudentB, 3.0, 2001)
Student(StudentC, 3.5, 2000)
Student(StudentD, 2.5, 1998)
---
1/3 1/2 2/3 5/7 7/2
```
