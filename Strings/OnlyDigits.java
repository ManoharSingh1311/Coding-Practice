package Strings;

import java.util.Scanner;

public class OnlyDigits {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        if(onlyDigits(s)){
            System.out.println("String contains only digits");
        }
        else{
            System.out.println("String does not contains only digits");
        }
   } 
   private static boolean onlyDigits(String s) {
    // Edge case: empty string
        if (s == null || s.isEmpty()) return false;

        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false; 
            }
        }
        return true;
    }
}
