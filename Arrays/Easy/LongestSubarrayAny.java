package Arrays.Easy;

import java.util.*;

public class LongestSubarrayAny {
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;

        int ans = longestSubarray(arr, k);
        System.out.println("Longest length (any numbers): " + ans);
    }
    //Time Complexity: O(n)
    //Space Complexity: O(n)    
    private static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // in this approach we are using a hashmap to store the sum 
        // and the index of the first occurrence of the sum such that sum - k is present in the map
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            // store only first occurrence
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}