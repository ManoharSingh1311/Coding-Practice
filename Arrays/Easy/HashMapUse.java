package Arrays.Easy;

import java.util.Scanner;
import java.util.*;

public class HashMapUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array :");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        countEachFreq(arr);
    }
    private static void countEachFreq(int arr[]){
        int n = arr.length;
        HashMap<Integer ,Integer> mp = new HashMap<>();
        for(int num : arr){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e: mp.entrySet()){
            System.out.println(e.getKey()+ " :"+ e.getValue());
        }
    }
}
