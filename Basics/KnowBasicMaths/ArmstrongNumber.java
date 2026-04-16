package Basics.KnowBasicMaths;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Armstrong or not:");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is Not Armstrong");
        }
    }

    public static boolean isArmstrong(int x) {
        int temp = x;
        int sum = 0;

        // Step 1: Count digits
        int digits = String.valueOf(x).length();

        // Step 2: Calculate sum of powers
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        // Step 3: Compare
        return sum == x;
    }
}