Introduction to Programming, Practice #5
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

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
    find_package(glfw3  CONFIG REQUIRED)
    if(APPLE)
        set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fsanitize=address")
    elseif(UNIX)
        set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -pthread -fsanitize=address -fsanitize=undefined")
    endif()
    ```

#### Step 5: Link `raylib` to a Program

- Finally, to enable the library for a particular lab or project executable, you have to configure the linker to attach the compiled library to your code. For that, after every `add_executable(<executable-name>, <path-to-source-file>)` line of a lab task with graphics, add the following line:

    ```cmake
    target_link_libraries(<executable-name> PRIVATE raylib glfw)
    ```

Don't forget to replace `<executable-name>` and `<path-to-source-file>` with the correct values.

---

## Important Notes

The checkpoint will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Moodle. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor if you have any questions.

---

## Lab Tasks

Complete the following programming exercises with your lab instructor or on your own.

### Problem #1: Sum of Digits

Create a program that reads an integer from standard input and calculates the sum of all its digits.

You must use a `while` loop for this task. Use the `abs` function from the `cstdlib` header to obtain the absolute value of the integer.

#### Sample Input and Output

```
Enter an integer: 6427572
The sum of all digits is 33.

```

```
Enter an integer: -784
The sum of all digits is 19.

```

### Problem #2: Arithmetic Mean

Create an application that calculates the arithmetic mean of a list of grades (ranging from one to five). All grades should be read as integers from standard input, one at a time. Format the output to one decimal place. A zero value should be considered the end of input and should not be included in the calculation.

You must use a `do...while` loop for this task. You do not need to check whether the input is within the range of 0 to 5, as we guarantee that all grades will fall within this specified range for this task.

#### Sample Output

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

## Problem #3: Simple Math Test

Create a program that generates tests to assess students' ability to add numbers. The program should print each test with random operands on a separate line, read each answer from the student, and provide statistics at the end, showing the number of correct and incorrect answers.

Begin with a solution using a `while` loop. Comment it out, then write a solution using a `for` loop. The number of tests is guaranteed to be an integer greater than or equal to 0.

Use `srand` from `cstdlib` to seed the random number generator with the value `42` to produce a predictable sequence, which will help us evaluate your program with an automated script. Note that the examples below may not use `42` in `srand`, so their results may differ from those generated by your program. The minimum and maximum values for the random number generator should be in the range $[-20, 20]$.

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
2 + -1 = 1
Number of correct answers: 2
Number of incorrect answers: 0

```

### Problem #4: Circles

Create a `raylib` application that draws multiple circles of random sizes, at random coordinates, and in random colors. The number of circles, predetermined by you, should be stored as a constant in your code. The resolution of the window should be 800x450 pixels.

You have some artistic liberty in this task. You may choose the number of circles as well as their minimum and maximum radius. All graphics tasks will be evaluated manually. Please ensure that the grader generates a screenshot with the correct graphical content for the TA to download from the GitHub Actions pages to check.

#### Sample

![Random Circles](https://i.imgur.com/xEHP8Jy.png)

### Problem #5: Gradient

Create a `raylib` application that draws a series of circles in varying shades of red, centered on the screen (as shown in the screenshot below). The number of circles, chosen by you, should be stored as a constant in your code. This number should be sufficient to achieve a visual effect similar to the one in the picture below. The resolution of the window should be 800x450 pixels.

#### Sample

![Gradient](https://i.imgur.com/70XUgkS.png)

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 5

Read, try to understand, and rewrite the following code examples from Chapter 5 as they are:

  1. `TestBreak.cpp` (name your file `problem06.cpp`)
  2. `TestContinue.cpp` (name your file `problem07.cpp`)
  3. `MultiplicationTable.cpp` (name your file `problem08.cpp`)
  4. `TestPalindrome.cpp` (name your file `problem09.cpp`)
  5. `PrimeNumber.cpp` (name your file `problem10.cpp`)

While you can copy and paste the code from the book, it is highly recommended to avoid doing so. Instead, try retyping the code yourself for educational purposes: compile it, run it, and evaluate the flow of execution in a debugger. This practice will help prepare you for the final exam.

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, Readme.md)
├── problem01.cpp
├── problem02.cpp
├── problem03.cpp
├── problem04.cpp
├── problem05.cpp
├── problem06.cpp
├── problem07.cpp
├── problem08.cpp
├── problem09.cpp
└── problem10.cpp
```

If the files with assignments are named incorrectly, you will be penalized.

---

## Documentation

### C++

* `iostream`: <https://en.cppreference.com/w/cpp/header/iostream>
* `iomanip`: <https://en.cppreference.com/w/cpp/header/iomanip>
* `cmath`: <https://en.cppreference.com/w/cpp/header/cmath>
* `cctype`: <https://en.cppreference.com/w/cpp/header/cctype>
* `operators`: <https://en.cppreference.com/w/cpp/language/operator_precedence>
* `if`: <https://en.cppreference.com/w/cpp/language/if>
* `switch`: <https://en.cppreference.com/w/cpp/language/switch>
* `srand`: <https://en.cppreference.com/w/cpp/numeric/random/srand>
* `rand`: <https://en.cppreference.com/w/cpp/numeric/random/rand>
* `while`: <https://en.cppreference.com/w/cpp/language/while>
* `do...while`: <https://en.cppreference.com/w/cpp/language/do>
* `for`: <https://en.cppreference.com/w/cpp/language/for>
* `continue`: <https://en.cppreference.com/w/cpp/language/continue>
* `break`: <https://en.cppreference.com/w/cpp/language/break>

### `raylib`

* Wiki: <https://github.com/raysan5/raylib/wiki>
* Cheatsheet: <https://www.raylib.com/cheatsheet/cheatsheet.html>
* Examples: <https://www.raylib.com/examples.html>
