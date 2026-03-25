Object-oriented Programming, Practice #5
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

## Libraries

* [Qt 6](https://www.qt.io)

### Installing Qt 6

In this lab, you will build a GUI application using the popular library Qt (pronounced "cute"). The lab computers already have Qt installed; however, if you are working on a personal computer, you will need to follow the instructions below to install it for your operating system. It is advisable to do so as soon as possible and to contact your instructors if you encounter any problems. Failure to complete the setup in time may prevent you from finishing and submitting the practical tasks by their deadlines. Please be aware that no extensions will be granted, and not having the library set up will result in a zero for all online and offline assessments.

#### Windows

1. Download the following [archive](https://drive.google.com/file/d/14iCNNsdpZTj4t9ZNz4Mdi79Hd6pWwuab/view) and extract it to the `C:` drive. Ensure that after extraction there is a directory named `Qt` (`C:\Qt`), and inside it, a directory named `6.10.2` (`C:\Qt\6.10.2`). If you do not trust our package, you can install Qt 6 yourself using the official online [installer](https://www.qt.io/download-open-source). Select version `6.10.2`; install Qt Creator too, do not install any additional components, as the full installation requires significant disk space.
2. Run PowerShell as an administrator. Once open, execute the code below to set global OS variables that will help build tools locate your Qt 6 installation:

```powershell
[System.Environment]::SetEnvironmentVariable("Qt6_DIR", "C:\Qt\6.10.2\mingw_64", "Machine")

$currentPath = [System.Environment]::GetEnvironmentVariable("Path", "Machine")
$newDir = "C:\Qt\6.10.2\mingw_64\bin"
if ($currentPath -notlike "*$newDir*") {
    $updatedPath = "$currentPath;$newDir"
    [System.Environment]::SetEnvironmentVariable("Path", $updatedPath, "Machine")
}
```

#### macOS

1. Install or update the [Homebrew](https://brew.sh) package manager.
2. Install Qt 6 libraries with Homebrew by running `brew install qt6` in the Terminal application.
3. Install Qt 6 Creator IDE with Homebrew by running `brew install --cask qt-creator` in the Terminal application.

#### Ubuntu

1. Install Qt 6 with the system package manager by running `sudo apt install qt6-base-dev` in the Terminal application.
2. Install Qt Creator IDE by running `sudo apt install qtcreator` in the Terminal application.

---

## Important Notes

The checkpoint will be graded based on your program's text or visual output, the correctness of your repository structure, and the style of your code. You may receive a lower grade if your program's text or visual output does not exactly match the expected output. Please check your code and output before submitting your work to GitHub or Moodle. Ensure your program's output matches the specified output on this page (text or visuals in the screenshots). Print a `\n` newline after the final line of your program's text output. Format real numbers precisely to the number of decimal places specified in the sample output.

Ensure your code style is consistent: indent code properly, separate logical blocks with a blank line, and use variable names that follow a consistent naming style and concisely describe the data they store. The code style for all files must conform to the configuration in `.clang-format`. By default, `.clang-format` is set to the WebKit style; see the [WebKit Code Style Guidelines](https://webkit.org/code-style-guidelines) for details. If you prefer a different style, update `.clang-format` accordingly. Ensure that your source files adhere to the selected style. If you receive the error `The file is not formatted consistently with the '.clang-format' configuration.` from the grader, it means you failed to follow the selected style in the `.clang-format` file. Format your source code manually or use CLion's autoformatting tools. However, we recommend starting with manual formatting to build good programming habits.

Your files and directories must be named according to the requirements outlined at the bottom of this page. Moreover, your repository must not contain extraneous files or unrelated code, especially within the folder designated for lab tasks.

If you are instructed to use a particular function, you must base your solution on that function, even if a better solution exists without it. Use only language facilities that have been discussed during class.

Remember that this requirements document, the grader file, and any requirements mentioned informally by the instructors during lectures or labs are all considered official and must be followed. Failure to do so may result in lost points. Do not assume that the document below is the only set of rules to follow.

To ensure you are aware of all requirements, attend classes regularly and actively engage with your instructors. If you are unsure about the correct approach, visit office hours to clarify expectations and avoid losing points. If you cannot attend office hours, do not hesitate to reach out to your instructors through other means, such as email.

---

## Lab Task

Complete the following programming exercise with your lab instructor or on your own.

### Problem #1: An Empty Window

![Empty Notepad window](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-5/01.png)

Create a Qt 6 application that opens an empty `QMainWindow` sized 800×600 pixels with the title `Notepad`.

### Problem #2: A Text Area with Buttons

![Text area with Open, Save, Save As buttons at the bottom](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-5/02.png)

Add a `QTextEdit` widget for editing text and three `QPushButton`s, `Open`, `Save`, and `Save As`, arranged in a row at the bottom of the window.

#### Absolute Positioning

First, try placing widgets by setting their pixel coordinates manually with `setGeometry()`:

```cpp
auto* button_open = new QPushButton("Open", this);
button_open->setGeometry(10, 560, 80, 30);
```

Run the application and resize the window. The buttons stay at their original pixel coordinates, they do not follow the window edges. This is **absolute positioning**: simple but fragile, because it breaks as soon as the window size changes.

#### Layout Management

Replace the absolute positioning code with a layout-based approach. Qt provides layout managers that automatically arrange child widgets and reposition them when the window is resized.

Use a `QVBoxLayout` to stack the text area on top and a `QHBoxLayout` (containing the three buttons) on the bottom. Wrap everything in a plain `QWidget` and set it as the central widget:

```cpp
auto* button_open = new QPushButton("Open", this);
auto* button_save = new QPushButton("Save", this);
auto* button_save_as = new QPushButton("Save As", this);

auto* button_layout = new QHBoxLayout;
button_layout->addWidget(button_open);
button_layout->addWidget(button_save);
button_layout->addWidget(button_save_as);

auto* main_layout = new QVBoxLayout;
main_layout->addWidget(editor);
main_layout->addLayout(button_layout);

auto* container = new QWidget(this);
container->setLayout(main_layout);
setCentralWidget(container);
```

Now resize the window, the text area fills the available space and the buttons remain anchored at the bottom. From this point forward, always use layouts instead of absolute positioning.

### Problem #3: Wiring the Buttons

![Buttons wired to file operations](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-5/03.png)

Make the three buttons functional by implementing four private methods, `open_file()`, `save_file()`, `save_file_as()`, and `update_title()`, and connecting each button's `clicked` signal to the corresponding method:

| Button  | Behavior                                                                                                                                                              |
|---------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Open    | Opens a file dialog, reads the chosen file with `QFile` and `QTextStream`, displays its contents in the text area, and sets the window title to `Notepad, <filename>` |
| Save    | Writes the current text to the file that was opened or saved last; falls through to `Save As` if no file is associated yet                                            |
| Save As | Opens a save dialog, writes the text to the chosen path, and updates the window title                                                                                 |

After completing this step, compare `QString` with the `my::string` from Practice 4: note `size()`, `find()` vs `indexOf()`, `isEmpty()`, and the `toStdString()` / `fromStdString()` conversion pair.

### Problem #4: From Buttons to Menus

![File menu with New, Open, Save, Save As, Exit](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-5/04.png)

The buttons work, but real text editors use menus. Replace the button and layout code from Problem #2 with a proper `File` menu.

Remove the `QPushButton`, `QVBoxLayout`, `QHBoxLayout`, and container `QWidget` code from the constructor. Set the `QTextEdit` directly as the central widget with `setCentralWidget(editor)`. Then create a `setup_file_menu()` method that adds a `File` menu to the menu bar with these actions:

| Action     | Behavior                                                      |
|------------|---------------------------------------------------------------|
| New        | Clears the text area and resets the window title to `Notepad` |
| Open...    | Calls `open_file()`                                           |
| Save       | Calls `save_file()`                                           |
| Save As... | Calls `save_file_as()`                                        |
| Exit       | Quits the application                                         |

Connect each action to a lambda. Do not use `SLOT()` macros. The `open_file()`, `save_file()`, `save_file_as()`, and `update_title()` methods remain unchanged from Problem #3.

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 9, 10, 11, 12, 14, 15, 16

### Problem #5: An Edit Menu

![Edit menu with Undo, Redo, Cut, Copy, Paste, Select All](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-5/05.png)

Add an `Edit` menu with the following actions. Connect each directly to the corresponding built-in `QTextEdit` slot. Add a `QKeySequence` shortcut to each action.

| Action     | Slot                   | Shortcut                  |
|------------|------------------------|---------------------------|
| Undo       | `QTextEdit::undo`      | `QKeySequence::Undo`      |
| Redo       | `QTextEdit::redo`      | `QKeySequence::Redo`      |
| Cut        | `QTextEdit::cut`       | `QKeySequence::Cut`       |
| Copy       | `QTextEdit::copy`      | `QKeySequence::Copy`      |
| Paste      | `QTextEdit::paste`     | `QKeySequence::Paste`     |
| Select All | `QTextEdit::selectAll` | `QKeySequence::SelectAll` |

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, .clang-format, CMakeLists.txt, Readme.md)
├── main.cpp
├── main_window.h
└── main_window.cpp
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
* `invalid_argument`: <https://en.cppreference.com/w/cpp/error/invalid_argument>
* `operator overloading`: <https://en.cppreference.com/w/cpp/language/operators>
* `friend`: <https://en.cppreference.com/w/cpp/language/friend>
* `std::string`: <https://en.cppreference.com/w/cpp/string/basic_string>
* `destructors`: <https://en.cppreference.com/w/cpp/language/destructor>
* `copy constructor`: <https://en.cppreference.com/w/cpp/language/copy_constructor>
* `move constructor`: <https://en.cppreference.com/w/cpp/language/move_constructor>
* `copy assignment operator`: <https://en.cppreference.com/w/cpp/language/as_operator.html>
* `move assignment operator`: <https://en.cppreference.com/w/cpp/language/move_assignment>
* `rule of three/five/zero`: <https://en.cppreference.com/w/cpp/language/rule_of_three>
* `template`: <https://en.cppreference.com/w/cpp/language/templates>
* `lambda expressions`: <https://en.cppreference.com/w/cpp/language/lambda>
* `derived classes`: <https://en.cppreference.com/w/cpp/language/derived_class>

### Qt

* `Qt 6 Documentation`: <https://doc.qt.io/qt.html>
* `Qt Widgets Documentation`: <https://doc.qt.io/qt-6/qtwidgets-index.html>
* `QMainWindow`: <https://doc.qt.io/qt-6/qmainwindow.html>
* `QTextEdit`: <https://doc.qt.io/qt-6/qtextedit.html>
* `QPushButton`: <https://doc.qt.io/qt-6/qpushbutton.html>
* `QVBoxLayout`: <https://doc.qt.io/qt-6/qvboxlayout.html>
* `QHBoxLayout`: <https://doc.qt.io/qt-6/qhboxlayout.html>
* `QMenuBar`: <https://doc.qt.io/qt-6/qmenubar.html>
* `QMenu`: <https://doc.qt.io/qt-6/qmenu.html>
* `QAction`: <https://doc.qt.io/qt-6/qaction.html>
* `QFileDialog`: <https://doc.qt.io/qt-6/qfiledialog.html>
* `QFile`: <https://doc.qt.io/qt-6/qfile.html>
* `QTextStream`: <https://doc.qt.io/qt-6/qtextstream.html>
* `QString`: <https://doc.qt.io/qt-6/qstring.html>
* `QKeySequence`: <https://doc.qt.io/qt-6/qkeysequence.html>
