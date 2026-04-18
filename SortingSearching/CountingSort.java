import java.util.*;

public class CountingSort {

    public static void countingSort(int[] arr) {

        int n = arr.length;

        // Step 1: Find max
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Count array
        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 3: Prefix sum
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Output array
        int[] output = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy back
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countingSort(arr);

        System.out.print("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}