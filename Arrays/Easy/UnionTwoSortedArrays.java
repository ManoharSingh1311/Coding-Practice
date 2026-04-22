package Arrays.Easy;
import java.util.*;

public class UnionTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of array1 in sorted order:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of array2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of array2 in sorted order:");
        for (int i = 0; i < n2; i++) {   
            arr2[i] = sc.nextInt();
        }

        System.out.println("Union of these two sorted arrays:");
        union(arr1, arr2);

        sc.close();
    }

    private static void union(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int n1 = arr1.length, n2 = arr2.length;

        ArrayList<Integer> result = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < n1) {
            if (result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }

        // Remaining elements of arr2
        while (j < n2) {
            if (result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }

        // Print result
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}