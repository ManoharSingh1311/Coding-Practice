import java.util.Scanner;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter the string (only a, b, c): ");
        String s = sc.nextLine();

        // Call function
        int result = numberOfSubstrings(s);

        // Output result
        System.out.println("Number of substrings containing all three characters: " + result);

        sc.close();
    }

    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[3]; // counts of a, b, c
        int left = 0, res = 0;

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;

            // shrink window when all three chars are present
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res += n - right; // all substrings from right to end are valid
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return res;
    }
}
