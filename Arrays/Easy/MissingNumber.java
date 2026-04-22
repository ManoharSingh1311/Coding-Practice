package Arrays.Easy;
import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n-1 elements): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (from 1 to n with one missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissingSum(arr);
        System.out.println("Missing number (Sum method): " + missing);

        sc.close();
    }

    private static int findMissingSum(int[] arr) {
        int n = arr.length + 1;

        int totalSum = n * (n + 1) / 2;

        int arrSum = 0;
        for (int x : arr) {
            arrSum += x;
        }

        return totalSum - arrSum;
    }
}