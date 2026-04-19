package Arrays.Easy;
import java.util.*;

public class RotateArrayByKPlaces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // LEFT ROTATION
        int[] leftArr = arr.clone();
        rotateLeft(leftArr, k);
        System.out.print("Left Rotation: ");
        printArray(leftArr);

        // RIGHT ROTATION
        int[] rightArr = arr.clone();
        rotateRight(rightArr, k);
        System.out.print("Right Rotation: ");
        printArray(rightArr);

        sc.close();
    }

    // 🔹 Left Rotation
    private static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // 🔹 Right Rotation
    private static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // 🔹 Reverse helper
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // 🔹 Print array
    private static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}