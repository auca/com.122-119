# Memory in Java

## Categories of Data Types

### Primitive Data Types

 - small
 - stored on the stack (local variables)

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

 * Arrays
 * Any class

## Types of Memory

### Stack
 - small and fixed in size (2-64 MB)
 - allocation, deallocation ops are very fast
 - order of allocation and deallocation matters

### Heap (Dynamic Memory)
 - a lot (limited by OS or hardware)
 - allocation, deallocation ops compared to stack are much slower
 - order of allocation and deallocation does not matter (you are in controll)

## Stack

1, 2, 3, 4, 5, 6

 543210
[123|--]
   ^
   3

### Stack Allocation

1. put the value at position of the stack pointer
2. stack pointer = stack pointer - 1

### Stack Dealocation

1. stack pointer = stack pointer + 1

## Stack and Heap

```
Memory {
    Stack
     0 0
     1 0
     2 0
     3 102 --------------|
SP-> 4 ...               |
                         |
                         |
    Heap                 |
     100  ****           |
     101  ****           |
     102: 0 <-------------
     103: 0
     ...
     112: 0
     ...
     1234
     ...
}
```

Stack can grow up or down on different systems.

## Pass-by-value or pass-by-reference?

In Java data is pass-by-value to methods. It means, a copy of a parameter is
used as a method argument.

Note that for reference data types, the copy of the reference is created and NOT
of the data of the array or the object itself.

```
... void main... {
    int[] numbers;
    number = new int[1000000];
    printArray(numbers); // the reference is copied (but no the array data)
}

void printArray(int[] numbers) {
   for (int number : numbers) {
       System.out.println(number);
   }
}
```

