package Arrays.Easy;
import java.util.*;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in the binary array(0 or 1):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Length of longest consecutive 1's is "+lenOfMaxConsecutiveOnes(arr));
        sc.close();
    }
    static int lenOfMaxConsecutiveOnes(int arr[]){
        int n = arr.length;
        int count = 0, maxCount = 0;
        for(int num : arr){
            if(num==1){
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else{
                count = 0;
            }
        }
        return count;
    }
}
