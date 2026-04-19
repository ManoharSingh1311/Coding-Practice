import java.util.*;

public class PraticeSorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        System.out.print("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
    private static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]> arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
    private static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j >=0 && arr[j]>key ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }
    
    private static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j=i+1;j<n; j++){
                if(arr[j]< arr[minIdx]){
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i]= arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    private static void mergeSort(int arr[], int l, int r){
        if(l>=r)
            return;

        int mid = l+(r-l)/2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    private static void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int t1[] = new int[n1];
        int t2[] = new int[n2];
        for(int i=0; i<n1; i++){
            t1[i]= arr[l+i];
        }
        for(int j=0; j<n2; j++){
            t2[j]=arr[m+1+j];
        }
        int i=0, j=0, k=l;
        while(i < n1 && j < n2){
            if(t1[i]<=t2[j]){
                arr[k]= t1[i];
                k++; i++;
            }else{
                arr[k]= t2[j];
                k++; j++;
            }
        }
        while(i<n1){
            arr[k++] = t1[i++];
        }
        while(j<n2){
            arr[k++]=t2[j++];
        }

    }
    private static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    private static int partition(int arr[], int low, int high){

        int p = arr[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(arr[j]< p){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
