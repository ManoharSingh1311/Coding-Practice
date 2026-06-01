package Strings;

import java.util.Scanner;

public class ConvertCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to convert:");
        String s = sc.nextLine();

        convertCase(s);
        sc.close();
    }

    public static void convertCase(String s) {
        char[] chs = s.toCharArray();

        for (int i = 0; i < chs.length; i++) {
            char ch = chs[i];
            if (Character.isUpperCase(ch)) {
                // Convert Upper to Lower
                chs[i] = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                // Convert Lower to Upper
                chs[i] = Character.toUpperCase(ch);
            }
        }
        
        // Create a new string from the modified array
        System.out.println("After converting: " + new String(chs));
    }
    public static void convertCase2(String s) {
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            // If it's Uppercase (between 65 and 90)
            if (chs[i] >= 'A' && chs[i] <= 'Z') {
                chs[i] = (char) (chs[i] + 32); // Move "up" to lowercase
            } 
            // If it's Lowercase (between 97 and 122)
            else if (chs[i] >= 'a' && chs[i] <= 'z') {
                chs[i] = (char) (chs[i] - 32); // Move "down" to uppercase
            }
        }
        System.out.println(new String(chs));
    }
}