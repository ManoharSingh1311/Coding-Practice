package Strings;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to count vowels and consonants: ");
        String s = sc.nextLine();

        int res[] = countChars(s);

        System.out.println("Number of vowels in String \"" + s + "\" is: " + res[0]);
        System.out.println("Number of consonants in String \"" + s + "\" is: " + res[1]);

        sc.close();
    }

    public static int[] countChars(String s) {
        s = s.toLowerCase().replaceAll("\\s+", "");
        int vowels = 0, consonants = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {  // only letters
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }
}