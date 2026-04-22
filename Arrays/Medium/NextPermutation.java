package Arrays.Medium;

import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array to find its next permutation: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = nxtPermutation(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }    
    }
    private static int[] nxtPermutation(int arr[]){
        int n = arr.length;
        int piv = -1;
        //step 1: first decreasing element from right
        for(int i=n-2;i>=0; i--){
            if(arr[i]<arr[i+1]){
                piv = i;
                break;
            }
        }
        // step 2: if last permutation reverse the whole array
        if(piv==-1){
            reverse(arr, 0, n-1);
            return arr;
        }
        //step 3: find next greater element and swap it
        for(int i=n-1; i>=0; i--){
            if(arr[i]>arr[piv]){
                swap(arr, i,piv);
                break;
            }
        }
        //step 2: reverse the suffix
        reverse(arr, piv+1, n-1);
        return arr;
    }
    private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    private static void reverse(int arr[], int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++; j--;
        }
    }
}
