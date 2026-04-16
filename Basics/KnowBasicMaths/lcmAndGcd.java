package Basics.KnowBasicMaths;

import java.util.Scanner;

public class lcmAndGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers to find their GCD and LCM:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("GCD: " + gcd(num1, num2));
        System.out.println("LCM: " + lcm(num1, num2));
    }

    static int gcd(int x, int y) {
        while (y != 0) 
        {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;  
    }
    static int lcm(int x, int y) {
        return (x / gcd(x, y)) * y;
    }
}