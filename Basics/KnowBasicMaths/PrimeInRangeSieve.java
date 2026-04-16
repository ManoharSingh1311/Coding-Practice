package Basics.KnowBasicMaths;

import java.util.*;

public class PrimeInRangeSieve {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range (n): ");
        int n = sc.nextInt();

        // Step 1: Create boolean array
        boolean[] isPrime = new boolean[n + 1];

        // Step 2: Assume all numbers are prime
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        // Step 3: Apply Sieve
        for (int i = 2; i * i <= n; i++) {

            if (isPrime[i]) {

                // Mark multiples as false
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 4: Print primes
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
} 