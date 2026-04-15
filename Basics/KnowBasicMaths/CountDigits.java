package Basics.KnowBasicMaths;

import java.util.Scanner;

class CountDigits{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count digits:");
        int num = sc.nextInt();
        System.out.println("Number of digits in "+ num +" are :"+ res(num));
    }
    public static int res(int x) {
        if (x == 0) return 1;  
    
        x = Math.abs(x);       
        int count = 0;
    
        while (x != 0) {
            count++;
            x /= 10;
        }
        return count;
    }
}