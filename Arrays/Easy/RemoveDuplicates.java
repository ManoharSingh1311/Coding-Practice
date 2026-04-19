package Arrays.Easy;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted array case:");
        int newSize1 = removeDuplicatesSorted(arr);
        for (int i = 0; i < newSize1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nUnsorted array case:");
        int newSize2 = removeDuplicatesUnsorted(arr);
        for (int i = 0; i < newSize2; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
    private static int removeDuplicatesSorted(int[] arr) {
        int i = 0;
    
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
    
        return i + 1;
    }
    private static int removeDuplicatesUnsorted(int[] arr) 
    {
        HashSet<Integer> set = new HashSet<>();
    
        int index = 0;
        for (int x : arr) {
            if (!set.contains(x)) {
                set.add(x);
                arr[index++] = x;
            }
        }
    
        return index; 
    }
}
