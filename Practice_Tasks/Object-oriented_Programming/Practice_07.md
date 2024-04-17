Object-oriented Programming, Practice #7
========================================

## Developer Tools

* [CLion](https://www.jetbrains.com/clion/download)
* [Git SCM](https://git-scm.com)

## Important Notes

The checkpoints will be graded based on the output of your programs, the correctness of the structure of your repository, and the style of your code. You may be penalized and receive a lower grade if the printed text by your program does not match (wrong letters, additional spaces, or newlines, incorrectly computed result) the correct one. Please check your code and output before submitting it to GitHub or Moodle. Ensure the outcome of your program matches the specified output on this page. Do not forget to print a `\n` control sequence to go to a new line after the last message from your program. Format real numbers precisely to the number of decimal places specified in the sample output. Ensure that your code style is consistent, meaning the code is properly indented, groups of code are separated by blank lines, variable names are consistent in naming style, and describe in a compact manner the data stored in them. Your files and directories must be properly named as per the requirements outlined at the bottom of the page. Moreover, your repository should not contain additional files with unrelated code, especially within the folder designated for lab tasks. If you are told to use a particular function, you must base your solution on that function even if there exists a better solution without the use of it. Do not hesitate to contact your practice instructor if you have any questions.

## Problem #1: Sorting with `std::sort`

Write a program to sort

* An arbitrary array of integer values (`int`)
* An arbitrary array of long integer values (`long long`)
* An arbitrary array of `std::string` values
* An arbitrary array of `rational` numbers from Practice 3

...with the method `std::sort` function from the `<algorithm>` STL header.

For the given data in `main`

```C++
vector<int> integers = {
    8, 2, 6, 5, 1, 9, 3
};

// ...

vector<long long> long_long_integers = {
    98765432101234567, 1234567890123456, 234567890123456789, 34567890123456789
};

// ...

vector<string> strings = {
    "Java", "C++", "Kotlin", "C#", "Scala", "C"
};

// ...

vector<rational> rationals = {
    rational("5/7"),
    rational("1/2"),
    rational("7/2"),
    rational("1/3")
};
```

Your program should generate the following output

```
Sorting Integers (`int` type)
Before:
8 2 6 5 1 9 3 
After:
1 2 3 5 6 8 9 

Sorting `long long` Integers
Before:
98765432101234567 1234567890123456 234567890123456789 34567890123456789 
After:
1234567890123456 34567890123456789 98765432101234567 234567890123456789 

Sorting Strings
Before:
Java C++ Kotlin C# Scala C 
After:
C C# C++ Java Kotlin Scala 

Sorting Rationals
Before:
5/7 1/2 7/2 1/3 
After:
1/3 1/2 5/7 7/2 

```

## Problem #2: Sorting with `std::sort` and Lambdas

Write a program to sort an arbitrary array of students by

* Name (lexicographically)
* GPA (in non-decreasing order)
* Birth year

Use `std::sort` to sort the data again. Create the `student` class with the fields `name`, `GPA`, and `birth_year`.

For the given data in `main`

```C++
vector<student> students = {
    student("Student D", 2.5, 1998),
    student("Student A", 4.0, 2001),
    student("Student B", 3.0, 2001),
    student("Student C", 3.5, 2000)
};

```

Your program should generate the following output

```
Sorting Students by Name
Before:
{ "name" = "Student D", "gpa" = 2.5, "birth_year" = 1998 }
{ "name" = "Student A", "gpa" = 4, "birth_year" = 2001 }
{ "name" = "Student B", "gpa" = 3, "birth_year" = 2001 }
{ "name" = "Student C", "gpa" = 3.5, "birth_year" = 2000 }
After:
{ "name" = "Student A", "gpa" = 4, "birth_year" = 2001 }
{ "name" = "Student B", "gpa" = 3, "birth_year" = 2001 }
{ "name" = "Student C", "gpa" = 3.5, "birth_year" = 2000 }
{ "name" = "Student D", "gpa" = 2.5, "birth_year" = 1998 }

Sorting Students by GPA
Before:
{ "name" = "Student A", "gpa" = 4, "birth_year" = 2001 }
{ "name" = "Student B", "gpa" = 3, "birth_year" = 2001 }
{ "name" = "Student C", "gpa" = 3.5, "birth_year" = 2000 }
{ "name" = "Student D", "gpa" = 2.5, "birth_year" = 1998 }
After:
{ "name" = "Student D", "gpa" = 2.5, "birth_year" = 1998 }
{ "name" = "Student B", "gpa" = 3, "birth_year" = 2001 }
{ "name" = "Student C", "gpa" = 3.5, "birth_year" = 2000 }
{ "name" = "Student A", "gpa" = 4, "birth_year" = 2001 }

Sorting Students by Birth Year
Before:
{ "name" = "Student D", "gpa" = 2.5, "birth_year" = 1998 }
{ "name" = "Student B", "gpa" = 3, "birth_year" = 2001 }
{ "name" = "Student C", "gpa" = 3.5, "birth_year" = 2000 }
{ "name" = "Student A", "gpa" = 4, "birth_year" = 2001 }
After:
{ "name" = "Student D", "gpa" = 2.5, "birth_year" = 1998 }
{ "name" = "Student C", "gpa" = 3.5, "birth_year" = 2000 }
{ "name" = "Student B", "gpa" = 3, "birth_year" = 2001 }
{ "name" = "Student A", "gpa" = 4, "birth_year" = 2001 }

```

## Problem #3: Sorting with a Custom `my::sort` Function

Write your own `sort` function in a namespace `my` of a file `sort.h` that can work with arbitrary data as long as a less than operator is overloaded or the lambda to compare two values is specified.

Sort:

* An arbitrary array of integer values
* An arbitrary array of `student` values by name (lexicographically)
* An arbitrary array of `rational` values

For the given data in `main`

```C++
vector<int> integers = {
    8, 2, 6, 5, 1, 9, 3
};

// ...

vector<student> students = {
    student("Student D", 2.5, 1998),
    student("Student A", 4.0, 2001),
    student("Student B", 3.0, 2001),
    student("Student C", 3.5, 2000)
};

// ...

vector<rational> rationals = {
    rational("5/7"),
    rational("1/2"),
    rational("7/2"),
    rational("1/3")
};
```

Your program should generate the following output

```
Sorting Integers (`int` type)
Before:
8 2 6 5 1 9 3 
After:
1 2 3 5 6 8 9 

Sorting Students by Name
Before:
{ "name" = "Student D", "gpa" = 2.5, "birth_year" = 1998 }
{ "name" = "Student A", "gpa" = 4, "birth_year" = 2001 }
{ "name" = "Student B", "gpa" = 3, "birth_year" = 2001 }
{ "name" = "Student C", "gpa" = 3.5, "birth_year" = 2000 }
After:
{ "name" = "Student A", "gpa" = 4, "birth_year" = 2001 }
{ "name" = "Student B", "gpa" = 3, "birth_year" = 2001 }
{ "name" = "Student C", "gpa" = 3.5, "birth_year" = 2000 }
{ "name" = "Student D", "gpa" = 2.5, "birth_year" = 1998 }

Sorting Rationals
Before:
5/7 1/2 7/2 1/3 
After:
1/3 1/2 5/7 7/2 

```

## Homework

Read Introduction to C++ Programming, 3rd Edition by Y. Daniel Liang, Chapter 9, 10, 11, 12, 14, 15, 16

## Expected Repository Structure

Upon completion of all assignments, your repository should look like this:

```
. (.idea, .gitignore, CMakeLists.txt, Readme.md)
├── problem1.cpp
├── problem2.cpp
├── problem3.cpp
├── rational.h
├── rational.cpp
├── sort.h
└── student.h
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
* `lambda expressions`: <https://en.cppreference.com/w/cpp/language/lambda>
* `algorithms`: <https://en.cppreference.com/w/cpp/algorithm>
* `sort`: <https://en.cppreference.com/w/cpp/algorithm/sort>
