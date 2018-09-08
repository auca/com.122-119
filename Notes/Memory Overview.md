# Memory in Java

## Categories of Data Types

### Primitive Data Types

 - small
 - stored on the stack (local variables)

---

 * `byte`, `short`, `int`, `long`
 * `float`, `double`
 * `char`
 * `boolean`
 * references (an address, or `null`)

### Reference Data Types

 - theoretically can be large
 - the data of reference data types will go to the heap
 - the location of that data on the heap (what we call a reference) will go to
   the stack (for local variables)

---

 * Arrays
 * Any object of some class

## Types of Memory

### Stack
 - small and fixed in size (2-64 MB)
 - allocation, deallocation ops are very fast
 - order of allocation and deallocation matters

### Heap (Dynamic Memory)
 - a lot (limited by OS or hardware)
 - allocation, deallocation ops compared to stack are much slower
 - order of allocation and deallocation does not matter (you are in control)

## Stack

```
1, 2, 3, 4, 5, 6

push 1
push 2
push 3

 543210
[123|--]
     ^
     1
     >

Stack pointer will be at position 1
```

### Stack Allocation

1. put the value at the position of the stack pointer
2. stack pointer = stack pointer +/- 1

### Stack Dealocation

1. stack pointer = stack pointer +/- 1

## Stack and Heap

Consider the following code

```java
int[] numbers = new int[10];
```

The memory layout on some big endian system with a stack that grows toward
higher memory addresses could be something similar to the following

```
SP = Stack Pointer
*  = Some data (that we don't care about in this example)

Memory {
    Stack (Address: Data)
     0: 0
     1: 0
     2: 0
     3: 102 -------------|
SP-> 4: ...              |
                         |
                         |
    Heap                 |
     100: *              |
     101: *              |
     102: 0 <-------------
     103: 0
     ...
     142: 0 // the end is at 142 as 10 elements of the int data
     ...    // type (4 bytes in size) occupy 40 bytes in total
     1234: *
     ...
}
```

* Stack can grow up or down on different systems.
* Byte ordering can be different on different machines (Big and Little Endian
  [Systems](https://www.cs.umd.edu/class/sum2003/cmsc311/Notes/Data/endian.html))

## Pass-by-value or pass-by-reference?

In Java data is passed-by-value to methods. It means, a copy of a parameter is
used as a method's argument.

Note that for reference data types, the copy of the reference is created and NOT
of the data of the array or the object itself.

```
... static void main... {
    int[] numbers;
    number = new int[1000000];
    printArray(numbers); // the reference is copied (but not the array data)
}

... static void printArray(int[] numbers) {
   for (int number : numbers) {
       System.out.println(number);
   }
}
```

