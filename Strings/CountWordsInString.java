package Strings;
import java.util.*;

public class CountWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to count words:");
        String s = sc.nextLine();

        System.out.println("Number of words in String "+s+" is :"+countt(s));
        sc.close();
    }
    private static int countt(String s){
        s = s.trim();
        if(s.isEmpty()) return 0;
        return s.split("\\s+").length;
    }
}
