package Arrays.Medium;
import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array to find leaders: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Length of longest consecutive sequence is"+lenOfLongestConsecutiveSequence(arr));
        sc.close();        
    }
    private static int lenOfLongestConsecutiveSequence(int arr[]){
        if(arr.length == 0) return 0;
        int max = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int currnum = num;
                int count = 1;
                while(set.contains(currnum+1)){
                    currnum+=1;
                    count++;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
