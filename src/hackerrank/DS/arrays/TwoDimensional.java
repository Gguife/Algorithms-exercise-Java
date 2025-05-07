package hackerrank.DS.arrays;

public class TwoDimensional {
   int[][] arr = {
           {-1, -1,  0, -9, -2, -2},
           {-2, -1, -6, -8, -2, -5},
           {-1, -1, -1, -2, -3, -4},
           {-1, -9, -2, -4, -4, -5},
           {-7, -3, -3, -2, -9, -9},
           {-1, -3, -1, -2, -4, -5}
   };

   public static void main(String[] args) {
      TwoDimensional twoDimensional = new TwoDimensional();
      int[][] ar = twoDimensional.arr;
      int result = twoDimensional.twoD(ar);
      System.out.println("The max sum of 2DArray is: " + result);
   }

   public int twoD(int[][] arr) {
      int maxSum = Integer.MIN_VALUE;

      for(int i = 0; i < 4; i++) {
         for(int j = 0; j < 4; j++) {
            int top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
            int medium = arr[i + 1][j + 1];
            int bottom = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

            int hourglassSum = top + medium + bottom;
            if(hourglassSum > maxSum) {
               maxSum = hourglassSum;
            }
         }
      }

      return maxSum;
   }

}
