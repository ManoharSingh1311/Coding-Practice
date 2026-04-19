package Arrays.Easy;
import java.util.*;

public class SecondLargestElement {
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

        System.out.println("Second Largest Element in the array is:"+ secLarge(arr));
       
        sc.close();
    }
    private static int secLarge(int[] arr) {
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
    
        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
    
        return secLargest;
    }
}
