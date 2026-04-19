import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in sorted form:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int element = sc.nextInt();

        // Iterative
        int index1 = iterativeSearch(arr, element);
        if (index1 != -1) {
            System.out.println("Iterative: Found at position " + (index1 + 1));
        } else {
            System.out.println("Iterative: Element not found");
        }

        // Recursive
        int index2 = recursiveSearch(arr, element, 0, arr.length - 1);
        if (index2 != -1) {
            System.out.println("Recursive: Found at position " + (index2 + 1));
        } else {
            System.out.println("Recursive: Element not found");
        }

        sc.close();
    }

    // ✅ Iterative Binary Search
    public static int iterativeSearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1; // not found
    }

    // ✅ Recursive Binary Search
    public static int recursiveSearch(int[] arr, int x, int l, int r) {
        // Base case
        if (l > r) {
            return -1;
        }

        int mid = l + (r - l) / 2;

        if (arr[mid] == x) {
            return mid;
        } else if (x > arr[mid]) {
            return recursiveSearch(arr, x, mid + 1, r);
        } else {
            return recursiveSearch(arr, x, l, mid - 1);
        }
    }
}