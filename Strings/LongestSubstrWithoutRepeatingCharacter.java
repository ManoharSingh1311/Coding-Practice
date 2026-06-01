package Strings;
import java.util.*;

public class LongestSubstrWithoutRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to to find the longest substring without repeating characters:");
        String s = sc.nextLine();

        int res = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring is:"+ res);
        sc.close();
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), res = 0;
        Map<Character, Integer> map = new HashMap<>(); // character -> last seen index
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            res = Math.max(res, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return res;
    }
}
