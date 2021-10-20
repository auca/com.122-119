Structured Programming, Practice #2
===================================

## Developer Tools

* [Amazon Corretto JDK 8](https://aws.amazon.com/corretto)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git](https://git-scm.com)

## NOTE

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before committing it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Don't hesitate to contact TA (teacher assistant) on Canvas in the Discussions tab if you have any questions.

Moreover, your repository, especially the folder with lab tasks, should not have additional files with unrelated code.

## Problem #1: "Swap Two Numbers" (0.4%)

Declare two integer variables (a and b), initialize them with values derived from the user input, and
swap the values between these two variables.

### Sample Input and Output

```
Enter the 1st value: 2
Enter the 2nd value: 3
Before swapping: a = 2; b = 3;
After swapping: a = 3; b = 2;
```

## Problem #2: "Swap Without Temporary Variables" (0.4%)

Declare two integer variables (a and b), initialize them with values derived from the user input, and
swap the values between these two variables. In this task, it is prohibited to use temporary variables.

### Sample Input and Output

```
Enter the 1st value: 2
Enter the 2nd value: 3
Before swapping: a = 2; b = 3;
After swapping: a = 3; b = 2;
```

## Problem #3: "Sum of Digits" (0.4%)

Read a four-digit integer from the standard input and find the sum of all its digits.

### Sample Input and Output

```
Enter a four-digit integer: 1237
The sum of all digits is 13
```

## Problem #4: "Inches to Centimeters Conversion" (0.4%)

Create an application that converts a specific value consumed from the standard input
from inches to centimeters. Note that 1 in. = 2.54 cm.

### Sample Input and Output

```
Enter the length in inches: 17
17.00 in. = 43.18 cm.
```

## Problem #5: "Fahrenheit to Celsius Conversion" (0.4%)

Create an application that implements a simple Fahrenheit to Celsius convertor. Note 
that °C = 5⁄9 × (°F − 32). 

### Sample Input and Output

```
Enter temperature in degrees Fahrenheit: 114
The temperature in degrees Celsius is 45.56
```

## Homework

Read Introduction to Java Programming, 10th Edition by Y. Daniel Liang, Chapter 2

* Do programming exercises from chapter 2:
  1. 2.1 (0.4%)
  2. 2.2 (0.4%)
  3. 2.4 (0.4%)
  4. 2.7 (0.4%)
  5. 2.11 (0.4%)

### Homework Problem #6: Exercise 2.1

### Sample Input and Output

```
Enter a degree in Celsius: 43
43 Celsius is 109.4 Fahrenheit
```

### Homework Problem #7: Exercise 2.2

### Sample Input and Output

```
Enter the radius and length of a cylinder: 5.5 12
The area is 95.0331
The volume is 1140.4
```

### Homework Problem #8: Exercise 2.4

### Sample Input and Output

```
Enter a number in pounds: 55.5
55.5 pounds is 25.197 kilograms
```

### Homework Problem #9: Exercise 2.7

### Sample Input and Output

```
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
```

### Homework Problem #10: Exercise 2.11

### Sample Input and Output

Use `Math.round` to round calculations performed
with `double` values.

```
Enter the number of years: 5
The population in 5 years is 325932970
```

## Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
.
└── lab-02
    ├── lab-02.iml
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
