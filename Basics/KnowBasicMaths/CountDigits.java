package Basics.KnowBasicMaths;

import java.util.Scanner;
import java.math.*;
class CountDigits{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count digits:");
        int num = sc.nextInt();
        System.out.println("Number of digits in "+ num +" are :"+ count1(num));
    }
    public static int count1(int x) {
        if (x == 0) return 1;  
    
        x = Math.abs(x);       
        int count = 0;
    
        while (x != 0) {
            count++;
            x /= 10;
        }
        return count;
    }
    static int count2(int x){
        if(x == 0) return 0;
        return (int) Math.log10(Math.abs(x))+1;
    }

}