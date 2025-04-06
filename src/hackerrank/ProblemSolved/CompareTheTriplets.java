package hackerrank.ProblemSolved;

import java.sql.SQLOutput;

public class CompareTheTriplets {
   int[] a = new int[] {1, 2, 3};
   int[] b = new int[] {3, 2, 1};


   public static void main(String[] args) {
      CompareTheTriplets compareTheTriplets = new CompareTheTriplets();
      int[] alice = compareTheTriplets.a;
      int[] bob = compareTheTriplets.b;
      int[] result = compareTheTriplets.compare(alice, bob);
      System.out.println("The result of comparison in alice and bob is:");
      System.out.println("Alice score: " + result[0]);
      System.out.println("Bob score: " + result[1]);
   }

   public int[] compare(int[] a, int[] b) {
      int aliceScore = 0;
      int bobScore = 0;

      for(int i = 0; i < 3; i++) {
         if(a[i] > b[i]) {
            aliceScore += 1;
         }
         if(a[i] < b[i]) {
            bobScore += 1;
         }
      }

      return new int[] {aliceScore, bobScore};
   }

}
