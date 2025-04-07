package hackerrank.ProblemSolved;

public class MiniMaxSum {
   int[] arr = new int[] {5,1,3,4,2};

   public static void main(String[] args) {
      MiniMaxSum miniMaxSum = new MiniMaxSum();
      int[] result = miniMaxSum.sum(miniMaxSum.arr);
      int minSum = result[0];
      int maxSum = result[1];
      System.out.println("The minimum sum is: " + minSum + "\nThe maximum sum is: " + maxSum);
   }


   public int[] sum(int[] arr) {
      int min = arr[0];
      int max = arr[0];
      int totalSum = 0;

      for(int num : arr) {
         if(num < min) {
            min = num;
         }
         if(num > max){
            min = max;
         }

         totalSum += num;
      }

      int minSum = totalSum - max;
      int maxSum = totalSum - min;

      return new int[] {minSum, maxSum};
   }
}
