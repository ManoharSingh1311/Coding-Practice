package Arrays.Medium;
import java.util.*;
public class RearrayElementsBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("After rearranging elements by sign( +,-,+,-......: ");
        rearrangeArray(arr);

    }
    private static void rearrangeArray(int arr[]){
        //When equal elements
        int res[] = new int [arr.length];
        int pos = 0;
        int neg = 1;
        for(int num : arr){
            if(num > 0){
                res[pos]= num;
                pos+=2;
            }else{
                res[neg]= num;
                neg+=2;
            }
        }
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    private static void rearrangeArray2(int arr[]){
        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();
    
        for(int num : arr){
            if(num >= 0) posList.add(num);
            else negList.add(num);
        }
    
        int i = 0, p = 0, n = 0;
    
        // alternate
        while(p < posList.size() && n < negList.size()){
            arr[i++] = posList.get(p++);
            arr[i++] = negList.get(n++);
        }
    
        // remaining elements
        while(p < posList.size()){
            arr[i++] = posList.get(p++);
        }
    
        while(n < negList.size()){
            arr[i++] = negList.get(n++);
        }
    
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
