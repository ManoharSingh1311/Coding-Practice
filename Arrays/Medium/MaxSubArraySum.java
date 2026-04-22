package Arrays.Medium;
import java.util.*;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in the  array to find max subarray sum  : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max Subarray Sum is :"+ kadanesAlgo(arr));
        sc.close();
    }
    private static int kadanesAlgo(int arr[]){
        int currSum = arr[0];
        int maxSum = arr[0];
        for(int i=1; i<arr.length;i++){
            currSum = Math.max(arr[i], arr[i]+currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
