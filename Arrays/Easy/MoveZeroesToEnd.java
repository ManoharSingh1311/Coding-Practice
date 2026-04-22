package Arrays.Easy;
import java.util.*;

public class MoveZeroesToEnd {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements containing 0 too:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("After moving zero to one end:");
       moveZeroes(arr);
       printArray(arr);
        sc.close();
    }
    private static void moveZeroes(int arr[]){
        int i=0;
        for(int j=0; j<arr.length; j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
        }
        while(i<arr.length){
            arr[i++]= 0;
        }
    }
    private static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
