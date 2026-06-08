import java.util.Scanner;

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of cards: ");
        int n = sc.nextInt();

        int[] cardPoints = new int[n];
        System.out.println("Enter card points:");
        for (int i = 0; i < n; i++) {
            cardPoints[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k (number of cards to pick): ");
        int k = sc.nextInt();

        // Compute result
        int result = maxScore(cardPoints, k);

        // Output
        System.out.println("Maximum points you can obtain: " + result);

        sc.close();
    }

    public static int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int n = cardPoints.length;
        int lSum = 0;
        for(int i=0; i<k; i++){
            lSum+= cardPoints[i];
        }
        max = lSum;
       int rSum = 0;
       int r = n-1;
      for(int i=k-1; i>=0; i--){
         lSum -= cardPoints[i];   // remove one from left
         rSum += cardPoints[r];   // add one from right
         r--;                     // move leftward
         max = Math.max(max, rSum + lSum);
      }

       return max;
        
    }
}
