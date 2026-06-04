package striversheet.slidingwindow;

import java.util.Scanner;

public class MaxConsecutiveOnesIII {

    // Sliding Window Solution
    public static int longestOnes(int[] nums, int k) {
        int l = 0, maxLen = 0, zeroCount = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                zeroCount++;
            }

            // shrink window if zeroCount exceeds k
            while (zeroCount > k) {
                if (nums[l] == 0) {
                    zeroCount--;
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements (0 or 1): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k (max flips allowed): ");
        int k = sc.nextInt();

        // Solve
        int result = longestOnes(nums, k);
        System.out.println("Maximum consecutive 1's after flipping at most " + k + " zeros: " + result);

        sc.close();
    }
}
