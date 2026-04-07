Object-oriented Programming, Practice #6
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

1. Install Qt 6 with the system package manager by running `sudo apt install qt6-base-dev libqt6svg6` in the Terminal application.
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

### Problem #1: A Text Transform Hierarchy

Create a file `text_transform.h` with an abstract base class `text_transform` that has:

* A `protected` constructor that takes a `std::string` name and stores it in a `private` member.
* A non-virtual `name()` method that returns the stored name.
* A pure virtual `apply()` method:

```cpp
[[nodiscard]] virtual std::string apply(const std::string& text) const = 0;
```

The constructor is `protected` so the base class cannot be instantiated directly, only through a derived class.

Derive `uppercase_transform` and `lowercase_transform` from it. Each derived class passes its name to the base constructor and overrides `apply()`.

Then create `test_transforms.cpp`, a console program that:

1. Creates a `std::vector<std::unique_ptr<text_transform>>` and populates it with one instance of each transform.
2. Prints the list of available transforms.
3. Applies each transform to the sample text `"hello, world! how are you?"` and prints the result.

Expected output:

```
Available text transforms:
  1. To Uppercase
  2. To Lowercase

Original text: "hello, world! how are you?"
After "To Uppercase": "HELLO, WORLD! HOW ARE YOU?"
After "To Lowercase": "hello, world! how are you?"
```

### Problem #2: Capitalize Words

Add a `capitalize_transform` class to `text_transform.h`. It passes `"Capitalize Words"` to the base constructor and capitalizes the first letter of every word (a word begins after any whitespace character). Extend the console test to include it.

Expected output:

```
Available text transforms:
  1. To Uppercase
  2. To Lowercase
  3. Capitalize Words

Original text: "hello, world! how are you?"
After "To Uppercase": "HELLO, WORLD! HOW ARE YOU?"
After "To Lowercase": "hello, world! how are you?"
After "Capitalize Words": "Hello, World! How Are You?"
```

Note how the same loop in `test_transforms.cpp` processes all three transforms without knowing their concrete types. This is subtype polymorphism in action.

### Problem #3: Text Case Menu

![Format menu with Text Case submenu showing three transforms](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-6/01.png)

Integrate the transform hierarchy into the Notepad application:

* Add a member `std::vector<std::unique_ptr<text_transform>> transforms` to `main_window`.
* Populate it in the constructor with instances of `uppercase_transform`, `lowercase_transform`, and `capitalize_transform`.
* Add a `Format` menu with a `Text Case` submenu. Build the submenu by iterating the vector: each transform becomes one menu action labeled with its `name()`.
* When an action is triggered, apply the transform to the selected text (if any selection exists) or to the entire document (if nothing is selected).

The menu-building loop must not be modified when a new transform subclass is added, the new item must appear automatically.

### Problem #4: Format Toolbar

![Format toolbar with Bold, Italic, Underline buttons](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-6/02.png)

The repository already contains SVG icons in `data/images/` (`bold.svg`, `italic.svg`, `underline.svg`). Add a Format toolbar (using `addToolBar`) with three actions loaded from those files. Set the icon size to 16x16 with `toolbar->setIconSize(QSize(16, 16))`.

```cpp
auto* action_bold = toolbar->addAction(QIcon("data/images/bold.svg"), "Bold");
```

For each action:

* Call `setCheckable(true)` so the button visually stays pressed while the format is active.
* Assign a keyboard shortcut: `Ctrl+B`, `Ctrl+I`, `Ctrl+U` (Qt maps `Ctrl` to `Cmd` on macOS).
* Apply the format using `QTextCharFormat` and `editor->mergeCurrentCharFormat()`, using the `bool checked` parameter passed to the `triggered` signal rather than re-reading the current format.

Connect `QTextEdit::currentCharFormatChanged` to a slot that updates the checked state of all three buttons as the cursor moves through the document.

If the icons do not appear at runtime, open the CLion run configuration and set Working Directory to `$ProjectFileDir$` so that relative paths like `data/images/bold.svg` resolve correctly.

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapters 9–16.

### Problem #5: Two New Transforms

![Format menu Text Case submenu with new transforms added](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-6/03.png)

Add two new `text_transform` subclasses to `text_transform.h`:

* `sentence_case_transform`: capitalize the first letter of every sentence (i.e., after each period `.` or at the very start of the text), and lowercase everything else.
* `swap_case_transform`: swap uppercase letters to lowercase and lowercase letters to uppercase.

Both transforms must appear automatically in the `Format` > `Text Case` submenu without any change to the menu-building code. If they do not, your implementation does not use polymorphism correctly.

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, .clang-format, CMakeLists.txt, Readme.md)
├── main.cpp
├── main_window.h
├── main_window.cpp
├── text_transform.h
├── test_transforms.cpp
└── data/
    └── images/
        ├── bold.svg
        ├── italic.svg
        └── underline.svg
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
* `virtual functions`: <https://en.cppreference.com/w/cpp/language/virtual>
* `abstract classes`: <https://en.cppreference.com/w/cpp/language/abstract_class>
* `std::unique_ptr`: <https://en.cppreference.com/w/cpp/memory/unique_ptr>
* `std::make_unique`: <https://en.cppreference.com/w/cpp/memory/unique_ptr/make_unique>
* `std::vector`: <https://en.cppreference.com/w/cpp/container/vector>
* `std::transform`: <https://en.cppreference.com/w/cpp/algorithm/transform>
* `std::toupper / std::tolower`: <https://en.cppreference.com/w/cpp/string/byte/toupper>

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
* `QToolBar`: <https://doc.qt.io/qt-6/qtoolbar.html>
* `QTextCharFormat`: <https://doc.qt.io/qt-6/qtextcharformat.html>
* `QTextCursor`: <https://doc.qt.io/qt-6/qtextcursor.html>
