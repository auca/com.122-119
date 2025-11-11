Introduction to Programming, Practice #6
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

### Installing raylib in CLion using vcpkg

Follow these steps to install the raylib library in your C++ project in CLion using the vcpkg package manager. The raylib C library enables you to create interactive, cross-platform, hardware-accelerated graphical applications using structured and procedural code.

If you are unable to install the raylib library and get the test program to display at least a window, please schedule an office hours session with your instructors to resolve any installation issues related to the software described in this requirements document. Do not delay such meetings; failure to prepare a development environment on time will be reflected in the academic evaluation for this lab.

#### Step 0: OS-based Preparations

* On Windows, install [Visual Studio Community](https://visualstudio.microsoft.com/vs/community), with the [Desktop development with C++](https://learn.microsoft.com/en-us/cpp/build/vscpp-step-0-installation?view=msvc-170) packages.
* On macOS, first install [brew](https://brew.sh) through the `Terminal.app` on macOS, then with `brew` install the following libraries by running the `brew install xorg-server libxcursor libxinerama pkg-config glfw` command in the same terminal.
* On GNU/Linux, first install `libx11-dev libxcursor-dev libxinerama-dev libxrandr-dev libgl1-mesa-dev libglu1-mesa-dev pkg-config` libraries with the package manager of your distribution. Note that the names of the packages may differ slightly depending on the package manager and its repositories used. Refer to the documentation of your GNU/Linux distribution for more information.

Additional packages may be required, depending on the specific version of your operating system and its configuration. Follow any suggestions provided by the software and libraries during installation.

#### Step 1: Accessing the Vcpkg Panel

* In CLion, open the Vcpkg panel by clicking on the `View` menu, then clicking on the `Tool Windows` submenu, and finally selecting the `Vcpkg` item from the list.

#### Step 2: Install Vcpkg

* Install Vcpkg by clicking on the `+` button in the Vcpkg panel.
* Leave the `Name` and `URL` fields to default values.
* If on a lab machine, change the `Directory` field to `Z:\.vcpkg-clion\vcpkg`, otherwise leave it at the default value.
* Check the option `Add vcpkg integration to existing CMake profiles`.
* Check the option `Debug`.

#### Step 3: Installing raylib

* Find `raylib` in the Vcpkg panel by typing the name of the library in the search field.
* Select `raylib` in the search result, and click on the `Install` button in the Vcpkg panel. If you see the `Remove from vcpkg.json` button instead of `Install`, you don't need to install the package, it was installed automatically. You can move on to the next step.

#### Step 4: Integrate raylib Into the Project

* Once the installation is complete, you need to integrate raylib into your project. On macOS, you must enable an address sanitization library since raylib is compiled with it on this platform. On GNU/Linux, a similar step is required, but the command differs to also include the undefined behavior sanitizer. To accomplish this, open your project's `CMakeLists.txt` file and, after the `set(CMAKE_CXX_STANDARD 20)` line, either uncomment or append the following lines:

    ```cmake
    find_package(raylib CONFIG REQUIRED)
    find_package(glfw3  CONFIG REQUIRED)
    if(APPLE)
        set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fsanitize=address")
    elseif(UNIX)
        set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -pthread -fsanitize=address -fsanitize=undefined")
    endif()
    ```

#### Step 5: Link raylib to a Program

* Finally, to enable the library for a particular lab or project executable, you have to configure the linker to attach the compiled library to your code. For that, after every `add_executable(<executable-name>, <path-to-source-file>)` line of a lab task with graphics, add the following line:

    ```cmake
    target_link_libraries(<executable-name> PRIVATE raylib glfw)
    ```

Don't forget to replace `<executable-name>` and `<path-to-source-file>` with the correct values.

---

## Important Notes

The checkpoint will be graded based on your programs' output, the correctness of your repository structure, and the style of your code. You may be penalized and receive a lower grade if your program's output does not exactly match the expected output (wrong letters, extra spaces or newlines, or an incorrectly computed result). Please check your code and output before submitting your work to GitHub or Moodle. Ensure your program's output matches the specified output on this page. Print a `\n` newline after the final line of your program's output. Format real numbers precisely to the number of decimal places specified in the sample output.

Ensure your code style is consistent: indent code properly, separate logical blocks with a blank line, and use variable names that follow a consistent naming style and concisely describe the data they store. The code style for all files must conform to the configuration in `.clang-format`. By default, `.clang-format` is set to the WebKit style; see the [WebKit Code Style Guidelines](https://webkit.org/code-style-guidelines) for details. If you prefer a different style, update `.clang-format` accordingly. Ensure that your source files adhere to the selected style. If you receive the error `The file is not formatted consistently with the '.clang-format' configuration.` from the grader, it means you failed to follow the selected style in the `.clang-format` file. Format your source code manually or use CLion's autoformatting tools. However, we recommend starting with manual formatting to build good programming habits.

Your files and directories must be named according to the requirements outlined at the bottom of this page. Moreover, your repository must not contain extraneous files or unrelated code, especially within the folder designated for lab tasks.

If you are instructed to use a particular function, you must base your solution on that function, even if a better solution exists without it.

Do not hesitate to contact your practice instructor if you have any questions.

---

## Lab Tasks

Complete the following programming exercises with your lab instructor or on your own.

### Problem #1: Swap Two Numbers

Create a program that swaps two integer values provided by the user. Define a function `void swap(?)` that swaps the values of `a` and `b`. Determine the appropriate parameter list for this function. The function should not return or print any values. It should be called from the `main` function. The `main` function should display the values of `a` and `b` both before and after the swap.

#### Sample Input and Output

```
Enter the first value: 2
Enter the second value: 3
Before swapping: a = 2; b = 3;
After swapping: a = 3; b = 2;

```

### Problem #2: Number of Days

Develop a program that calculates the number of days in a specific month for a given year. To structure your code efficiently, implement two functions:

- `int get_days_of_month(int year, int month)`: Determines the number of days in the specified month and year. Returns -1 if the month number is incorrect.
- `bool is_leap(int year)`: Checks whether the given year is a leap year.

#### Sample Output

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

## Problem #3: Greatest Common Divisor (Naive Algorithm)

Develop a program that accepts two arbitrary long integers and outputs their greatest common divisor (GCD). Incorporate the function `long long gcd(long long a, long long b)` within this program to calculate the GCD of `a` and `b`. The solution should be straightforward and avoid using the Euclidean algorithm. Note that slower performance with large numbers is acceptable.

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

### Problem #4: Greatest Common Divisor (Euclidean Algorithm)

Develop an updated version of the previous program using the Euclidean algorithm to calculate the greatest common divisor (GCD) of two arbitrary long integers. Ensure the new program is optimized for speed and efficiency, even when processing large numbers within the range of the `long long` data type.

### Sample Input and Output

```
a: 2000000000
b: 2000000001
GCD(2000000000, 2000000001) = 1

```

```
a: 0
b: 0
GCD(0, 0) is not defined.

```

### Problem #5: Star

Develop a graphics application that generates an image of a star similar to the one shown in the sample below. To draw the star, you must define and use a function:

```cpp
void draw_star(
         int rays,
         float x, float y,
         float inner_radius, float outer_radius,
         float rotation_angle,
         float thickness, Color color
     )
```

Try to determine the meaning of each parameter by examining the sample image and the parameter names.

The image should be resolution-independent, meaning it should look good at any window size. However, the window size should be set to 800x450 pixels.

#### Sample

![Star](https://i.imgur.com/JhYjR46.png)

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 6

Create the following graphics applications using the `raylib` library.

### Homework Problem #6: Stars

Develop a graphics application that generates an image of stars, similar to the one shown in the sample below. To draw the stars, you must define and use a function `draw_star` from Problem #5.

Use randomly generated values (with any seed) for the parameters of the `draw_star` function, which will be called in a loop. The number of stars should be specified by you. You have some artistic freedom, but the image should resemble the one shown in the sample below.

The image should be resolution-independent, meaning it should look good at any window size. However, the window size should be set to 800x450 pixels.

#### Sample

![Stars](https://i.imgur.com/1v8aBA6.png)

### Homework Problem #7: Spiral

Develop a graphics application that generates an image of a spiral similar to the one shown in the sample below. To draw the spiral, you must define and use a function:

```cpp
void draw_spiral(
         int segments,
         int cycles,
         float x, float y,
         float radius,
         float rotation_angle,
         float thickness, Color color
     )
```

Try to determine the meaning of each parameter by examining the sample image and the parameter names.

The image should be resolution-independent, meaning it should look good at any window size. However, the window size should be set to 800x450 pixels.

#### Sample

![Spiral](https://i.imgur.com/Ns1q7IM.png)

### Homework Problem #8: Spirals

Develop a graphics application that generates an image of spirals, similar to the one shown in the sample below. To draw the spirals, you must define and use a function `draw_spiral` from Problem #7.

The image should resemble the one shown in the sample below. The image should be resolution-independent, meaning it should look good at any window size. However, the window size should be set to 800x450 pixels.

#### Sample

![Spirals](https://i.imgur.com/lL54oVf.png)

### Homework Problem #9: Sine Wave

Develop a graphics application that generates an image of a sine wave similar to the one shown in the sample below. To draw the sine wave, you must define and use a function:

```cpp
void draw_sine_wave(
         int segments,
         int cycles,
         float start_x, float start_y,
         float end_x, float end_y,
         float amplitude,
         float phase_offset,
         float thickness, Color color
     )
```

Try to determine the meaning of each parameter by examining the sample image and the parameter names.

The image should be resolution-independent, meaning it should look good at any window size. However, the window size should be set to 800x450 pixels.

#### Sample

![Sine Wave](https://i.imgur.com/kU6dmNz.png)

### Homework Problem #8: Sine Waves

Develop a graphics application that generates an image of sine waves, similar to the one shown in the sample below. To draw the spirals, you must define and use a function `draw_sine_wave` from Problem #9.

The image should resemble the one shown in the sample below. The image should be resolution-independent, meaning it should look good at any window size. However, the window size should be set to 800x450 pixels.

#### Sample

![Sine Waves](https://i.imgur.com/nUyc1fl.png)

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, .clang-format, CMakeLists.txt, Readme.md)
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
* `const`: <https://en.cppreference.com/w/cpp/language/cv.html>
* `constexpr`: <https://en.cppreference.com/w/cpp/language/constexpr.html>
* `math constants`: <https://en.cppreference.com/w/cpp/numeric/constants.html>
* `static_cast`: <https://en.cppreference.com/w/cpp/language/static_cast.html>
* `if`: <https://en.cppreference.com/w/cpp/language/if>
* `operators`: <https://en.cppreference.com/w/cpp/language/operator_precedence>
* `switch`: <https://en.cppreference.com/w/cpp/language/switch>
* `srand`: <https://en.cppreference.com/w/cpp/numeric/random/srand>
* `rand`: <https://en.cppreference.com/w/cpp    /numeric/random/rand>
* `cctype`: <https://en.cppreference.com/w/cpp/header/cctype>
* `while`: <https://en.cppreference.com/w/cpp/language/while>
* `do...while`: <https://en.cppreference.com/w/cpp/language/do>
* `for`: <https://en.cppreference.com/w/cpp/language/for>
* `continue`: <https://en.cppreference.com/w/cpp/language/continue>
* `break`: <https://en.cppreference.com/w/cpp/language/break>
* `functions`: <https://en.cppreference.com/w/cpp/language/functions>
* `pointers`: <https://en.cppreference.com/w/cpp/language/pointer>
* `references`: <https://en.cppreference.com/w/cpp/language/reference>

### raylib

* Wiki: <https://github.com/raysan5/raylib/wiki>
* Cheatsheet: <https://www.raylib.com/cheatsheet/cheatsheet.html>
* Examples: <https://www.raylib.com/examples.html>
