package Arrays.Medium;
import java.util.*;

public class PrintMaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = kadanesAlgo(arr);
        System.out.println("Max Subarray Sum is: " + maxSum);

        System.out.print("Max Subarray is: ");
        maxSubarray(arr);

        sc.close();
    }

    private static int kadanesAlgo(int arr[]) {
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], arr[i] + currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    private static void maxSubarray(int arr[]) {
        int currSum = arr[0];
        int maxSum = arr[0];

        int start = 0, end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            // If starting new subarray is better
            if (arr[i] > currSum + arr[i]) {
                currSum = arr[i];
                tempStart = i;
            } else {
                currSum += arr[i];
            }

            // Update max sum and indices
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }

        // Print subarray
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}