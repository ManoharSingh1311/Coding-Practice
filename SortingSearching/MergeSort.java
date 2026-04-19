import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);  

        printArray(arr);
        sc.close();
    }

    public static void mergeSort(int[] arr, int l, int r) {

        if (l >= r) return;

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        for(int i = 0; i < n1; i++) {
            leftarr[i] = arr[l + i];
        }

        for(int j = 0; j < n2; j++) {
            rightarr[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while(i < n1 && j < n2) {
            if(leftarr[i] <= rightarr[j]) {
                arr[k++] = leftarr[i++];
            } else {
                arr[k++] = rightarr[j++];
            }
        }

        while(i < n1) {
            arr[k++] = leftarr[i++];
        }

        while(j < n2) {
            arr[k++] = rightarr[j++];
        }
    }

    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}