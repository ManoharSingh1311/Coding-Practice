package Strings;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if it is palindrome or not: ");
        String s = sc.nextLine();
       if(CheckPalindrome(s)){
        System.out.println("String is Palindrome");
       }
        else{
            System.out.println("String is Not Palindrome");
        }
    }
    public static boolean CheckPalindrome(String s){
        int left = 0, right =s.length()-1;
        while(left < right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
