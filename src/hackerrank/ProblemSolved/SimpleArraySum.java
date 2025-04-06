package hackerrank.ProblemSolved;

public class SimpleArraySum {
   int[] arr = new int[] {3, 3, 2, 2, 1};

   public static void main(String[] args) {
      SimpleArraySum simpleArraySum = new SimpleArraySum();
      int resultArraySum = simpleArraySum.arraySum(simpleArraySum.arr);
      System.out.println("The array sum is: " + resultArraySum);
   }


   public int arraySum(int[] arr) {
      int sum = 0;

      for(int num : arr) {
         sum += num;
      }

      return sum;
   }
}
