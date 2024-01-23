Introduction to Programming, Practice #7
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

- Once the installation is complete, you need to integrate `raylib` into your project. On macOS, you must enable an address sanitization library since `raylib` is compiled with it on this platform. On GNU/Linux, a similar step is required, but the command differs to also include the undefined behavior sanitizer. To accomplish this, open the `CMakeLists.txt` file in your project and append the following lines after the `set(CMAKE_CXX_STANDARD 17)` line:

    ```cmake
    find_package(raylib CONFIG REQUIRED)
    if(APPLE)
        set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fsanitize=address")
    elseif(UNIX)
        set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -pthread -fsanitize=address -fsanitize=undefined")
    endif()
    ```

#### Step 5: Link `raylib` to a Program

- Finally, to enable the library for a particular lab or project executable, you have to configure the linker to attach the compiled library to your code. For that, after every `add_executable(<executable-name>, <path-to-source-file>)` line of a lab task with graphics, add the following line:

    ```cmake
    target_link_libraries(<executable-name> PRIVATE raylib)
    ```

Don't forget to replace `<executable-name>` and `<path-to-source-file>` with the correct values.

## Important Notes

The checkpoint will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Moodle. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor if you have any questions.

## Problem #1: Dice

Create a program that simulates the tosses of two six-sided dice, thrown a specified number of times. The program should output counters for all sums that appear during the throws.

Use `srand` from `cstdlib` to seed the random number generator with the value of `42`. This ensures a predictable sequence, which will aid in the evaluation of the program through an automated script. Note that the examples provided below may not use `42` as the seed in `srand`, and therefore, they will produce results different from your program.

### Sample Input and Output

```
Enter the number of times to throw two dice: 6000
Got 2 on the dice 166 times.
Got 3 on the dice 338 times.
Got 4 on the dice 475 times.
Got 5 on the dice 629 times.
Got 6 on the dice 831 times.
Got 7 on the dice 1019 times.
Got 8 on the dice 843 times.
Got 9 on the dice 671 times.
Got 10 on the dice 496 times.
Got 11 on the dice 361 times.
Got 12 on the dice 171 times.

```

## Problem #2: Number of Days

Develop a program that calculates the number of days in a specific month for a given year. To structure your code efficiently, implement two functions: `int get_days_of_month(int year, int month)`, which returns the number of days in the specified month and year, and `bool is_leap(int year)`, that checks if the given year is a leap year. In the `get_days_of_month` function, use an array to look up and return the number of days, replacing the traditional selection construct.

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

## Problem #3: Analyze Data

Read a list of five integer numbers. Load these numbers into an array and print the array to the screen. Then, find the minimum and maximum values in the array. Calculate the mean value and the standard deviation of the array values.

The standard deviation can be calculated using the following formula:

$\sigma = \sqrt{\frac{\sum{(x_{i} - \mu)^2}}{N}}$

In this formula, $N$ is the array size, $\mu$ represents the mean value of the array, and $x_i$ represents each individual number in the array.

### Sample Input and Output

```
Enter the element at index 0: 1
Enter the element at index 1: 2
Enter the element at index 2: 3
Enter the element at index 3: 4
Enter the element at index 4: 5
Data:
1 2 3 4 5
Min: 1
Max: 5
Mean: 3.00
SD: 1.41

```

## Problem #4: Reverse

Read a list of five numbers. Load them into an array. Print the array to the screen. Then, reverse the order of the array elements in memory. Print the modified array to the screen again.

### Sample Input and Output

```
Enter the element at index 0: 3
Enter the element at index 1: 1
Enter the element at index 2: 5
Enter the element at index 3: 6
Enter the element at index 4: 0
Before reversing:
3 1 5 6 0
After reversing:
0 6 5 1 3
```

## Problem #5: Stars

Develop a graphics application that generates an image consisting of many stars bouncing around from one side to another. Use random values for postions, sizes, colors, speed of movement, and many other parameters. Each star should rotate around its center, either clockwise or counterclockwise. You can reuse the star code from the previous lab.

### Sample

You can click on the picture to watch the video.

[![Star](https://i.imgur.com/3UTlwb1.png)](https://drive.google.com/file/d/1Gmhfrioig31BlrunWqSXgM0n3nIWixj-/view?usp=sharing)

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 7

* Do programming exercises from chapter 7:

  1. Exercise 7.1
  2. Exercise 7.3
  3. Exercise 7.5
  4. Exercise 7.10
  5. Exercise 7.23

### Homework Problem #6: Exercise 7.1

Write a program that reads 4 student scores, gets the best score, and then assigns grades based on the following scheme:

```
Grade is A if score is >= best - 10
Grade is B if score is >= best - 20
Grade is C if score is >= best - 30
Grade is D if score is >= best - 40
Grade is F otherwise.

```

The program prompts the user to enter the total number of students (40 at most), then prompts the user to enter all of the scores, and concludes by displaying the grades. Here is a sample run:

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

Write a program that reads at most 100 integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0. Note that if a number occurs more than one time, the plural word 'times' is used in the output. Numbers are displayed in increasing order.

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

### Homework Problem #8: Exercise 7.5

Write a program that reads in 10 numbers and displays distinct numbers (i.e., if a number appears multiple times, it is displayed only once).

### Sample Input and Output

```
Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5

```

### Homework Problem #9: Exercise 7.10

Write a function that returns the index of the largest element in an array of integers. If there are more such elements than one, return the largest index.

```C++
int indexOfLargestElement(double array[], int size)
```

Write a test program that prompts the user to enter 15 numbers, invokes this function to return the index of the largest element, and displays the index.

### Sample Input and Output

```
15 numbers: 10 9 8 7 6 5 4 3 2 1 4 6 3 9 10
14

```

### Homework Problem #10: Exercise 7.23

Two arrays `list1` and `list2` are identical if they have the same contents. Write a function that returns `true` if `list1` and `list2` are identical using the following header:

```C++
bool isEqual(const int list1[], const int list2[], int size)
```

Write a test program that prompts the user to enter two lists of integers and dis- plays whether the two are identical. Here are the sample runs. Note that the first number in the input indicates the number of the elements in the list. This number is not part of the list. Assume the list size is maximum 20.

### Sample Input and Output

```
15 numbers: 10 9 8 7 6 5 4 3 2 1 4 6 3 9 10
14

```

```
Enter list1: 5 5 5 6 6 1
Enter list2: 5 2 5 6 1 6
Two lists are not identical

```

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, other lab dirs)
└── lab07
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

### C++

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
* `arrays`: <https://en.cppreference.com/w/cpp/language/array>
* `struct`: <https://en.cppreference.com/w/c/language/struct>

### `raylib`

* Wiki: <https://github.com/raysan5/raylib/wiki>
* Cheatsheet: <https://www.raylib.com/cheatsheet/cheatsheet.html>
* Examples: <https://www.raylib.com/examples.html>
