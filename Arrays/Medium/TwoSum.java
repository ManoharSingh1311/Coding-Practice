package Arrays.Medium;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in the  array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        int[] result = twoSumBrute(arr, target);
        System.out.println("The indices of the two numbers are: " + result[0] + " and " + result[1]);
    }
    //Brute Force : T.C. :O(N)   S.C.-: 0(1)
    private static int[] twoSumBrute(int[] arr, int target){
        int n = arr.length;
    
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j}; 
                }
            }
        }
        return new int[]{-1, -1}; 
    }
    private static int[] twoSumm(int arr[], int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
    
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
    
            if(hm.containsKey(complement)){
                return new int[]{hm.get(complement), i};
            }
    
            hm.put(arr[i], i);
        }
    
        return new int[]{-1, -1};
    }
}