package com.java.sorting;

public class quicksort {
    // QuickSort function
    public static void quicksort(int[] arr, int low, int high) {
        if(low < high) {
            // Partition the array, get pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    // Partition function
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1;       // index of smaller element

        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }
}
