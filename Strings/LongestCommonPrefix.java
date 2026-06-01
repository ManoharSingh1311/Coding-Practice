package Strings;
import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        String s[] = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }

        System.out.println("Longest common prefix is: " + findLCP(s));
        sc.close();
    }

    private static String findLCP(String s[]) {
        if (s == null || s.length == 0) return "";

        // Sorting helps because the LCP must be common to the 
        // lexicographically first and last strings.
        Arrays.sort(s);
        
        String first = s[0];
        String last = s[s.length - 1];
        int i = 0;

        // Compare only the first and last strings
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }
    private static String LCS2(String s[]) {
        if (s == null || s.length == 0) return "";
        
        // Start by assuming the first string is the prefix
        String lcs = s[0];
        
        for (int i = 1; i < s.length; i++) {
            // While the current string s[i] does not start with 'lcs'
            while (s[i].indexOf(lcs) != 0) {
                // Shorten the prefix by one character from the end
                lcs = lcs.substring(0, lcs.length() - 1);
                
                // If it becomes empty, there is no common prefix at all
                if (lcs.isEmpty()) return "";
            }
        }
        return lcs; // You were missing this return statement!
    }
}