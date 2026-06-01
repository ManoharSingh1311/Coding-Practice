package Strings;
import java.util.*;

public class FindStringOnAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Haystack (main string): ");
        String haystack = sc.nextLine();

        System.out.print("Enter Needle (string to find): ");
        String needle = sc.nextLine();

        // Create object to call the non-static method
        FindStringOnAnother obj = new FindStringOnAnother();
        int result = obj.strStr(haystack, needle);

        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found.");
        }
        
        sc.close();
    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        
        // Loop runs only until the remaining haystack length is at least needle length
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring starting at i matches the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}