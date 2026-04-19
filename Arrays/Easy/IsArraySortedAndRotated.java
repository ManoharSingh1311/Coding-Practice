package Arrays.Easy;

import java.util.*;

public class IsArraySortedAndRotated
{
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

        if(isSorted(arr)){
            System.out.println("Array is Sorted and Rotated");
        }
        else{
            System.out.println("Array is Not Sorted");
        }
    }
    private static boolean isSorted(int[] arr) {
       int count =0;
       for(int i=1; i<arr.length; i++){
        if(arr[i-1]>arr[i]){
            count++;
        }
       }
       if(arr[arr.length-1]>arr[0]){
        count++;
       }
       return count <=1;
    }
}
