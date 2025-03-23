Object-oriented Programming, Practice #5
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

## Libraries

* [Qt 6](https://www.qt.io)

### Installing Qt 6

In this lab, you will be building simple GUI applications using the popular library Qt (pronounced "cute"). First, you will need to install the library on your system. Our labs already have the library installed. On your personal computer, you must follow the instructions below to install the library for your operating system. It is advisable to install the library as soon as possible and to contact your instructors in case of any problems. Failure to complete the library setup in time could hinder your ability to complete and submit the practical tasks by their deadlines. Please be aware that no extensions will be granted, and failing to set up the library will result in a zero for all online and offline assessments.

#### Windows

1. Download the following [archive](https://drive.google.com/file/d/14iCNNsdpZTj4t9ZNz4Mdi79Hd6pWwuab/view) and extract it to the `C:` drive. Ensure that after extraction there is a directory named `Qt` (`C:\Qt`), and inside it, a directory named `6.8.2` (`C:\Qt\6.8.2`). If you do not trust our package, you can install Qt 6 yourself using the official online [installer](https://www.qt.io/download-open-source). Select only the library for the MSVC compiler, version `6.8.2`; do not install any additional components, as the full installation requires significant disk space.
2. Run PowerShell as an administrator. Once open, execute the code below to set global OS variables that will help build tools locate your Qt 6 installation:

```powershell
[System.Environment]::SetEnvironmentVariable("Qt6_DIR", "C:\Qt\6.8.2\msvc2022_64", "Machine")

$currentPath = [System.Environment]::GetEnvironmentVariable("Path", "Machine")
$newDir = "C:\Qt\6.8.2\msvc2022_64\bin"
if ($currentPath -notlike "*$newDir*") {
    $updatedPath = "$currentPath;$newDir"
    [System.Environment]::SetEnvironmentVariable("Path", $updatedPath, "Machine")
}
```

#### macOS

1. Install or update the [Homebrew](https://brew.sh) package manager.
2. Install Qt 6 with Homebrew by running `brew install qt6` in the Terminal application.

#### Ubuntu

1. Install Qt 6 with the system package manager by running `sudo apt install qt6-base-dev` in the Terminal application.

---

## Important Notes

The checkpoints will be graded based on the visual output of your GUI programs, the correctness of your repository’s structure, and the style of your code. Ensure that your code style is consistent: your code should be properly indented, groups of code should be separated by blank lines, and variable names should follow a consistent naming convention while concisely describing the data they represent. Your files and directories must be named according to the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are instructed to use a particular function, you must base your solution on that function, even if a better solution exists without it. Do not hesitate to contact your practice instructor if you have any questions.

---

## Problem #1: The First Window

<img src="https://i.imgur.com/qzsLArk.png" width="600" alt="Problem 1" />

Create an application using Qt 6 that opens an empty window, sized 500 by 500 pixels, with the title 'Problem #1'.

## Problem #2: Buttons

<img src="https://i.imgur.com/p59SAdw.png" width="600" alt="Problem 2" />

Create a new application using Qt 6 by copying the code from Problem #1. Modify the code to include three buttons titled 'red', 'green', and 'blue' at the bottom of the window. These buttons should be clickable but do not need to perform any actions yet. Remember to update the window title to 'Problem #2'.

## Problem #3: Handling Events

<img src="https://i.imgur.com/Sew4OTu.png" width="600" alt="Problem 3" />

Create a new application using Qt 6 by duplicating the code from Problem #2. Modify this code so that clicking the buttons changes background color to red, green, or blue of the central part of the window, depending on the button clicked. Remember to update the window title to 'Problem #3'.

## Problem #4: Chessboard

<img src="https://i.imgur.com/HzkZtTk.png" width="600" alt="Problem 4" />

Create a new application using Qt 6 by copying the code from Problem #1. Draw an 8x8 chessboard at the center of the window. The chessboard should automatically scale while maintaining its proportions upon window resizing. Set the window's title to 'Problem #4'.

## Problem #5: Rook on a Chessboard

<img src="https://i.imgur.com/SWbyWov.png" width="600" alt="Problem 5" />

Create a new application using Qt 6 by copying the code from Problem #4. Display an image of a rook by utilizing `rook.png`, which is located in the `data` directory, positioning it on the board at coordinates 0, 0 (equivalent to square 8a on a chessboard). Enable user interaction to move the rook using the keyboard arrows: `up`, `down`, `right`, and `left`.

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 9, 10, 11, 12, 14, 15, 16

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, Readme.md)
├── data...
├── problem01.cpp
├── problem02.cpp
├── problem03.cpp
├── problem04.cpp
└── problem05.cpp
```

If the files with assignments are named incorrectly, you will be penalized.

---

## Documentation

### C++

* `class`: <https://en.cppreference.com/w/cpp/language/class>
* `constructor`: <https://en.cppreference.com/w/cpp/language/constructor>
* `this`: <https://en.cppreference.com/w/cpp/language/this>
* `access-specifier`: <https://en.cppreference.com/w/cpp/language/access>
* `static`: <https://en.cppreference.com/w/cpp/language/static>
* `throw`: <https://en.cppreference.com/w/cpp/language/throw>
* `try-block`: <https://en.cppreference.com/w/cpp/language/try>
* `stdexcept`: <https://en.cppreference.com/w/cpp/header/stdexcept>
* `operator overloading`: <https://en.cppreference.com/w/cpp/language/operators>
* `friend`: <https://en.cppreference.com/w/cpp/language/friend>
* `std::stack`: <https://en.cppreference.com/w/cpp/container/stack>
* `std::vector`: <https://en.cppreference.com/w/cpp/container/vector>
* `destructors`: <https://en.cppreference.com/w/cpp/language/destructor>
* `copy constructor`: <https://en.cppreference.com/w/cpp/language/copy_constructor>
* `move constructor`: <https://en.cppreference.com/w/cpp/language/move_constructor>
* `copy assignment operator`: <https://en.cppreference.com/w/cpp/language/copy_assignment>
* `move assignment operator`: <https://en.cppreference.com/w/cpp/language/move_assignment>
* `rule of three/five/zero`: <https://en.cppreference.com/w/cpp/language/rule_of_three>
* `template`: <https://en.cppreference.com/w/cpp/language/templates>
* `derived classes`: <https://en.cppreference.com/w/cpp/language/derived_class>

### Qt

* `Qt 6`: <https://doc.qt.io/qt.html>
