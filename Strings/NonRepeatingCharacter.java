package Strings;
import java.util.*;
public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find first non repeating character: ");
        String s = sc.nextLine();

        char res = nonRepeatingCharacters(s);
        System.out.println("First Non Repeating Character in string "+ s + "is: " + res);

        sc.close();
    }
    public static char nonRepeatingCharacters(String s){
        Map<Character, Integer> map = new LinkedHashMap<>();
    
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
    
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
    
        return '\0'; // no non-repeating char
    }
    public static char nonRepeatingCharacterMethod2(String s){
        for(char ch : s.toCharArray()){
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return ch;
            }
        }
        return '\0';
    }
}