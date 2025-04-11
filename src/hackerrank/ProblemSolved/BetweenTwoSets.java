package hackerrank.ProblemSolved;

import java.util.Arrays;

public class BetweenTwoSets {
   int[] a = new int[] {2, 6};
   int[] b = new int[] {24, 36};


   public static void main(String[] args) {
      BetweenTwoSets betweenTwoSets = new BetweenTwoSets();
      int response = betweenTwoSets.getTotal(betweenTwoSets.a, betweenTwoSets.b);
      System.out.println(response);
   }

   public int getTotal(int[] a, int [] b) {
      int count = 0;

      for(int i = 1; i <= 100; i++) {
         final int current = i; // Create a final variable to use in the lambda
         // If every "a" element is a divisor of "current"
         boolean isFactorOfI = Arrays.stream(a).allMatch(intA -> current % intA == 0);
         // If "current" is a divisor of all "b" elements
         boolean isDivisorOfB = Arrays.stream(b).allMatch(intB -> intB % current == 0);

         if(isFactorOfI && isDivisorOfB) {
            count++;
         }
      }

      return count;
   }

}
