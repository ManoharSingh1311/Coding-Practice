package StriverSheet.SlidingWindow;

import java.util.Scanner;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxFreq = 0, maxLen = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            freq[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);

            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string (uppercase letters only): ");
        String s = sc.nextLine();

        System.out.print("Enter k (max replacements allowed): ");
        int k = sc.nextInt();

        int result = characterReplacement(s, k);
        System.out.println("Longest Repeating Character Replacement length: " + result);

        sc.close();
    }
}
