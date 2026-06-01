import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters 
{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string :");
      String s = sc.nextLine();
      System.out.println("Longest Substring without repeating characters length is :"+ LSWR(s));
      sc.close();

   }
   private static int LSWR(String s){
      int n = s.length();
      int left = 0;
      int maxlen = 0;
      Set<Character> set = new HashSet<>();
      for(int right = 0; right<n; right++){
         char ch = s.charAt(right);

         while(set.contains(ch)){
            set.remove(s.charAt(left));
            left++;
         }
         set.add(ch);
         maxlen = Math.max(maxlen, right-left+1);

      }
      return maxlen;
   }
}
