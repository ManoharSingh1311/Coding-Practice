package Strings;
import java.util.*;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse it's words:");
        String s = sc.nextLine();
        System.out.println("After reversing the words in the string :"+ reverseWords(s));
    }
    public static  String reverseWords(String s) 
    {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
