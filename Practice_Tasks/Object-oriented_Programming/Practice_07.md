Object-oriented Programming, Practice #7
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

### Problem #1: Find / Replace Dialog

![Find / Replace dialog open](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-7/01.png)

Add a `Search` menu to the Notepad application with a single item `Find / Replace...` (shortcut `Ctrl+F`).

Clicking the item opens a modeless `QDialog` with `windowTitle` set to `Find / Replace`. Build the dialog's UI by creating a `find_replace_dialog.ui` file in Qt Creator with the following widgets:

* A `QFormLayout` containing three rows:
    - A `QLineEdit` named `find_input` with the label `Find:`.
    - A `QLineEdit` named `replace_input` with the label `Replace:`.
    - A `QCheckBox` named `case_sensitive_check` with the text `Case Sensitive`, placed in the field column (row 2, column 1) so it lines up with the two text inputs instead of sitting against the dialog's left edge.
* A `QHBoxLayout` with four `QPushButton`s:
    - `Find Next`, named `find_next_button` (set as the dialog's default button).
    - `Replace`, named `replace_button`.
    - `Replace All`, named `replace_all_button`.
    - `Close`, named `close_button`.

List `find_replace_dialog.ui` inside `qt_add_executable()` in `CMakeLists.txt` so that AUTOUIC generates `ui_find_replace_dialog.h` automatically.

The grader captures its screenshots under a headless display (`Xvfb`, no window manager), so the dialog window frame and title bar are not drawn in them. Set the `windowTitle` property on your `.ui` correctly anyway, because the grader uses it to locate the dialog.

Clicking `Find Next` should call the starter helper `find_next(const QString& term, QTextDocument::FindFlags flags)` declared in `main_window.h`. The helper searches forward from the current cursor position (wrapping to the start of the document when nothing is found below) and moves the editor cursor to the match. Pass it the text of `find_input` and a flag value that includes `QTextDocument::FindCaseSensitively` when `case_sensitive_check` is checked.

### Problem #2: Replace and Replace All

Wire up the remaining buttons to the starter helpers `replace_current(const QString& term, const QString& replacement, QTextDocument::FindFlags flags)` and `replace_all(...)` (same signature), both declared in `main_window.h`. Pass the same term and flags you build for `Find Next`, plus the replacement text from `replace_input`.

* `Replace` calls `replace_current`, which replaces the current selection (the last `Find Next` hit) with the replacement text and then advances to the next match.
* `Replace All` calls `replace_all`, which moves the cursor to the start of the document and replaces every match until no more remain.

Keep the widgets' tab order in declaration order: `find_input`, `replace_input`, `case_sensitive_check`, then the four buttons from left to right. Qt uses declaration order by default, so do not add a custom `<tabstops>` block.

### Problem #3: Word Frequency

![Word Frequency dialog showing sorted word counts](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-7/02.png)

Add a `Tools` menu with one item `Word Frequency...`. Clicking it opens a modal `QDialog` with `windowTitle` set to `Word Frequency` that shows every unique word in the editor (lowercase, stripped of non-alphabetic characters) together with its occurrence count, sorted by frequency descending.

Build the dialog's UI by creating a `word_frequency_dialog.ui` file in Qt Creator with a `QTableWidget` named `frequency_table` having two columns (`Word` and `Count`). For a clean, modern look: hide the vertical header, set `editTriggers` to `NoEditTriggers`, enable `alternatingRowColors`, and disable the grid. List `word_frequency_dialog.ui` inside `qt_add_executable()` in `CMakeLists.txt` so that AUTOUIC generates `ui_word_frequency_dialog.h` automatically.

The grader captures its screenshots under a headless display (`Xvfb`, no window manager), so the dialog window frame and title bar are not drawn in them. Set the `windowTitle` property on your `.ui` correctly anyway, because the grader uses it to locate the dialog.

Use `std::map<std::string, int>` to accumulate counts, then copy the entries into a `std::vector<std::pair<std::string, int>>` and sort with `std::sort` and a lambda comparator. Populate the table with `setRowCount(...)` and `setItem(row, column, new QTableWidgetItem(...))`. Stretch the first column to fill the dialog width and size the last column to its contents via `horizontalHeader()->setSectionResizeMode(...)`. Right-align the count values with `setTextAlignment(Qt::AlignRight | Qt::AlignVCenter)` so the numbers line up against the column edge. Align the headers to match the cells below them by calling `setTextAlignment` on `horizontalHeaderItem(0)` (left) and `horizontalHeaderItem(1)` (right).

### Problem #4: Parametric Polymorphism with `my::sort`

Create `sort.h` implementing a generic selection-sort in namespace `my`:

```cpp
namespace my {

template <typename Iterator, typename Comparator>
void sort(Iterator begin, Iterator end, Comparator comp);

template <typename Iterator>
void sort(Iterator begin, Iterator end);

}
```

The two-parameter overload performs selection sort using `comp`. The one-parameter overload calls the two-parameter version with a default `operator<` comparator.

Create `test_sort.cpp` that demonstrates all three usage patterns:

1. Sorting `std::vector<int>` with the default comparator.
2. Sorting `std::vector<std::string>` with the default comparator.
3. Sorting `std::vector<std::pair<std::string, int>>` with a lambda that orders by count descending.

Expected output:

```
Sorting integers with my::sort (default operator<):
Before: 8 2 6 5 1 9 3
After:  1 2 3 5 6 8 9

Sorting strings with my::sort (default operator<):
Before: Java C++ Kotlin C# Scala C
After:  C C# C++ Java Kotlin Scala

Sorting word frequencies with my::sort (lambda: by count descending):
Before: { "apple": 2 } { "banana": 5 } { "cherry": 1 } { "date": 3 }
After:  { "banana": 5 } { "date": 3 } { "apple": 2 } { "cherry": 1 }
```

---

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapters 9–16.

### Problem #5: Live Word and Line Count

![Status bar showing word and line count](https://raw.githubusercontent.com/rachmiroff/images/refs/heads/main/auca/com-119/spring-2026/practice-7/03.png)

Add a status bar that displays the current word count and line count, updating live as the user types. Connect `QTextEdit::textChanged` to a slot that reads `editor->toPlainText()`, splits it to count words and lines, and calls `statusBar()->showMessage(...)`.

The status bar message must use exactly this format: `Words: N  Lines: N` (two spaces between the two counters).

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
├── sort.h
├── test_sort.cpp
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
