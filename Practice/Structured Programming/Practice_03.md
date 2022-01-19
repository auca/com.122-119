Structured Programming, Practice #3
===================================

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before committing it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Don't hesitate to contact TA (teacher assistant) on Canvas in the Discussions tab if you have any questions.

Moreover, your repository, especially the folder with lab tasks, should not have additional files with unrelated code.

## Problem #1: "Absolute Value of Real Number" (0.4%)

The application reads a real number from the standard input and then outputs its absolute value.

### Sample Input and Output

```
Enter a real number: -123.345
|-123.345| = 123.345
```

```
Enter a real number: 12.400
|12.400| = 12.400
```

## Problem #2: "Even or Odd" (0.4%)

The application reads one integer number from the user and determines whether it is odd or even.

### Sample Input and Output

```
Enter the number: 3
The number 3 is odd.
```

```
Enter the number: 4
The number 4 is even.
```

## Problem #3: "Comparison" (0.4%)

The application reads two integer numbers from the standard input and finds the greatest
value between all of them.

### Sample Input and Output

```
Enter the first number: 20
Enter the second number: 10
The first number 20 is greater than the second number 10.
```

```
Enter the first number: 10
Enter the second number: 20
The second number 20 is greater than the first number 10.
```

```
Enter the first number: 10
Enter the second number: 10
Both numbers are equal.
```

## Problem #4: "Leap Year" (0.4%)

The application determines whether a certain year is a leap year.

### Test data:

Leap years:
1796, 1804, 1896, 1904, 1992, 1996, 2000, 2004, 2008

Common years:
1799, 1800, 1801, 1802, 1803, 1805, 1899, 1900, 1901

### Sample Input and Output

```
Enter the year: 2000
This is a leap year.
```

```
Enter the year: 1800
This is not a leap year.
```

## Problem #5: "Grades" (0.4%)

For a given grade in points (or percent), the application should give all possible alphabetical grades.

Conversion table:

```
90 <= A <= 100
80 <= B < 90
70 <= C < 80
60 <= D < 70
Below 60: F
```

### Sample Input and Output

```
Enter the number of points? 73
Grade: C
```

```
Enter the number of points? 120
120 is not in the permitted range.
```

## Homework

Read Introduction to Java Programming, 10th Edition by Y. Daniel Liang, Chapter 3

* Do programming exercises from chapter 3:
  1. 3.1 (0.4%)
  2. 3.5 (0.4%)
  3. 3.8 (0.4%)
  4. 3.17 (0.4%)
  5. 3.22 (0.4%)

### Homework Problem #6: Exercise 3.1

### Sample Input and Output

```
Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and -2.61803
```

```
Enter a, b, c: 1 2.0 1
The equation has one root -1
```

```
Enter a, b, c: 1 2 3
The equation has no real roots
```

### Homework Problem #7: Exercise 3.5

### Sample Input and Output

```
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
```

```
Enter today's day: 0
Enter the number of days elapsed since today: 31
Today is Sunday and the future day is Wednesday
```

### Homework Problem #8: Exercise 3.8

### Sample Input and Output

```
Enter three integer numbers: 5 2 10
2
5
10
```

### Homework Problem #9: Exercise 3.17

### Sample Input and Output

```
scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won
```

```
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw
```

### Homework Problem #10: Exercise 3.22

### Sample Input and Output

```
Enter a point with two coordinates: 4 5
Point (4.0, 5.0) is in the circle
```

```
Enter a point with two coordinates: 9 9
Point (9.0, 9.0) is not in the circle
```

## Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
.
└── lab-03
    ├── lab-03.iml
    └── src
        ├── Problem01.java
        ├── Problem02.java
        ├── Problem03.java
        ├── Problem04.java
        ├── Problem05.java
        ├── Problem06.java
        ├── Problem07.java
        ├── Problem08.java
        ├── Problem09.java
        └── Problem10.java
```

If the files with assignments are named differently, you will be penalised.
