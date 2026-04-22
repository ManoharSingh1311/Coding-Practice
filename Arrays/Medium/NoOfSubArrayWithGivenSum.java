package Arrays.Medium;
import java.util.*;
public class NoOfSubArrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the sum to find :");
        int k = sc.nextInt();
        System.out.println("Number of arrays with given sum :"+numberOfSubarrays(arr, k));
    }
    private static int numberOfSubarrays(int arr[], int k){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<arr.length; i++){
           int sum = 0;
           for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum==k) count++;
           }
        }
        return count;
    }
    private static int numberOfSubarraysOptimal(int arr[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
    
        int sum = 0;
        int count = 0;
    
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
    
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
    
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
    
        return count;
    }
}
