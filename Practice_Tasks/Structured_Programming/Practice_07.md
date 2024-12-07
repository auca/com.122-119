Introduction to Programming, Practice #7
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

### Problem #1: Dice

Create a program that simulates the tosses of two six-sided dice, thrown a specified number of times. The program should calculate and display the frequency of each possible sum from the dice rolls. The output table should be properly formatted using the `setw`, `left`, and `right` manipulators. Use widths of 4 and 10 spaces for the first and second columns, respectively.

Use `srand` from `cstdlib` to seed the random number generator with the value `42`. This ensures a predictable sequence, aiding in the automated evaluation of your program. Note that the examples provided below may use a different seed value, so their results may not match those of your program. Use the following function to generate random numbers, ensuring consistency with the automated script:

```c++
int rand_from_to(int from, int to)
{
    return from + std::rand() % (to - from + 1);
}
```

#### Sample Input and Output

```
Enter the number of times to throw two dice: 6000 
Sum      Count
2          168
3          357
4          452
5          689
6          839
7          981
8          871
9          655
10         490
11         332
12         166

```


### Problem #2: Number of Days

Develop a program that calculates the number of days in a specific month for a given year. To structure your code efficiently, implement two functions: `int get_days_of_month(int year, int month)`, which returns the number of days in the specified month and year, and `bool is_leap(int year)`, which checks whether the given year is a leap year. In the `get_days_of_month` function, use an `int` array called `days` to look up and return the number of days, replacing traditional selection constructs.

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

### Problem #3: Analyze Data

Read a list of five integer numbers. Store these numbers in an array and print the array to the screen. Then, find the minimum and maximum values in the array. Calculate the mean value and the standard deviation of the array values.

The standard deviation can be calculated using the following formula:

$\sigma = \sqrt{\frac{\sum{(x_{i} - \mu)^2}}{N}}$

In this formula, $N$ is the array size, $\mu$ represents the mean value of the array, and $x_i$ represents each individual number in the array.

You must create an `int` array called `numbers` and use it even if it is possible to solve the problem without it.

#### Sample Input and Output

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

### Problem #4: Reverse

Read a list of five numbers and store them in an array. Print the array to the screen. Next, reverse the order of the elements in the array in memory. Perform the reversal in place without creating a new array. Print the modified array to the screen again. Use an `int` array called `data` for this task. Create functions such as `void print_data(...)` and `void reverse_data(...)` to structure your code efficiently. Determine the appropriate parameters and their types for these functions.

#### Sample Input and Output

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

### Problem #5: Circles

Develop a graphics application that generates an animation of two circles moving from side to side across the screen, leaving a trail behind as demonstrated in the sample below.

Note that the window size should be set to 450x450 pixels. You may use arrays for this task, but it is not mandatory.

#### Sample

You can click on the picture to watch the video.

[![Circles](https://i.imgur.com/fSOmTIC.png)](https://drive.google.com/file/d/1u5YN1zqQDG8Nx2mmIG-_rQkWLL7wB94I/view?usp=share_link)

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 7, 8

Create the following graphics applications using the `raylib` library.

### Homework Problem #6: Ping-Pong

Develop a graphics application that generates an animation of two circles moving side to side at a 45-degree angle across the screen. The circles should leave a trail behind them, as demonstrated in the sample below.

Note that the window size should be set to 800x450 pixels. You may use arrays for this task, but it is not mandatory.

#### Sample

You can click on the picture to watch the video.

[![Ping](https://i.imgur.com/N3evDwY.png)](https://drive.google.com/file/d/1O2afvCYdF20ChfssGhL8CKrIfb9cRvYU/view?usp=share_link)

### Homework Problem #7: Lines

Develop a graphics application that generates an animation of two small circles moving side to side at a 45-degree angle across the screen connected with a red line. The circles and the line should leave a trail behind them, as demonstrated in the sample below.

Note that the window size should be set to 800x450 pixels. You may use arrays for this task, but it is not mandatory.

#### Sample

You can click on the picture to watch the video.

[![Lines](https://i.imgur.com/Cpl6mBP.png)](https://drive.google.com/file/d/1fXWOf_w_sCwTOHT6RyJsk2OsGcmD-HDQ/view?usp=share_link)

### Homework Problem #8: Spark

Develop a graphics application that generates an animation of two small circles with outlines moving side to side at a 45-degree angle across the screen. The circles should be connected by lines simulating a spark of electricity. Both the circles and the lines should leave a small trail behind them, as demonstrated in the sample below.

Note that the window size should be set to 800x450 pixels. You may use arrays for this task, but it is not mandatory.

#### Sample

[![Spark](https://i.imgur.com/yvqryzy.png)](https://drive.google.com/file/d/1lF1xsWnXCxSaGAoHofyDcGr0YKAZGJky/view?usp=share_link)

### Homework Problem #9: Motion

Develop a graphics application that generates an animation of numerous small circles moving side to side at various angles across the screen. Use random values (with any seed) to determine positions, movement speed, and other parameters. The circles should leave a trail behind them, as shown in the sample below.

Note that the window size should be set to 800x450 pixels. You MUST use arrays to store the circles' data.

#### Sample

[![Motion](https://i.imgur.com/ZeK6TcP.png)](https://drive.google.com/file/d/1MGJqy6Pat51okNIlyaqoMyrLDUdXB_gg/view?usp=share_link)

### Homework Problem #10: Stars

Develop a graphics application that generates an animation featuring many stars bouncing around from one side of the screen to the other. Use random values (with any seed) for positions, sizes, colors, speed of movement, and other parameters. Each star should rotate around its center, either clockwise or counterclockwise. You have some artistic freedom, but the animation should resemble the one shown in the sample below. You can reuse the star code from the previous lab.

Note, that the window size should be set to 800x450 pixels. You MUST use arrays to store the stars' data.

#### Sample

You can click on the picture to watch the video.

[![Stars](https://i.imgur.com/3UTlwb1.png)](https://drive.google.com/file/d/1Gmhfrioig31BlrunWqSXgM0n3nIWixj-/view?usp=sharing)

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
* `functions`: <https://en.cppreference.com/w/cpp/language/functions>
* `pointers`: <https://en.cppreference.com/w/cpp/language/pointer>
* `references`: <https://en.cppreference.com/w/cpp/language/reference>>
* `arrays`: <https://en.cppreference.com/w/cpp/language/array>
* `struct`: <https://en.cppreference.com/w/c/language/struct>

### `raylib`

* Wiki: <https://github.com/raysan5/raylib/wiki>
* Cheatsheet: <https://www.raylib.com/cheatsheet/cheatsheet.html>
* Examples: <https://www.raylib.com/examples.html>
