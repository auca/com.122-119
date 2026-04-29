Object-oriented Programming, Practice #8
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

When you first open the project in CLion, edit the run configuration and set Working Directory to `$ProjectFileDir$` so that relative paths like `data/images/bold.svg` resolve correctly. Otherwise the toolbar icons will not appear at runtime.

The grader matches the main window by its `windowTitle`. Keep `Notepad` as the title when no file is open. The starter `update_title()` switches to `Notepad: <path>` after a file is loaded; the grader accepts any title that begins with `Notepad`, so if you change the format, keep `Notepad` as the prefix. The `QMessageBox::critical` dialog from Problem #5 must use the title `Error` exactly.

### Problem #1: An Exception Hierarchy

Create a file `notepad_exception.h` with an exception class hierarchy:

```
std::runtime_error
  └── notepad_exception(message)
        ├── file_not_found_exception(filename)
        ├── file_read_exception(filename)
        └── file_write_exception(filename)
```

The base class `notepad_exception` derives from `std::runtime_error` (defined in `<stdexcept>`). It takes a message string and forwards it to the base. Each derived class takes a filename and builds a descriptive message:

* `file_not_found_exception`: `"File not found: '<filename>'"`
* `file_read_exception`: `"Failed to read file: '<filename>'"`
* `file_write_exception`: `"Failed to write file: '<filename>'"`

Use a member-initializer list to forward the message to the parent constructor:

```cpp
class notepad_exception : public std::runtime_error {
public:
    explicit notepad_exception(const std::string& message)
        : std::runtime_error(message)
    {
    }
};
```

Follow this pattern for the three derived classes, building each message from the filename argument. `std::runtime_error` already provides `what()`, so you do not need to declare or override it.

### Problem #2: Single Catch

Create `test_exceptions.cpp`, a console program that exercises the new hierarchy. Include `<iostream>` for output and `"notepad_exception.h"` for the exception types.

Add a function `test_single_catch()` that throws a `file_not_found_exception("missing.txt")` inside a `try` block and catches it by reference as `const notepad_exception&`. Print the message text from `ex.what()`. Catching the derived exception through a base reference works because of polymorphism, the same idea as the `text_transform` hierarchy from Practice #6.

Call `test_single_catch()` from `main()`. Expected output:

```
Test 1: Single catch
Caught notepad_exception: File not found: 'missing.txt'
```

### Problem #3: Multiple Catches

Add a function `test_multiple_catches()` that demonstrates how the type of the thrown exception decides which `catch` handler runs. Each sub-test uses the same three handlers in the same order, most specific first and most general last:

```cpp
try {
    // throw something
} catch (const file_not_found_exception& ex) {
    std::cout << "Test 2X: Caught file_not_found_exception: " << ex.what() << "\n";
} catch (const notepad_exception& ex) {
    std::cout << "Test 2X: Caught notepad_exception: " << ex.what() << "\n";
} catch (const std::exception& ex) {
    std::cout << "Test 2X: Caught std::exception: " << ex.what() << "\n";
}
```

Throw a different exception in each sub-test. Only the matching handler runs:

| Sub-test | Throws                                    | Handler that runs          |
|----------|-------------------------------------------|----------------------------|
| 2a       | `file_not_found_exception("missing.txt")` | `file_not_found_exception` |
| 2b       | `file_read_exception("corrupt.dat")`      | `notepad_exception`        |
| 2c       | `std::runtime_error("Unknown error")`     | `std::exception`           |

Add `<stdexcept>` to the includes for `std::runtime_error`. The order of handlers matters: a more general handler placed first would shadow the more specific ones below it. Call `test_multiple_catches()` from `main()` after `test_single_catch()`.

Expected output of this test:

```
Test 2: Multiple catches
Test 2a: Caught file_not_found_exception: File not found: 'missing.txt'
Test 2b: Caught notepad_exception: Failed to read file: 'corrupt.dat'
Test 2c: Caught std::exception: Unknown error
```

### Problem #4: Rethrow

Add a helper `open_file_inner(filename)` that throws a `file_not_found_exception(filename)`, catches it as `notepad_exception`, prints `"Inner catch in open_file: <ex.what()>"` and `"Rethrowing..."`, then rethrows the exception with the bare statement `throw;`.

Use `throw;` (with no argument), not `throw ex;`. The bare form rethrows the exact original exception preserving its dynamic type. `throw ex;` would copy `ex` into a new `notepad_exception` and lose the `file_not_found_exception` identity, an effect known as object slicing.

Add a function `test_rethrow()` that calls `open_file_inner("missing.txt")` from inside a `try` block and catches the rethrown exception, printing `"Outer catch in main: <ex.what()>"`. Call it from `main()` after the previous tests.

Expected output of this test:

```
Test 3: Rethrow
Inner catch in open_file: File not found: 'missing.txt'
Rethrowing...
Outer catch in main: File not found: 'missing.txt'
```

Full expected output of `test_exceptions`:

```
Test 1: Single catch
Caught notepad_exception: File not found: 'missing.txt'

Test 2: Multiple catches
Test 2a: Caught file_not_found_exception: File not found: 'missing.txt'
Test 2b: Caught notepad_exception: Failed to read file: 'corrupt.dat'
Test 2c: Caught std::exception: Unknown error

Test 3: Rethrow
Inner catch in open_file: File not found: 'missing.txt'
Rethrowing...
Outer catch in main: File not found: 'missing.txt'
```

End each `test_*` function with `std::cout << "\n";` so the tests are separated by blank lines, as shown above.

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapters 9–16.

### Problem #5: Integrate Exception Handling into Notepad

![Notepad showing QMessageBox critical error dialog](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-8/01.png)

Modify `open_file()` and `save_file()` in `main_window.cpp` so that file errors throw exceptions and reach the user as a critical message box.

In `open_file()`, replace the early-return on the file-open path with three distinct checks. First, call `QFile::exists()` and throw `file_not_found_exception(path.toStdString())` if the file is not on disk. Second, call `QFile::open()` and throw `file_read_exception(path.toStdString())` if opening fails for any other reason (no read permission, the file is locked, and so on). Third, after `in.readAll()`, check `in.status()` and throw `file_read_exception(path.toStdString())` if the stream did not finish cleanly (corrupt encoding or a mid-stream I/O error). Wrap the file-handling body in `try / catch (const notepad_exception& ex)` that calls `QMessageBox::critical(this, "Error", ex.what())`:

```cpp
void main_window::open_file()
{
    const auto path = QFileDialog::getOpenFileName(this, "Open File");
    if (path.isEmpty()) {
        return;
    }
    try {
        QFile file(path);
        if (!file.exists()) {
            throw file_not_found_exception(path.toStdString());
        }
        if (!file.open(QIODevice::ReadOnly | QIODevice::Text)) {
            throw file_read_exception(path.toStdString());
        }
        QTextStream in(&file);
        const auto contents = in.readAll();
        if (in.status() != QTextStream::Ok) {
            throw file_read_exception(path.toStdString());
        }
        editor->setPlainText(contents);
        current_file = path;
        update_title();
    } catch (const notepad_exception& ex) {
        QMessageBox::critical(this, "Error", ex.what());
    }
}
```

`QString::toStdString()` converts the path to the `std::string` that the exception constructor expects. The dialog title must be `Error` exactly. `QTextStream` does not throw on read errors; it sets `status()` to `ReadPastEnd` or `ReadCorruptData`, which is why the explicit check is needed. To test the read-error branch, run `chmod 0 some.txt` on a file you own and try to open it: the `file.exists()` check passes, `file.open(...)` fails, and the user sees `Failed to read file: '...'`. The file-not-found branch is hard to reach through the file dialog (both native and Qt-rendered dialogs disable `Open` on missing paths) and mostly guards a time-of-check-to-time-of-use (TOCTOU) race where the file disappears between the dialog confirming it exists and `QFile::open()` running a few milliseconds later; if you want to verify it manually, hardcode a non-existent path in `open_file()` for one run.

Apply the same pattern to `save_file()`. If `QFile::open(...)` fails, throw `file_write_exception(current_file.toStdString())` and catch it identically.

Add the new includes to `main_window.cpp`:

```cpp
#include "notepad_exception.h"

#include <QMessageBox>
```

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, .clang-format, CMakeLists.txt, Readme.md)
├── main.cpp
├── main_window.h
├── main_window.cpp
├── text_transform.h
├── find_replace_dialog.ui
├── word_frequency_dialog.ui
├── notepad_exception.h
├── test_exceptions.cpp
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
* `std::sort`: <https://en.cppreference.com/w/cpp/algorithm/sort>
* `std::map`: <https://en.cppreference.com/w/cpp/container/map>
* `std::pair`: <https://en.cppreference.com/w/cpp/utility/pair>

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
* `QDialog`: <https://doc.qt.io/qt-6/qdialog.html>
* `QTextDocument::find`: <https://doc.qt.io/qt-6/qtextdocument.html#find>
* `QStatusBar`: <https://doc.qt.io/qt-6/qstatusbar.html>
* `Qt Designer / .ui files`: <https://doc.qt.io/qt-6/designer-using-a-ui-file.html>
* `QMessageBox`: <https://doc.qt.io/qt-6/qmessagebox.html>
