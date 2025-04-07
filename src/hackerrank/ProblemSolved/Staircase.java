package hackerrank.ProblemSolved;

public class Staircase {
   int n = 10;

   public static void main(String[] args) {
      Staircase staircase = new Staircase();
      System.out.println(staircase.stair(staircase.n));
   }


   public String stair(int n) {
      String hash = "";

      for(int i = 1; i <= n; i++) {
         for(int x = 1; x <= n - i; x++) {
            hash += " ";
         }
         for(int k = 1; k <= i; k++) {
            hash += "#";
         }
         hash += "\n";
      }

      return hash;
   }
}
