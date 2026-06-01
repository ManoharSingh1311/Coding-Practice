package Strings;
import java.util.*;

public class AllSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("All possible substrings of \"" + s + "\" are:");
        substr(s);
        sc.close();
    } 

    private static void substr(String s) {
        int n = s.length();
        // The outer loop picks the starting character
        for (int i = 0; i < n; i++) {
            // The inner loop picks the ending character
            for (int j = i + 1; j <= n; j++) {
                // substring(start, end) includes 'start' but excludes 'end'
                System.out.println(s.substring(i, j));
            }
        }
    }
}