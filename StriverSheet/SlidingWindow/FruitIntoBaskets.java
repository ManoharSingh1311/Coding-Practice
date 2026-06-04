package striversheet.slidingwindow;

import java.util.*;

public class FruitIntoBaskets {

    // Sliding Window Solution
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int l = 0, maxLen = 0;

        for (int r = 0; r < fruits.length; r++) 
        {
            basket.put(fruits[r], basket.getOrDefault(fruits[r], 0) + 1);

            // shrink window if more than 2 distinct fruits
            while (basket.size() > 2) {
                basket.put(fruits[l], basket.get(fruits[l]) - 1);
                if (basket.get(fruits[l]) == 0) {
                    basket.remove(fruits[l]);
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of fruits: ");
        int n = sc.nextInt();

        int[] fruits = new int[n];
        System.out.println("Enter the fruit types (as integers): ");
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }

        // Solve
        int result = totalFruit(fruits);
        System.out.println("Maximum fruits collected in two baskets: " + result);

        sc.close();
    }
}
