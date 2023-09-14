package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create array and print it
        int[] array = {7, 5, 2, 4, 1, 6, 3, 0};
        System.out.println(Arrays.toString(array));

        // call mergeSort to sort array and print sorted array
        mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] a, int n) {

        if (n < 2) {
            return;
        }

        // find the middle index of the array
        int mid = n / 2;

        // create two sub-arrays
        // each sub-array contains half of the elements
        int[] l = new int[mid]; //left is allocated memory for middle elements
        int[] r = new int[n - mid]; //right is allocated memory for the remaining elements in the original array (length - mid)

        // copy elements at the beginning of the main array to the left sub-array
        for (int i = 0; i < mid; i++) { //for loop to iterate over the indices of the left subarray (from 0 to mid - 1).
            l[i] = a[i]; //Since middle represents the length of the left subarray,  we copy elements from the beginning of the original array (arr) up to the middle index.
        }

        // copy elements from the midpoint of the main array to the right sub-array
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        // make a recursive call to mergeSort passing the left and right sub-arrays
        // this will continue to divide each sub-array in half
        // until there are N sub-arrays each holding one element
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        // take the sub-arrays and merge them
        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        // Merge elements from left and right subarrays back into the original array
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        // Copy any remaining elements from left subarray (if any)
        while (i < left) {
            a[k++] = l[i++];
        }
        // Copy any remaining elements from right subarray (if any)
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}