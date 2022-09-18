Structured Programming, Practice #1
===================================

* <https://drive.google.com/file/d/18ess9-L73bDfH50oGqSI99Vjsa_h8U7b/view?usp=sharing>

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before committing it to GitHub. Make sure the outcome of your program matches the specified output on this page. Don't hesitate to contact your practice instructor on Canvas in the Discussions tab if you have any questions.

Moreover, your repository, especially the folder with lab tasks, should not have additional files with unrelated code.

## Problem #1: "Hello, World" (0.4%)

Write a program that outputs the "Hello, World!!!" message to the screen.

### Sample Output

```
Hello, World!!!
```

## Problem #2: "A Message in a Rectangle" (0.4%)

Create a program that prints the "I like programming!" greeting surrounded by the asterisk symbols.

### Sample Output

```
*********************
*I like programming!*
*********************
```

## Problem #3: "What is Your Name?" (0.4%)

Write a program that reads a user name from the console, then forms, and prints a greeting message for that user.

### Sample Input and Output

```
What is your name? John Doe
Hello, John Doe!
```

## Problem #4: "Operations on Two Integer Numbers?" (0.4%)

Create a program that reads two integer numbers from the user and finds their sum, difference, product, quotient, and the remainder.

### Sample Input and Output

```
1st int? 5
2nd int? 2
5 + 2 = 7
5 – 2 = 3
5 * 2 = 10
5 / 2 = 2
5 % 2 = 1
```

## Problem #5: "Operations on Two Real Numbers?" (0.4%)

Create a program that reads two real numbers from the user and finds their sum, difference, product, quotient, and the remainder.

### Sample Input and Output

```
1st double? 5.1
2nd double? 2.6
5.1 + 2.6 = 7.699999999999999
5.1 - 2.6 = 2.4999999999999996
5.1 * 2.6 = 13.26
5.1 / 2.6 = 1.9615384615384612
5.1 % 2.6 = 2.4999999999999996
```

## Homework

Read Introduction to Java Programming, 12th Edition by Y. Daniel Liang, Chapter 1

* Do programming exercises from chapter 1:
  1. 1.3 (0.4%)
  2. 1.4 (0.4%)
  3. 1.6 (0.4%)
  4. 1.7 (0.4%)
  5. 1.11 (0.4%)

### Homework Problem #6: Exercise 1.3

Write a program that outputs the following message to the screen:

### Sample Output

```
    J     A    V     V    A
    J    A A    V   V    A A
J   J   AAAAA    V V    AAAAA
 J J   A     A    V    A     A
```

### Homework Problem #7: Exercise 1.4

Write a program, which calculates the squared and cubed value of *a* (for *a* calculate *a<sup>2</sup>* and *a<sup>3</sup>*: 5<sup>2</sup> = 25, 5<sup>3</sup>=125).

**Note**: the values of a^2 and a^3 **have to** be ***calculated***. Otherwise, this problem would not be graded for you. You can use standard multiplication or `Math.pow()` method from the package `java.lang.Math` (this is optional).

### Sample Output

```
a    a^2   a^3
1    1     1
2    4     8
3    9     27
4    16    64
```

### Homework Problem #8: Exercise 1.6

Write a program that displays the result of the summation of integer numbers from 1 to 9 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9)

**Note**: the value has to be calculated **in the code**. Please do not calculate it on paper or in your head. Instead, write the code, which will calculate this number (any logical code will do).

### Sample output

```
45
```

### Homework Problem #9: Exercise 1.7

Write the code which computes the following two equations:

 <a href="https://www.codecogs.com/eqnedit.php?latex=\inline&space;\pi&space;=&space;4&space;\times&space;(&space;1&space;-&space;\frac{1}{3}&space;&plus;&space;\frac{1}{5}&space;-&space;\frac{1}{7}&space;&plus;&space;\frac{1}{9}&space;-&space;\frac{1}{11})" target="_blank"><img src="https://latex.codecogs.com/svg.latex?\inline&space;\pi&space;=&space;4&space;\times&space;(&space;1&space;-&space;\frac{1}{3}&space;&plus;&space;\frac{1}{5}&space;-&space;\frac{1}{7}&space;&plus;&space;\frac{1}{9}&space;-&space;\frac{1}{11})" title="\pi = 4 \times ( 1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \frac{1}{9} - \frac{1}{11})" /></a>

<a href="https://www.codecogs.com/eqnedit.php?latex=\inline&space;\pi&space;=&space;4&space;\times&space;(&space;1&space;-&space;\frac{1}{3}&space;&plus;&space;\frac{1}{5}&space;-&space;\frac{1}{7}&space;&plus;&space;\frac{1}{9}&space;-&space;\frac{1}{11}&space;&plus;&space;\frac{1}{13})" target="_blank"><img src="https://latex.codecogs.com/svg.latex?\inline&space;\pi&space;=&space;4&space;\times&space;(&space;1&space;-&space;\frac{1}{3}&space;&plus;&space;\frac{1}{5}&space;-&space;\frac{1}{7}&space;&plus;&space;\frac{1}{9}&space;-&space;\frac{1}{11}&space;&plus;&space;\frac{1}{13})" title="\pi = 4 \times ( 1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \frac{1}{9} - \frac{1}{11} + \frac{1}{13})" /></a>

**Note**: the values have to be calculated in the code — failing to do this will result in the problem not being graded. Use `double` type and `1.0` instead of `1` in your code.

### Sample Output

```
2.9760461760461765
3.2837384837384844
```

### Homework Problem #10: Exercise 1.11

Write a program to compute the population for each of the next five years. Use the initial conditions from the book *Introduction to Java Programming, 10th Edition* by Y. Daniel Liang. Use `Math.round` to round calculations performed
with `double` values.

**Note**: calculate these values in code — otherwise, the checkpoint would not be graded.

### Sample Output

```
314812583
317592679
320372776
323152873
325932970
```

## Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
.
└── lab-01
    ├── lab-01.iml
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
