package Strings;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to remove duplicates from it: ");
        String s = sc.nextLine();
        String res = removeDuplicates(s);
        System.out.println("After removing duplicates from string it looks like this:"+ res);
        sc.close();
    }
    public static String removeDuplicates(String s){
        s = s.replaceAll("\\s+", "").trim();
    
        Set<Character> set = new LinkedHashSet<>();
    
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
    
        StringBuilder result = new StringBuilder();
        for(char ch : set){
            result.append(ch);
        }
    
        return result.toString();
    }
    public static String removeDuplicates2(String s){
        s = s.replaceAll("\\s+", "").trim();
    
        StringBuilder result = new StringBuilder();
    
        for(char ch : s.toCharArray()){
            if(result.indexOf(String.valueOf(ch)) == -1){
                result.append(ch);
            }
        }
    
        return result.toString();
    }
    //lowercase
    public static String removeDuplicatesFast(String s){
        boolean[] seen = new boolean[26];
        StringBuilder result = new StringBuilder();
    
        for(char ch : s.toCharArray()){
            if(!seen[ch - 'a']){
                seen[ch - 'a'] = true;
                result.append(ch);
            }
        }
    
        return result.toString();
    }
}
