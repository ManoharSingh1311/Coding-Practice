package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse it:");
        String s = sc.nextLine();
        String res = RevString1(s);
        String res2 = RevString2(s);
        sc.close();
        System.out.println("Reverse of String "+ s+" is (Method 1):"+ res );
        System.out.println("Reverse of String "+ s+" is (Method 2):"+ res2 );


    }
    public static String RevString1(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public static String RevString2(String s){
        s = s.trim();
        String res = "";
        for(int i=s.length()-1; i>=0; i--){
            res+= s.charAt(i);
        }
        return res;
    }
}
