Object-oriented Programming, Practice #8
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com/downloads)

---

## Important Notes

The checkpoint will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Moodle. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor if you have any questions.

---

## Homework

Read Chapter 16 up to the end in the Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang textbook.

### Homework Problem #1: Custom Exception Classes (16.5)

Read, try to understand, and rewrite the following code example from Chapter 16:

* Listing 16.11: `TestTriangle.cpp`

Keep the names of all files and classes the same.

Your program should generate the following output:

```
Perimeter is 3
Area is 0.433013
Invalid triangle three sides are 1 1 4

```

### Homework Problem #2: Multiple Catches (16.6)

Following the same instructions, rewrite the code example:

* Listing 16.14: `MultipleCatchDemo.cpp`

#### Sample Input and Output 1:

```
Enter three sides: 2 2.5 2.5
Perimeter is 7
Area is 2.29129

```

#### Sample Input and Output 2:

```
Enter three sides: -1 1 1
Non-positive side the side is -1

```

#### Sample Input and Output 3:

```
Enter three sides: 1 2 1
Invalid triangle three sides are 1 2 1

```

### Homework Problem #3: Rethrowing Exceptions (16.8)

Following the same instructions, rewrite the code example:

* Listing 16.15: `RethrowExceptionDemo.cpp`

Your program should generate the following output:

```
Exception caught in function f1
Exception in f1
Exception caught in function main
Exception in f1

```

---

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, Readme.md)
├── AbstractGeometricObject.h
├── AbstractGeometricObject.cpp
├── TriangleException.h
├── Triangle.h
├── NonPositiveSideException.h
├── NewTriangle.h
├── TestTriangle.cpp
├── MultipleCatchDemo.cpp
└── RethrowExceptionDemo.cpp
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
* `lambda expressions`: <https://en.cppreference.com/w/cpp/language/lambda>
* `algorithms`: <https://en.cppreference.com/w/cpp/algorithm>
* `sort`: <https://en.cppreference.com/w/cpp/algorithm/sort>
* `exceptions`: <https://en.cppreference.com/w/cpp/language/exceptions>
