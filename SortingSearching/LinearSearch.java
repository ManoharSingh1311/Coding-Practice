import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int element = sc.nextInt();

        // Iterative Search
        int index1 = iterativeSearch(arr, element);
        if (index1 != -1) {
            System.out.println("Iterative: Found at position " + (index1 + 1));
        } else {
            System.out.println("Iterative: Element not found");
        }

        // Recursive Search
        int index2 = recursiveSearch(arr, element, 0);
        if (index2 != -1) {
            System.out.println("Recursive: Found at position " + (index2 + 1));
        } else {
            System.out.println("Recursive: Element not found");
        }

        sc.close();
    }

    // ✅ Iterative Method
    public static int iterativeSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // ✅ Recursive Method
    public static int recursiveSearch(int[] arr, int x, int index) {
        // Base case: not found
        if (index == arr.length) {
            return -1;
        }

        // Found
        if (arr[index] == x) {
            return index;
        }

        // Recursive call
        return recursiveSearch(arr, x, index + 1);
    }
}