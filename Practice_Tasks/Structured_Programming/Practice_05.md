Introduction to Programming, Practice #5
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


## Problem #1: Arithmetic Mean

Create an application that calculates the arithmetic mean for a list of grades (from one to five). All grades should be read from the standard input one at a time. A zero value should be considered the end of the input and not be used in the calculation.

Use the `do...while` loop in this task.

### Sample Input and Output

```
Enter the next grade or '0' to exit: 3
Enter the next grade or '0' to exit: 4
Enter the next grade or '0' to exit: 2
Enter the next grade or '0' to exit: 5
Enter the next grade or '0' to exit: 0
The arithmetic mean is 3.5
```

```
Enter the next grade or '0' to exit: 5
Enter the next grade or '0' to exit: 5
Enter the next grade or '0' to exit: 4
Enter the next grade or '0' to exit: 4
Enter the next grade or '0' to exit: 0
The arithmetic mean is 4.5
```

```
Enter the next grade or '0' to exit: 0
Nothing to calculate
```

## Problem #2: Sum of Digits

Create a program that reads an integer from the standard input and finds the sum of all its digits.

Use the `while` loop in this task.

### Sample Input and Output

```
Enter an integer: 6427572
The sum of all digits is 33.
```

```
Enter an integer: 784
The sum of all digits is 19.
```

## Problem #3: Simple Math Test

Create a program that generates tests to check students' ability to add numbers. The program should print each test with random operands on a separate line, read each answer from a student, and provide statistics with the number of correct and incorrect answers at the end.

Use the `while` loop first in your solution, comment it out, then write a `for` loop solution.

Use `srand` from `cstdlib` to seed the random number generator with the value of `42` to get a predictable sequence to help us evaluate your program with an automated script. Note that the examples below may not use `42` in `srand` and will produce different results compared to your program. The minimum and maximum values for the random generator must be in the range $[-20, 20]$.

### Sample Input and Output

```
Number of tests? 3
5 + 3 = 8
4 + 2 = 5
-3 + 11 = 9
Number of correct answers: 1
Number of incorrect answers: 2
```

```
Number of tests? 2
-2 + 1 = -1
2 + (-1) = 1
Number of correct answers: 2
Number of incorrect answers: 0
```

## Problem #4: Circles

Create a `raylib` application that draws multiple circles of random sizes, at random coordinates, and in random colors. The number of circles, predetermined by you, should be stored as a constant in your code.

You have certain artistic liberties in the task. You can choose the number of circles and their minimum and maximum radius. All the graphics task are evaluated manually.

### Sample

![Random Circles](https://i.imgur.com/xEHP8Jy.png)

## Problem #5: Gradient

Create a `raylib` application that draws a series of circles in varying shades of red, centered on the screen (as shown in the screenshot below). The number of circles, chosen by you, must be stored as a constant in your code. This number should be sufficient to achieve a visual effect similar to the one in the picture below.

### Sample

![Gradient](https://i.imgur.com/70XUgkS.png)

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 5.

* Read, try to understand, and rewrite the following code examples from Chapter 5 as they are:

 1. `TestBreak.cpp` (name your file `p06.cpp`)
 2. `TestContinue.cpp` (name your file `p07.cpp`)
 3. `MultiplicationTable.cpp` (name your file `p08.cpp`)
 4. `TestPalindrome.cpp` (name your file `p09.cpp`)
 5. `PrimeNumber.cpp` (name your file `p10.cpp`)

While you can copy and paste the code from the book, it is highly recommended to avoid doing so. Instead, try to retype the code on your own for educational purposes. This practice will aid in preparing you for the Final Exam.

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, other lab dirs)
└── lab05
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

## `raylib`

* Wiki: <https://github.com/raysan5/raylib/wiki>
* Cheatsheet: <https://www.raylib.com/cheatsheet/cheatsheet.html>
* Examples: <https://www.raylib.com/examples.html>
