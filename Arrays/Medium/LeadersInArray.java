package Arrays.Medium;
import java.util.*;
public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array to find leaders: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = leader(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    private static int[] leader(int arr[]){
        ArrayList<Integer> lst = new ArrayList<>();
        int n = arr.length;
    
        int l = arr[n-1];
        lst.add(l);
    
        for(int i = n-2; i >= 0; i--){
            if(arr[i] > l){
                lst.add(arr[i]);
                l = arr[i];
            }
        }
    
        // reverse to maintain order
        Collections.reverse(lst);
    
        int[] res = new int[lst.size()];
        for(int i = 0; i < lst.size(); i++){
            res[i] = lst.get(i);
        }
    
        return res;
    }
}
