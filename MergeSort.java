import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Unsorted array: " + Arrays.toString(array));

        mergeSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return; // Base case: If the array has 1 or 0 elements, it's already sorted.
        }

        int middle = arr.length / 2;

        // Create two subarrays, left and right
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        // Copy data to left and right subarrays
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }

        // Recursively sort both subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right subarrays back into the original array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy any remaining elements from left subarray (if any)
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy any remaining elements from right subarray (if any)
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
