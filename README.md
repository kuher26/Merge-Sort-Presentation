# Merge-Sort-Presentation

## How does Merge Sort work?
Merge sort is a recursive algorithm that continuously splits the array in half until it cannot be further divided i.e., the array has only one element left (an array with one element is always sorted). 

Then the sorted subarrays are merged into one sorted array.

### Division of array into subarrays

<p align="center"><img src="./merge-sort1.png" width="600"></p>


### Merging of sorted subarrays

<p align="center"><img src="./merge-sort2.png" width="600"></p>

## Applications of Merge Sort:

**Sorting large datasets:** Merge sort is particularly well-suited for sorting large datasets due to its guaranteed worst-case time complexity of O(n log n).  
**External sorting:** Merge sort is commonly used in external sorting, where the data to be sorted is too large to fit into memory.  
**Custom sorting:** Merge sort can be adapted to handle different input distributions, such as partially sorted, nearly sorted, or completely unsorted data.

### Time Complexity

Number of steps required, in the worst-case scenario, as the number of elements double.

| 2<sup>n</sup> | # elements | # steps | steps/element |
|---------------|------------|---------|---------------|
| 3             |      8     |    24   |       3       |
| 4             |     16     |    64   |       4       |
| 5             |     32     |   160   |       5       |
| 6             |     64     |   384   |       6       |
| 7             |     128    |   896   |       7       |

Inversion Count Problem

## Advantages of Merge Sort:
**Stability:** Merge sort is a stable sorting algorithm, which means it maintains the relative order of equal elements in the input array.  
**Guaranteed worst-case performance:** Merge sort has a worst-case time complexity of O(N logN), which means it performs well even on large datasets.  
**Parallelizable:** Merge sort is a naturally parallelizable algorithm, which means it can be easily parallelized to take advantage of multiple processors or threads.

## Drawbacks of Merge Sort:
**Space complexity:** Merge sort requires additional memory to store the merged sub-arrays during the sorting process.     
**Not in-place:** Merge sort is not an in-place sorting algorithm, which means it requires additional memory to store the sorted data. This can be a disadvantage in applications where memory usage is a concern.  
**Not always optimal for small datasets:** For small datasets, Merge sort has a higher time complexity than some other sorting algorithms, such as insertion sort. This can result in slower performance for very small datasets.  