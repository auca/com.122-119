Object-oriented Programming, Practice #5
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion)
* [Git SCM](https://git-scm.com)
* [CMake](https://cmake.org)
* [Python](https://www.python.org)
* [Conan](https://conan.io)
* [Qt 6](https://www.qt.io/product/qt6)

### Installing `Qt`

Please follow the instructor's directives to install Qt 6 on your system. Note that the installation involves several steps and may require a significant amount of time. It is advisable to start this process as soon as possible and also contact your instructors as soon as possible in case of problems. Failure to complete the library setup in time could hinder your ability to complete and submit the practical tasks by their deadlines. Please be aware that no extensions will be granted, and failing to set up the library will result in a zero for all online and offline assessments.

## Important Notes

The checkpoints will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Moodle. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor if you have any questions.

## Problem #1: The First Window

<img src="https://i.imgur.com/qzsLArk.png" width="600" alt="Problem 1" />

Create an application with Qt 6 that creates an empty windows 500 by 500 pixels with a title 'Problem #1'.

## Problem #2: Buttons

<img src="https://i.imgur.com/p59SAdw.png" width="600" alt="Problem 2" />

Create a new application with Qt 6 by copying code of Problem #1. Change the code to add three buttons titled 'Red', 'Green', and 'Blue' at the bottom of the window. The three buttons should be clickable, but should do nothing yet. Don't forget to change the title to 'Problem #2'.

## Problem #3: Buttons Handling Events

<img src="https://i.imgur.com/Sew4OTu.png" width="600" alt="Problem 3" />

Create a new application with Qt 6 by copying code of Problem #2. Change the code to make the buttons change the background color of the window to red, green, and blue based on the button clicked. Don't forget to change the title to 'Problem #3'.

## Problem #4: Chessboard

<img src="https://i.imgur.com/HzkZtTk.png" width="600" alt="Problem 4" />

Create a new application with Qt 6 by copying code of Problem #1. Draw an 8 by 8 chessboard at the center of the window with reasonable margins around. The chessboard should scale automatically keeping its proportions when the window is resized. Set the title of the window to 'Problem #4'.

## Problem #5: Rook on a Chessboard

<img src="https://i.imgur.com/SWbyWov.png" width="600" alt="Problem 5" />

Create a new application with Qt 6 by copying code of Problem #4. Draw an image of the rook by using the `rook.png` provided in the `data` directory on the board at coordinates 0 and 0 (or 8a). Make it possible for the user to move the rook by pressing the `up`, `down`, `right,` and `left` keys on the keyboard.

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 9, 10, 11, 12, 14, 15, 16

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, Readme.md)
├── data...
├── problem1.cpp
├── problem2.cpp
├── problem3.cpp
├── problem4.cpp
└── problem5.cpp
```

If the files with assignments are named incorrectly, you will be penalized.

## Documentation

### C++

* `class`: <https://en.cppreference.com/w/cpp/language/class>
* `constructor`: <https://en.cppreference.com/w/cpp/language/constructor>
* `this`: <https://en.cppreference.com/w/cpp/language/this>
* `access-specifier`: <https://en.cppreference.com/w/cpp/language/access>
* `static`: <https://en.cppreference.com/w/cpp/language/static>
* `throw`: <https://en.cppreference.com/w/cpp/language/throw>
* `try-block`: <https://en.cppreference.com/w/cpp/language/try_catch>
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
