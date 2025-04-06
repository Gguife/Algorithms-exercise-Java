package hackerrank.ProblemSolved;

public class VeryBigSum {
   long[] arr = new long[] {
           1000000001,
           1000000002,
           1000000003,
           1000000004,
           1000000005
   };

   public static void main(String[] args) {
      VeryBigSum veryBigSum = new VeryBigSum();
      long result = veryBigSum.sum(veryBigSum.arr);
      System.out.println("The result of big sum array is: " + result);
   }

   public long sum(long[] arr) {
      long sum = 0;
      for(long num : arr){
         sum += num;
      }

      return sum;
   }
}
