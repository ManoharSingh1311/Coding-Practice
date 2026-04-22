package Arrays.Medium;
import java.util.*;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in the  array with 0, 1 and 2 Only  : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("After sorting them optimally: ");
        sort012(arr);
       for(int i =0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }
    }
    private static void sort012(int arr[]){
        int n = arr.length;
        int l =0, m=0, r=n-1;
        while(m<=r){
            if(arr[m]==0){
                int temp = arr[m];
                arr[m]=arr[l];
                arr[l]= temp;
                m++;
                l++;
            }
            else if(arr[m]==2){
                int temp = arr[m];
                arr[m]=arr[r];
                arr[r]=temp;
                r--;
            }
            else{
                m++;
            }
        }
   }
}