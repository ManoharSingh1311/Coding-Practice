package Arrays.Medium;
import java.util.*;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix n x m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] []arr = new int[n][m];
        System.out.println("Enter the elements in matrix containing 1 and 0 only:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        setMatrixZero(arr);
    }
    private static void setMatrixZero(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
    
        int row[] = new int[n];
        int col[] = new int[m];     
    
        // mark rows and cols
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
    
        // set zeroes
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
    
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
