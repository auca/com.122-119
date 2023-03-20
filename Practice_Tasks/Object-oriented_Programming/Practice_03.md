Object-oriented Programming, Practice #3
========================================

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git](https://git-scm.com)

## Problem #1: A Calculator of Rational Numbers

Create an application that can help users do arithmetic operations (addition, subtraction, multiplication, division, and comparisons) with rational numbers. Users may enter the first fraction, an operator (`+`, `-`, `*`, `/`, `<`, `>`, `=`, `!=`, `<=`, `>=`), and the second fraction. The application should calculate the final result and print it to the screen. If the input is invalid, the application should print an appropriate error and continue working.

### Example

```
Calculator of Rational Numbers
==============================
Press Ctrl-Z/D to exit

First rational: 1/2
Operator: +
Second rational: 2/3
Result: 1/2 + 2/3: 7/6

First rational: 1/2
Operator: >
Second rational: 2/3
Result: 1/2 > 2/3: false

First rational: one
Error: Can't parse 'one' as input.

First rational: 1/0
Error: The denominator can't be equal to zero.

First rational: 1/2
Operator: 42
Error: '42' is not a valid operator.
Operator: ^Z
```

Your application has to check all the data it gets from the user carefully and
in cases of incorrect user input it has to print appropriate error messages.
User should be able to stop the application by pressing the Ctrl-Z (or Ctrl-D in
Linux) key combination.

In this program you have to develop a class Rational to represent rational
numbers.  Objects of this class (variables of this type) must support the
following methods:

| Method                                   | Meaning                                                                                                      |
| ---------------------------------------: | :----------------------------------------------------------------------------------------------------------- |
| Rational(int numerator, int denominator) | Creates a rational number. Throws an Exception if `den` is equal to 0.                                       |
| Rational add(Rational other)             | Returns the result of addition                                                                               |
| Rational subtract(Rational other)        | Returns the result of subtraction                                                                            |
| Rational multiply(Rational other)        | Returns the result of multiplication                                                                         |
| Rational divide(Rational other)          | Returns the result of division                                                                               |
| int compareTo(Rational other)            | Returns any negative integer if a < b, returns any positive if a > b, returns 0 if both are equal            |
| String toString()                        | Returns a string representatin in the format `numerator/denominator`                                         |
| static Rational parseRational(String s)  | Creates a new rational number from string. Throws Exceptions if the string does not contain a valid rational |

Objects of class Rational must be always in reduced form. Keep the sign of the
number in its numerator. Develop inner (private) methods to reduce rationals and
to find the greatest common divisor of numerator and denominator. Try to also
check all possible errors in the user's input

Use the Euclidean Algorithm to find the GCD:

```
gcd(a, b):
    if a = 0:
        return b
    if b = 0:
        return a
    if a < 0:
        a := -a
    if b < 0:
        b := -b
    if a < b:
        t := a
        a := b
        b := t

    while b ≠ 0:
        t := b
        b := a mod b
        a := t

    return a
```

## Problem #2: BigRational

Create a version of the `Rational` class called `BigRational` that supports computations with arbitrary precision numbers (use the class `java.math.BigInteger`). Use the `gcd` [method](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/math/BigInteger.html#gcd(java.math.BigInteger)) from the `BigInteger` class. Copy the `Problem01.java` code to a new file `Problem02.java` and change it to work with the `BigRational` class.

### Homework

Read Introduction to Java Programming, 12th Edition by Y. Daniel Liang, Chapter 12, Sections 12.1–12.8 (ignore Sections 12.9–12.13)

### Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
.
└── lab-03
    ├── lab-03.iml
    └── src
        ├── Problem01.java
        ├── Problem02.java
        ├── Rational.java
        ├── BigRational.java
        └── MyCommonMath.java
```

If the files with assignments are named differently, you will be penalised.
