package Arrays.Hard;
import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to genrate Pascal Triangle: ");
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> res = pascal(n);
        System.out.println(res);
    }
    private static ArrayList<ArrayList<Integer>> pascal(int n){
        ArrayList<ArrayList<Integer>>lst = new ArrayList<>();
        for(int i=0; i<n; i++){
            ArrayList<Integer> ls = new ArrayList<>();
            for(int j=0; j<=i; j++){
                ls.add(generate(i, j));
            }
            lst.add(ls);
        }
        return lst;
    }
    private static int generate(int n, int r){
        double ans = 1;
        r = Math.min(r, n - r);
        for(int i=0; i<r; i++){
            ans *= (n-i);
            ans /= (i+1);
        }
        return (int) ans;
    }
    
}
