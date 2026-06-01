package Strings;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to compress (e.g., aaabbccccd):");
        String input = sc.nextLine();

        // Edge case: empty string
        if (input == null || input.isEmpty()) {
            System.out.println("Result: " + input);
        } else {
            String compressed = compress(input);
            System.out.println("Original String: " + input);
            System.out.println("Compressed String: " + compressed);
        }
        
        sc.close();
    }

    /**
     * Optimal String Compression using StringBuilder
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static String compress(String s) {
        if (s == null || s.length() < 2) return s;
    
        StringBuilder sb = new StringBuilder();
        int count = 1;
    
        for (int i = 0; i < s.length(); i++) {
            // If we're not at the end AND current char matches next char
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // End of a consecutive group
                sb.append(s.charAt(i));
                sb.append(count);
                count = 1; // Reset for next group
            }
        }
    
        String compressed = sb.toString();
        
        // THE RULE: return original if compressed is not actually smaller
        return compressed.length() < s.length() ? compressed : s;
    }
    public static String compressNewString(String s) {
        if (s == null || s.length() <= 1) return s;
    
        StringBuilder sb = new StringBuilder();
        int count = 1;
    
        for (int i = 0; i < s.length(); i++) {
            // If next char is same, just increment count
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // If next char is different, "flush" to StringBuilder
                sb.append(s.charAt(i));
                sb.append(count);
                count = 1; // Reset to 1 for the next character
            }
        }
        
        String res = sb.toString();
        return res.length() < s.length() ? res : s;
    }
}