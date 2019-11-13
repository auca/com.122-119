Structured Programming, Practice #3
===================================

## Work Organization

Here you can find the required organization of your course directory.

### Example

```
F:\
|
|--programming01
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

## Problem #1: "Absolute Value of Real Number" (0.4%)

The application reads a real number from the standard input and then outputs its absolute
value.

### Sample Input and Output

```
some real number? -123.345
|-123.345| = 123.345
```

```
some real number? 12.4
|12.4| = 12.4
```

## Problem #2: "Passed or Not" (0.4%)

The application reads the total number of points earned by a student in the course "Structured
Programming" and prints whether a student passed or failed this course.

### Sample Input and Output

```
Number of points? 77
You passed “Structured Programming”!!!
You should take “Object-Oriented Programming” in the next semester
```

```
Number of points? 22
You failed “Structured Programming”!!!
You can take it again in the fall semester of 2019.
```

## Problem #3: "The Maximum Value between Three Numbers" (0.4%)

The application reads three integer numbers from the standard input and finds the greatest
value between all of them.

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

## Problem #4: "Leap Year" (0.4%)

The application determines whether a certain year is a leap year.

Test data:

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

## Problem #5: "Grades" (0.4%)

For a given grade in points (or percent), the application should give all possible alphabetical
grades.

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
Number of points? 73
Grade: C
```

```
Number of points? 120
120 is not in the permitted range.
```

## Problem #6: "Dangerous comparison of double values" (0.4%)

Create variable `result` of the data type double and assign to it the value 0. Then add 0.1 to it 10 times. Compare the result with 1.0. If the numbers are equal, print "Equal". Otherwise, print "Not equal". Explain the result.

## Problem #7: "Season Name (If-Else If)" (0.4%)

The application determines a season name by a given month number. Use `if-else if` construct to solve the task.

### Sample Input and Output

```
Enter the month number: 12
Winter
```

```
Enter the month number: 3
spring
```

```
Enter the month number: 100
Invalid month number.
```

## Problem #7: "Season Name (Switch-Case)" (0.4%)

Redo the previous solution by using the `switch-case` construct.

## Task #5: "Number of Days" (0.4%)
