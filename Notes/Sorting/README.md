# Sorting Algorithms

Sorting Algorithms are methods of reorganizing a large number of items into some specific order such as highest to lowest, or vice-versa, or even in some alphabetical order.

These algorithms take an input list, process it (i.e., perform some operations on it) and produce the sorted list.

The most common example we experience every day is sorting clothes or other items on an e-commerce website either by lowest-price to highest, or list by popularity, or some other order.

### Some examples of Sorting Algorithms:

- [Insertion Sort](./InsertionSort.md) — [Code](../../src/main/java/io/github/drmanan/learn/sort/InsertionSort.java)

  ![Insertion Sort Example](../../Assets/Insertion-sort-example-300px.gif)

- [Selection Sort](./SelectionSort.md) — [Code](../../src/main/java/io/github/drmanan/learn/sort/SelectionSorting.java)

  ![Selection Sort Example](../../Assets/Selection-Sort-Animation.gif)

- Quick Sort — [Code](../../src/main/java/io/github/drmanan/learn/sort/QuickSorting.java)

- Bubble Sort
 
- Merge Sort — [Code](../../src/main/java/io/github/drmanan/learn/sort/MergeSort.java)
 
- Heap Sort— [Code](../../src/main/java/io/github/drmanan/learn/sort/HeapSort.java)
 
- Radix Sort

- Bucket Sort

### Time Complexities of Sorting Algorithms:

| **Algorithm**      | **Best**    | **Average** | **Worst **   |
|--------------------|-------------|-------------|--------------|
| **Quick Sort**     | Ω(n log(n)) | Θ(n log(n)) | O(n^2)       |
| **Bubble Sort**    | Ω(n)        | Θ(n^2)      | O(n^2)       |
| **Merge Sort**     | Ω(n log(n)) | Θ(n log(n)) | O(n log(n))  |
| **Insertion Sort** | Ω(n)        | Θ(n^2)      | O(n^2)       |
| **Selection Sort** | Ω(n^2)      | Θ(n^2)      | O(n^2)       |
| **Heap Sort**      | Ω(n log(n)) | Θ(n log(n)) | O(n log(n))  |
| **Radix Sort**     | Ω(nk)       | Θ(nk)       | O(nk)        |
| **Bucket Sort**    | Ω(n+k)      | Θ(n+k)      | O(n^2)       |
