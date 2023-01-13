Object-oriented Programming, Practice #7
========================================

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git](https://git-scm.com)

## Problem #1: "Method Arrays.sort with the Interface Comparable<T>" (1%)

Write a program to sort

* An arbitrary array of integer values
* An arbitrary array of `String` values
* An arbitrary array of `BigInteger` values
* An arbitrary array of `Rational` numbers (implement the interface `Comparable`
in the class `Rational` on your own, use the non-generic version instead of the
one used in the class recording (`Comparable` and not `Comparable<T>`) to make
it work with interfaces in the last problem)

...with the method `Arrays.sort` from JDK.

For the given data in `main`

```java
int[] integers = {
    8, 2, 6, 5, 1, 9, 3
};

// ...

String[] strings = {
    "Java", "C++", "Kotlin", "C#", "Scala", "C"
};

// ...

BigInteger[] bigIntegers = {
    new BigInteger("3874357438573487"),
    new BigInteger("-587485748753874357438573487"),
    new BigInteger("758437584756847534785983749587439587398457"),
    new BigInteger("938493849839584758475847")
};

// ...

BigRational[] rationals = {
    BigRational.parseBigRational("5/7"),
    BigRational.parseBigRational("1/2"),
    BigRational.parseBigRational("7/2"),
    BigRational.parseBigRational("1/3")
};

// ...
```

Your program should generate the following output

```
Sorting integers
Before:
[8, 2, 6, 5, 1, 9, 3]
After:
[1, 2, 3, 5, 6, 8, 9]

Sorting strings
Before:
[Java, C++, Kotlin, C#, Scala, C]
After:
[C, C#, C++, Java, Kotlin, Scala]

Sorting big integers
Before:
[3874357438573487, -587485748753874357438573487, 758437584756847534785983749587439587398457, 938493849839584758475847]
After:
[-587485748753874357438573487, 3874357438573487, 938493849839584758475847, 758437584756847534785983749587439587398457]

Sorting rationals
Before:
[5/7, 1/2, 7/2, 1/3]
After:
[1/3, 1/2, 5/7, 7/2]
```

## Problem #2: "Method Arrays.sort with the Interface Comparator<T>" (1%)

Write a program to sort an arbitrary array of students by

* Name (lexicographically)
* GPA (in non-decreasing order)
* Birth year

Use `java.util.Arrays` to sort the data. Create the `Student` class with the
field `name`, `GPA`, and `birthYear`. Create classes `CompareByName` and `CompareByGPA`
implementing the interface `Comparator<T>`. Replace all of them with lambda expressions
at the end.

For the given data in `main`

```java
Student[] students = {
    new Student("StudentD", 2.5, 1998),
    new Student("StudentA", 4.0, 2001),
    new Student("StudentB", 3.0, 2001),
    new Student("StudentC", 3.5, 2000)
};

// ...
```

Your program should generate the following output

```
Sorting students by name
Before:
[Student{name='StudentD', GPA=2.5, birthYear=1998}, Student{name='StudentA', GPA=4.0, birthYear=2001}, Student{name='StudentB', GPA=3.0, birthYear=2001}, Student{name='StudentC', GPA=3.5, birthYear=2000}]
After:
[Student{name='StudentA', GPA=4.0, birthYear=2001}, Student{name='StudentB', GPA=3.0, birthYear=2001}, Student{name='StudentC', GPA=3.5, birthYear=2000}, Student{name='StudentD', GPA=2.5, birthYear=1998}]

Sorting students by GPA
Before:
[Student{name='StudentA', GPA=4.0, birthYear=2001}, Student{name='StudentB', GPA=3.0, birthYear=2001}, Student{name='StudentC', GPA=3.5, birthYear=2000}, Student{name='StudentD', GPA=2.5, birthYear=1998}]
After:
[Student{name='StudentD', GPA=2.5, birthYear=1998}, Student{name='StudentB', GPA=3.0, birthYear=2001}, Student{name='StudentC', GPA=3.5, birthYear=2000}, Student{name='StudentA', GPA=4.0, birthYear=2001}]

Sorting students by birth year
Before:
[Student{name='StudentD', GPA=2.5, birthYear=1998}, Student{name='StudentB', GPA=3.0, birthYear=2001}, Student{name='StudentC', GPA=3.5, birthYear=2000}, Student{name='StudentA', GPA=4.0, birthYear=2001}]
After:
[Student{name='StudentD', GPA=2.5, birthYear=1998}, Student{name='StudentC', GPA=3.5, birthYear=2000}, Student{name='StudentB', GPA=3.0, birthYear=2001}, Student{name='StudentA', GPA=4.0, birthYear=2001}]
```

## Problem #3: "Class MyArrays, interfaces MyComparable, MyComparator" (2%)

Write your own class `MyArrays` with a simple implementation of the selection sort
algorithm and interfaces `MyComparable` and `MyComparator`.

Sort:

* An arbitrary array of integer values
* An arbitrary array of `Student` values by name (lexicographically)
* An arbitrary array of `Rational` values

For the given data in `main`

```java
int[] integers = {
    8, 2, 6, 5, 1, 9, 3
};

// ...

Student[] students = {
    new Student("StudentD", 2.5, 1998),
    new Student("StudentA", 4.0, 2001),
    new Student("StudentB", 3.0, 2001),
    new Student("StudentC", 3.5, 2000)
};

// ...

BigRational[] rationals = {
    BigRational.parseBigRational("5/7"),
    BigRational.parseBigRational("1/2"),
    BigRational.parseBigRational("7/2"),
    BigRational.parseBigRational("1/3")
};
```

Your program should generate the following output

```
Sorting integers
Before:
[8, 2, 6, 5, 1, 9, 3]
After:
[1, 2, 3, 5, 6, 8, 9]

Sorting students by name
Before:
[Student{name='StudentD', GPA=2.5, birthYear=1998}, Student{name='StudentA', GPA=4.0, birthYear=2001}, Student{name='StudentB', GPA=3.0, birthYear=2001}, Student{name='StudentC', GPA=3.5, birthYear=2000}]
After:
[Student{name='StudentA', GPA=4.0, birthYear=2001}, Student{name='StudentB', GPA=3.0, birthYear=2001}, Student{name='StudentC', GPA=3.5, birthYear=2000}, Student{name='StudentD', GPA=2.5, birthYear=1998}]

Sorting rationals
Before:
[5/7, 1/2, 7/2, 1/3]
After:
[1/3, 1/2, 5/7, 7/2]
```
