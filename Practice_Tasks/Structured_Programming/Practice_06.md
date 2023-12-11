Introduction to Programming, Practice #6
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com)

### Installing `raylib` in CLion using `vcpkg`

Follow these steps to install the `raylib` library in your C++ project in CLion using the `vcpkg` package manager. The `raylib` C library enables you to create interactive, cross-platform, hardware-accelerated graphical applications using structured and procedural code.

#### Step 0: OS-based Preparations

- On Windows, install [Visual Studio Community](https://visualstudio.microsoft.com/vs/community), with the [Desktop development with C++](https://learn.microsoft.com/en-us/cpp/build/vscpp-step-0-installation?view=msvc-170) packages.
- On macOS, first install [brew](https://brew.sh) through the `Terminal.app` on macOS, then with `brew` install the following libraries by running the `brew install libxinerama libxcursor xorg-server pkg-config glfw` command in the same terminal.
- On GNU/Linux, first install `libxinerama-dev libxcursor-dev xorg-dev libglu1-mesa-dev pkg-config curl zip unzip tar` libraries with the package manager of your distribution. Note that the names of the packages may differ slightly depending on the package manager and its repositories used. Refer to the documentation of your GNU/Linux distribution for more information.

#### Step 1: Accessing the `Vcpkg` Panel

- In CLion, open the `Vcpkg` panel by clicking on the `View` menu, then clicking on the `Tool Windows` submenu, and finally selecting the `Vcpkg` item from the list.

#### Step 2: Install `Vcpkg`

- Install `Vcpkg` by clicking on the `+` button in the `Vcpkg` panel.
- Leave the `Name` and `URL` fields to default values.
- If on a lab machine, change the `Directory` field to `Z:\.vcpkg-clion\vcpkg`, otherwise leave it at the default value.
- Check the option `Add vcpkg integration to existing CMake profiles`.
- Check the option `Debug`.

#### Step 3: Installing `raylib`

- Find `raylib` in the `Vcpkg` panel by typing the name of the library in the search field.
- Select `raylib` in the search result, and click on the `Install` button in the `Vcpkg` panel.

#### Step 4: Integrate `raylib` Into the Project

- Once the installation is complete, you need to include `raylib` in your project. For that, open the `CMakeLists.txt` file in your project and add the following after the `set(CMAKE_CXX_STANDARD 17)` line:

    ```cmake
    find_package(raylib CONFIG REQUIRED)
    ```

- On macOS, you also have to enable an address sanitization library by adding the following line after:

    ```cmake
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fsanitize=address")
    ```

- On GNU/Linux, you should do a similar thing, but the line should be different to enable the undefined behavior sanitizer:

    ```cmake
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -pthread -fsanitize=address -fsanitize=undefined")
    ```

#### Step 5: Link `raylib` to a Program

- Finally, to enable the library for a particular lab or project executable, you have to configure the linker to attach the compiled library to your code. For that, after every `add_executable(<executable-name>, <path-to-source-file>)` line of a lab task with graphics, add the following line:

    ```cmake
    target_link_libraries(<executable-name> PRIVATE raylib)
    ```

Don't forget to replace `<executable-name>` and `<path-to-source-file>` with the correct values.

## Important Notes

The checkpoint will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Canvas. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor on Canvas under the Discussions tab if you have any questions.

## Problem #1: Swap Two Numbers

Create a program that swaps two integer values provided by the user. Create a function `void swap(?)` that swaps the values of `a` and `b`. Figure out the parameter list for this function. The function should not return or print any value. The function should be called from the `main` function. The `main` function should print the values of `a` and `b` before and after the swap.

### Sample Input and Output

```
Enter the first value: 2
Enter the second value: 3
Before swapping: a = 2; b = 3;
After swapping: a = 3; b = 2;

```

## Problem #2: Number of Days

Develop a program that calculates the number of days in a specific month for a given year. To structure your code efficiently, implement two functions: `int get_days_of_month(int year, int month)`, which determines the number of days in the given month and year, and `bool is_leap(int year)`, which checks if the specified year is a leap year.

### Sample Input and Output

```
Enter the year: 2000
Enter the month: 2
Number of days: 29

```

```
Enter the year: 1900
Enter the month: 2
Number of days: 28

```

```
Enter the year: 2004
Enter the month: 4
Number of days: 30

```

```
Enter the year: 2004
Enter the month: -5
Incorrect month number.

```

## Problem #3: Stars

Develop a graphics application that generates an image consisting of five stars. Each star should be animated to rotate slowly around its center, either clockwise or counterclockwise. In this application, define the function `void draw_star(unsigned int rays, float x, float y, float inner_radius, float outer_radius, Color color = WHITE, float rotation_angle = 0.0f, float line_thickness = 2)` to reduce code duplication. This function will facilitate drawing each star with specified parameters such as the number of rays, position, radii, color, initial angle, and line thickness.

### Sample

![Star](https://i.imgur.com/JZ5oIx5.png)

## Problem #4: Greatest Common Divisor (Naive Algorithm)

Develop a program that accepts two arbitrary integers and outputs their greatest common divisor (GCD). Incorporate the function `int gcd(int a, int b)` within this program to calculate the GCD of `a` and `b`. Your solution should be straightforward and avoid using the Euclidean algorithm. Note that it's acceptable for the solution to exhibit slower performance with large numbers.

### Sample Input and Output

```
a: 25
b: 10
GCD(25, 10) = 5

```

```
a: 0
b: 0
GCD(0, 0) is not defined.

```

## Problem #5: Greatest Common Divisor (Euclidean Algorithm)

Develop an updated version of the previous program that employs the Euclidean algorithm to calculate the greatest common divisor (GCD) of two arbitrary integers. Ensure that this new program is optimized for speed and efficiency, even when handling large numbers within the `int` data type range.

### Sample Input and Output

```
a: 25
b: 10
GCD(25, 10) = 5

```

```
a: 0
b: 0
GCD(0, 0) is not defined.

```

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 6

* Do programming exercises from chapter 6:

  1. Exercise 6.2
  2. Exercise 6.4
  3. Exercise 6.5
  4. Exercise 6.6
  5. Exercise 6.8

### Homework Problem #6: Exercise 6.2

Write a function `double averageDigits(long n)` that computes the average of the digits in an integer. Create a test program for the function that prompts the user to enter an integer and displays the sum and average of all its digits.

### Sample Input and Output

```
Enter the number: 936
The sum of the digits is 18
The average of the digits is 6.0

```

### Homework Problem #7: Exercise 6.4

Write a function `void displayEven(int number)` to display the even digits in an integer. Write a test program that prompts the user to enter an integer and displays the even digits in it.

### Sample Input and Output

```
Enter the number: 936
Even digits: 6

```

```
Enter the number: 234
Even digits: 24

```

### Homework Problem #8: Exercise 6.5

Write a function `void displayLargest(double num1, double num2, double num3)` to display the largest of three numbers. Write a test program that prompts the user to enter three numbers and invokes the function to display the largest of them. Write another function called `double findLargest(double num1, double num2, double num3)` to return the largest of three numbers. Change your `main` function to invoke this function and print the result. Analyze the difference in the two approaches. Which one is better and why? A question like this may appear on the exam.

### Sample Input and Output

```
Enter the first number: 1
Enter the second number: 2
Enter the third number: 3
The largest number is 3.0

```

```
Enter the first number: 3
Enter the second number: 2
Enter the third number: 1
The largest number is 3.0

```

```
Enter the first number: 1
Enter the second number: 3
Enter the third number: 2
The largest number is 3.0

```

### Homework Problem #9: Exercise 6.6

Write a function to display a pattern as follows:

```
****************
**************
************
...
*
```

Create a function `void displayPattern(int n)` to display such a pattern. Write a test program that prompts the user to enter an integer and displays the pattern.

### Sample Input and Output

```
Enter the number of lines: 5
*****
****
***
**
*

```

### Homework Problem #10: Exercise 6.8

Write the following two functions:

```C++
// Convert from millimeters to inches
double millimetersToInches(double millimeters);
// Convert from inches to millimeters
double inchesToMillimeters(double inches);
```

The formula for the conversion is

```C++
millimeters = inches * 25.4;
```

Write a test program that invokes these functions to display the following table (note the extra whitespaces at the end):

```
Millimeters    Inches    |    Inches    Millimeters
2              0.079     |    1         25.400  
4              0.157     |    2         50.800  
6              0.236     |    3         76.200  
8              0.315     |    4         101.600 
10             0.394     |    5         127.000 
12             0.472     |    6         152.400 
14             0.551     |    7         177.800 
16             0.630     |    8         203.200 
18             0.709     |    9         228.600 
20             0.787     |    10        254.000 
22             0.866     |    11        279.400 
24             0.945     |    12        304.800 
26             1.024     |    13        330.200 
28             1.102     |    14        355.600 
30             1.181     |    15        381.000 
32             1.260     |    16        406.400 
34             1.339     |    17        431.800 
36             1.417     |    18        457.200 
38             1.496     |    19        482.600 
40             1.575     |    20        508.000 
42             1.654     |    21        533.400 
44             1.732     |    22        558.800 
46             1.811     |    23        584.200 
48             1.890     |    24        609.600 
50             1.969     |    25        635.000 
52             2.047     |    26        660.400 
54             2.126     |    27        685.800 
56             2.205     |    28        711.200 
58             2.283     |    29        736.600 
60             2.362     |    30        762.000 
62             2.441     |    31        787.400 
64             2.520     |    32        812.800 
66             2.598     |    33        838.200 
68             2.677     |    34        863.600 
70             2.756     |    35        889.000 
72             2.835     |    36        914.400 
74             2.913     |    37        939.800 
76             2.992     |    38        965.200 
78             3.071     |    39        990.600 
80             3.150     |    40        1016.000
82             3.228     |    41        1041.400
84             3.307     |    42        1066.800
86             3.386     |    43        1092.200
88             3.465     |    44        1117.600
90             3.543     |    45        1143.000
92             3.622     |    46        1168.400
94             3.701     |    47        1193.800
96             3.780     |    48        1219.200
98             3.858     |    49        1244.600
100            3.937     |    50        1270.000

```

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, other lab dirs)
└── lab06
    ├── p01.cpp
    ├── p02.cpp
    ├── p03.cpp
    ├── p04.cpp
    ├── p05.cpp
    ├── p06.cpp
    ├── p07.cpp
    ├── p08.cpp
    ├── p09.cpp
    └── p10.cpp
```

If the files with assignments are named incorrectly, you will be penalized.

## Documentation

## C++

* `iostream`: <https://en.cppreference.com/w/cpp/header/iostream>
* `iomanip`: <https://en.cppreference.com/w/cpp/header/iomanip>
* `cmath`: <https://en.cppreference.com/w/cpp/header/cmath>
* `operators`: <https://en.cppreference.com/w/cpp/language/operator_precedence>
* `if`: <https://en.cppreference.com/w/cpp/language/if>
* `switch`: <https://en.cppreference.com/w/cpp/language/switch>
* `srand`: <https://en.cppreference.com/w/cpp/numeric/random/srand>
* `rand`: <https://en.cppreference.com/w/cpp/numeric/random/rand>
* `do...while`: <https://en.cppreference.com/w/cpp/language/do>
* `while`: <https://en.cppreference.com/w/cpp/language/while>
* `for`: <https://en.cppreference.com/w/cpp/language/for>
* `continue`: <https://en.cppreference.com/w/cpp/language/continue>
* `break`: <https://en.cppreference.com/w/cpp/language/break>
* `functions`: <https://en.cppreference.com/w/cpp/language/functions>
* `pointers`: <https://en.cppreference.com/w/cpp/language/pointer>
* `references`: <https://en.cppreference.com/w/cpp/language/reference>

## `raylib`

* Wiki: <https://github.com/raysan5/raylib/wiki>
* Cheatsheet: <https://www.raylib.com/cheatsheet/cheatsheet.html>
* Examples: <https://www.raylib.com/examples.html>
