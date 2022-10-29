Structured Programming, Practice #3
===================================

## Original Requirements

* <https://drive.google.com/file/d/1mzxd2jfdwnszJXnhCVrhSoMpKmRXfC8d/view?usp=sharing>

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before sending it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Do not hesitate to contact your practice instructor on Canvas in the Discussions tab if you have any questions.

Moreover, your repository should not have additional files with unrelated code, especially the folder with lab tasks.

## Problem #1: Absolute Value of a Real Number

Create an application that reads a real number from the standard input and then outputs its absolute value.

### Sample Input and Output

```
some real number? -123.345
|-123.3450| = 123.3450
```

```
some real number? 12.4
|12.4000| = 12.4000
```

## Problem #2: Pass or Fail

Creat an application that reads the total number of points earned by a student in the course 'Intro to Programming' and prints whether a student passed or failed the course (reminder, that anything less than 40% is 'F').

### Sample Input and Output

```
Number of points? 77
You passed “Intro to Programming”!!!
You should take “Object-Oriented Programming” in the next semester
```

```
Number of points? 22
You failed “Intro to Programming”!!!
You can take it again in the fall semester next year.
```

## Problem #3: The Maximum Value between Three Numbers

Create an application that reads three integer numbers from the standard input and finds the greatest value among them.

### Sample Input and Output

```
1st number? 12
2nd number? 7
3rd number? 539
The value 539 is the greatest one.
```

```
1st number? 74
2nd number? 23
3rd number? 23
The value 74 is the greatest one.
```

## Problem #4: Leap Year

Create an application that determines whether a certain year is a leap year or not.

### Test data:

Leap years:
1796, 1804, 1896, 1904, 1992, 1996, 2000, 2004, 2008

Common years:
1799, 1800, 1801, 1802, 1803, 1805, 1899, 1900, 1901

### Sample Input and Output

```
Year? 2000
This is a leap year.
```

```
Year? 1800
This is not a leap year.
```

## Problem #5: Grades

Create a program that for a given grade in points displays the alphabetical grade.

Conversion table:

$90 \leq A \leq 100$

$80 \leq B \lt 90$

$70 \leq C \lt 80$

$60 \leq D \lt 70$

$~~0 \leq F \lt 60$

### Sample Input and Output

```
Number of points? 73
Grade: C
```

```
Number of points? 120
120 is not in the permitted range.
```

## Homework

Read Introduction to Java Programming, 12th Edition by Y. Daniel Liang, Chapter 3

* Do programming exercises from chapter 3:

  1. Exercise 3.1
  2. Exercise 3.5
  3. Exercise 3.8
  4. Exercise 3.17
  5. Exercise 3.22

### Homework Problem #6: Exercise 3.1

### Sample Input and Output

```
Enter a, b, c: 1.0 3 1
The equation has two roots -0.3820 and -2.6180
```

```
Enter a, b, c: 1 2.0 1
The equation has one root -1.0000
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
. (.idea, .gitignore, other lab dirs)
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

If the files with assignments are named differently, you will be penalized.
