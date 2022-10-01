Structured Programming, Practice #2
===================================

## Original Requirements

* <https://drive.google.com/file/d/1xCNjVHJ1JQ7U8U1KLlv-cJt27pBiM9I9/view?usp=sharing>

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before sending it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Do not hesitate to contact your practice instructor on Canvas in the Discussions tab if you have any questions.

Moreover, your repository should not have additional files with unrelated code, especially the folder with lab tasks.

## Problem #1: Swap Two Numbers

Declare two integer variables `a` and `b` and initialize them with values provided by the user. Print both variables, swap their values, and print the variables again.

### Sample Input and Output

```
1st value? 2
2nd value? 3
Before swapping: a = 2; b = 3;
After swapping: a = 3; b = 2;
```

## Problem #2: Swap Two Numbers Without Temporary Variables

Declare two integer variables `a` and `b` and initialize them with values provided by the user. Print both variables, swap their values, and print the variables again. In this task, it is prohibited to use temporary variables.

### Sample Input and Output

```
1st value? 2
2nd value? 3
Before swapping: a = 2; b = 3;
After swapping: a = 3; b = 2;
```

## Problem #3: Sum of Digits

Read a four-digit integer from the standard input and find the sum of all its digits.

### Sample Input and Output

```
A four-digit integer? 1237
The sum of all digits is 13
```

## Problem #4: Inches to Centimeters Convertor

Create an application that converts inches to centimeters. Note that 1 inch is equal to 2.54 centimeters.

### Sample Input and Output

```
Length in inches? 17
17 in. = 43.18 cm.
```

## Problem #5: Fahrenheit to Celsius Convertor

Create an application that converts degrees Fahrenheit to degrees Celsius. Use the following formula to convert the values:

$\degree C = \frac{5}{9} \times ( \degree F - 32 )$

### Sample Input and Output

```
Temperature in degrees Fahrenheit? 114
The temperature in degrees Celsius is 45.56
```

## Homework

Read Introduction to Java Programming, 12th Edition by Y. Daniel Liang, Chapter 2

* Do programming exercises from chapter 2:

  1. Exercise 2.1
  2. Exercise 2.2
  3. Exercise 2.4
  4. Exercise 2.7
  5. Exercise 2.11

### Homework Problem #6: Exercise 2.1

### Sample Input and Output

Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit, and displays the result. The formula for the conversion is as follows:

$\degree F = \frac{9}{5} \times \degree C + 32$

```
Enter a degree in Celsius: 43.5
43.5 Celsius is 110.3 Fahrenheit
```

### Homework Problem #7: Exercise 2.2

Write a program that reads in a radius $r$ and length $l$ of a cylinder and computes its area $A$ and volume $V$ using the following formulas:

$A = r^2 \pi$

$V = A \times l$

### Sample Input and Output

```
Enter the radius and length of a cylinder: 5.5 12
The area is 95.0332
The volume is 1140.4
```

### Homework Problem #8: Exercise 2.4

Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result. One pound is 0.454 kilogram.

### Sample Input and Output

```
Enter a number in pounds: 55.5
55.5 pounds is 25.197 kilograms
```

### Homework Problem #9: Exercise 2.7

### Sample Input and Output

Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the maximum number of years and remaining days for the minutes. For simplicity, assume that a year has 365 days.

```
Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days
```

### Homework Problem #10: Exercise 2.11

Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and display the population after the number of years.

Use `Math.round` to round calculations performed with `double` values. Ignore the sample output in the book. Use the sample below to check the correctness of your solution.

### Sample Input and Output

```
Enter the number of years: 5
The population in 5 years is 325932970
```

## Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
. (.idea, .gitignore, other lab dirs)
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

If the files with assignments are named differently, you will be penalized.
