package Strings;
import java.util.*;
public class CheckAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1 to check anagram: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the string2 to check anagram: ");
        String s2 = sc.nextLine();

        if(checkAnagram(s1, s2)){
            System.out.println("String are anagram of each other");
        }
        else{
            System.out.println("No anagrams");
        }
    }
    public static boolean checkAnagram(String s1, String s2){

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
    
        Arrays.sort(ch1);
        Arrays.sort(ch2);
    
        return Arrays.equals(ch1, ch2);
    }
}
