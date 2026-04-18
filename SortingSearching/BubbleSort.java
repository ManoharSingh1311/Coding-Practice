package SortingSearching;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Performing Bubble Sort (Optimized):");
        bubbleSortOptimal(arr);

        // Print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    // ✅ Basic Bubble Sort
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ✅ Optimized Bubble Sort
    public static void bubbleSortOptimal(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true; // reset every pass

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // If no swaps → already sorted
            if (isSorted) {
                break;
            }
        }
    }
    // ✅ Recursive Bubble Sort
    public static void bubbleSortRecursive(int[] arr, int n) {
        // Base case
        if (n == 1) {
            return;
        }

        // One pass (same as inner loop)
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        // Recursive call for remaining array
        bubbleSortRecursive(arr, n - 1);
    }
}