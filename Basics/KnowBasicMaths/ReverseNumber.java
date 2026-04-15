package Basics.KnowBasicMaths;

import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse it :");
        int num = sc.nextInt();
        System.out.println("Reversed Number is "+ rev(num));
    }
    public static int rev(int x) {
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
    
        int sum = 0;
    
        while (x > 0) {
            int digit = x % 10;
    
            if (sum > (Integer.MAX_VALUE - digit) / 10) {
                return 0; 
            }
    
            sum = sum * 10 + digit;
            x /= 10;
        }
    
        return sign * sum;
    }
}