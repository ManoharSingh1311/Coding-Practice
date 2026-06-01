package Strings;

import java.util.Scanner;

public class LongestWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        
        int len = findLongestWordInString(s);
        System.out.println("Longest word length is: " + len);
        sc.close();
    }

    private static int findLongestWordInString(String s) {
        // Split by one or more whitespace characters
        String[] words = s.trim().split("\\s+");
        int maxlen = 0;

        for (String word : words) {
            if (word.length() > maxlen) {
                maxlen = word.length();
            }
        }
        return maxlen;
    }
    private static int findLongestWordInString2(String s) {
        int maxLen = 0;
        int currentWordLen = 0;
    
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // If it's not a space, we're inside a word
            if (ch != ' ') {
                currentWordLen++;
            } else {
                // Space found, compare current word length with max
                maxLen = Math.max(maxLen, currentWordLen);
                currentWordLen = 0; // Reset for next word
            }
        }
        // Check one last time for the final word in the string
        return Math.max(maxLen, currentWordLen);
    }
}