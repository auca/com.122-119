Structured Programming, Practice #7
===================================

## Original Requirements

* <https://drive.google.com/file/d/1vfrZoQkjlNmy7gHNElZAbNl3PCTwWZIw/view?usp=sharing>

## Developer Tools

* [Eclipse Temurin JDK 17](https://adoptium.net)
* [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoint would be graded by the output of your programs. You may be penalized and get a lower grade if the result does not match (wrong letters, additional spaces, or newlines). Please check your code and output before sending it to GitHub or Canvas. Make sure the outcome of your program matches the specified output on this page. Do not hesitate to contact your practice instructor on Canvas in the Discussions tab if you have any questions.

Moreover, your repository should not have additional files with unrelated code, especially the folder with lab tasks.

## Problem #1: Dice

Create a program that simulates tosses of two dice thrown a specified number of times. The program outputs counters for all sums that appeared during throws.

### Sample Input and Output

You may get different numbers due to the random nature of the process.

```
N: 6000
2: 166
3: 338
4: 475
5: 629
6: 831
7: 1019
8: 843
9: 671
10: 496
11: 361
12: 171
```

## Problem #2: Number of Days in a Month

Write a program that reads a month number and a year and prints the number of days in that month. Implement methods `int getDaysOfMonth(int year, int month)` and `boolean isLeapYear(int year)` to solve this problem. The program should query the user for input in a loop until the [EOF](https://en.wikipedia.org/wiki/End-of-file) condition is triggered with the CTRL+D or CTRL+Z key combination (depending on the terminal that you are using).

### Sample Input and Output

```
Month: 2
Year: 2004
Days: 29
Month: 2
Year: 2003
Days: 28
Month: 11
Year: 2011
Days: 30
Month: 12
Year: 2011
Days: 31
Month: ^D
```

## Problem #3: Reverse

Read a list of numbers. Load it into an array. Print the array to the screen. Reverse the array. Print the collection again.

### Sample Input and Output

```
N: 5
Enter 0 element: 3
Enter 1 element: 1
Enter 2 element: 5
Enter 3 element: 6
Enter 4 element: 0
Before reversing:
3 1 5 6 0
After reversing:
0 6 5 1 3
```

## Problem #4: DeckOfCards.java

* Read, try to understand, and rewrite the following code example from Chapter 7 as is:

    - `DeckOfCards.java` (name your file `Problem4.java`)

Even though you can copy and paste code from the book, avoiding it is highly recommended. Try to retype the code on your own. It will help you to prepare for the Final Exam.

### Sample Output

```
Card number 6: 7 of Spades
Card number 48: 10 of Clubs
Card number 11: Queen of Spades
Card number 24: Queen of Hearts
```

## Problem #5: SelectionSort.java

* Read, try to understand, and rewrite the following code example from Chapter 7 as is:

    - `SelectionSort.java` (name your file `Problem5.java`)

Even though you can copy and paste code from the book, avoiding it is highly recommended. Try to retype the code on your own. It will help you to prepare for the Final Exam.

Add methods `void printArray(int[] a)` and the entry point `main`. Test the `void SelectionSort(int[] a)` method on the following five arrays that you have to define in `main` on your own.

1. `1 2 3 4 5 6 7 8 9 10`
2. `10 9 8 7 6 5 4 3 2 1`
3. `1 10 2 9 3 8 4 7 5 6`
4. `1 1 1 2 2 2 3 3 3 4 4 4 5 5 5`
5. `5 5 5 4 4 4 3 3 3 2 2 2 1 1 1`

Print the content of each array after sorting with the `printArray` method.

### Sample Output

```
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 1 1 2 2 2 3 3 3 4 4 4 5 5 5
1 1 1 2 2 2 3 3 3 4 4 4 5 5 5
```

## Homework

Read Introduction to Java Programming, 12th Edition by Y. Daniel Liang, Chapter 7

* Do programming exercises from chapter 7:

  1. Exercise 7.1
  2. Exercise 7.3
  3. Exercise 7.4
  4. Exercise 7.10
  5. Exercise 7.15

### Homework Problem #6: Exercise 7.1

Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme:

```
Grade is A if score is >= best - 10
Grade is B if score is >= best - 20
Grade is C if score is >= best - 30
Grade is D if score is >= best - 40
Grade is F otherwise.
```

The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores, and concludes by displaying the grades. Here is a sample run:

### Sample Input and Output

```
Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B
```

### Homework Problem #7: Exercise 7.3

Write a program that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0. Here is a sample run of the program: Note that if a number occurs more than one time, the plural word “times” is used in the output. Numbers are displayed in increasing order.

### Sample Input and Output

```
Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
```

### Homework Problem #8: Exercise 7.4

Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average, and how many scores are below the average. Enter a negative number to signify the end of the input. Assume the maximum number of scores is 100.

### Sample Input and Output

```
Scores: 1 2 3 4 5 -1
Above average: 3
Below average: 2
```

### Homework Problem #9: Exercise 7.10

Write a method that returns the index of the smallest element in an array of integers. If the number of such elements is greater than 1, return the smallest index. Use the following header:

```java
public static int indexOfSmallestElement(double[] array)
```

Write a test program that prompts the user to enter 10 numbers, invokes this
method to return the index of the smallest element, and displays the index.

### Sample Input and Output

```
10 numbers: 10 9 8 7 6 5 4 3 2 1
9
```

### Homework Problem #10: Exercise 7.15

Write a method that returns a new array by eliminating the
duplicate values in the array using the following method header:

```java
public static int[] eliminateDuplicates(int[] list)
```

Write a test program that reads in 10 integers, invokes the method, and displays the distinct numbers separated by exactly one space. Here is a sample run of the program:

### Sample Output

```
Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5
```

## Expected Repository Structure

When you finish all assignments, your repository should look like this:

```
. (.idea, .gitignore, other lab dirs)
└── lab-07
    ├── lab-07.iml
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
