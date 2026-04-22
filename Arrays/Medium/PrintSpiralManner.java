package Arrays.Medium;
import java.util.*;
public class PrintSpiralManner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix n x m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] []arr = new int[n][m];
        System.out.println("Enter the elements in matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        printSpiral(arr);
    }
    private static void printSpiral(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int left = 0, right = m-1;
        int top = 0, bottom = n-1;
        while(left <= right && top <= bottom){
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom; i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left;i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if(left <=right){
                for(int i=bottom; i>=top ; i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
        
    }
}
