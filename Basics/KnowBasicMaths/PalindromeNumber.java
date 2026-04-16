package Basics.KnowBasicMaths;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find palindrome or not:");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is Not Palindrome");
        }
    }
    public static boolean isPalindrome(int x) {

        // Step 1: Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }
    
        // Step 2: Numbers ending with 0 (but not 0 itself) are not palindrome
        if (x % 10 == 0 && x != 0) {
            return false;
        }
    
        int reversedHalf = 0;
    
        // Step 3: Reverse only HALF of the number
        while (x > reversedHalf) {
            int lastDigit = x % 10;              // get last digit
            reversedHalf = reversedHalf * 10 + lastDigit; // build reversed number
            x = x / 10;                         // remove last digit
        }
    
        // Step 4: Check palindrome
        // For even digits → x == reversedHalf
        // For odd digits → ignore middle digit → x == reversedHalf / 10
        if (x == reversedHalf || x == reversedHalf / 10) {
            return true;
        } else {
            return false;
        }
    }
}
