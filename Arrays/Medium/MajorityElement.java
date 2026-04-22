package Arrays.Medium;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in the  array to find majority element(present more than n/2 times)  : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Majority Element is :"+ majority(arr));
        sc.close();
    }
    private static int majority(int arr[]){
        int count = 1;
        int candidate = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                candidate = arr[i];
                count=1;
            }
        }
        return candidate;
    }
}
