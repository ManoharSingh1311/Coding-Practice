import java.util.Scanner;

public class CountNiceSubarrays {

    public static int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private static int atMost(int[] nums, int k) {

        if (k < 0)
            return 0;

        int left = 0;
        int oddCount = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 == 1)
                oddCount++;

            while (oddCount > k) {

                if (nums[left] % 2 == 1)
                    oddCount--;

                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = numberOfSubarrays(nums, k);

        System.out.println("Number of nice subarrays = " + result);

        sc.close();
    }
}