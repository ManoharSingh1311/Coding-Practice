import java.util.Scanner;

class BinarySubarraysWithSum {

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int goal) {

        if (goal < 0)
            return 0;

        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the binary array (0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the goal sum: ");
        int goal = sc.nextInt();

        BinarySubarraysWithSum obj = new BinarySubarraysWithSum();

        int result = obj.numSubarraysWithSum(nums, goal);

        System.out.println("Number of subarrays with sum " + goal + " = " + result);

        sc.close();
    }
}