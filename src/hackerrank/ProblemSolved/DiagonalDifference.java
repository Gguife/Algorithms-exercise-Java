package hackerrank.ProblemSolved;

public class DiagonalDifference {
   int[][] matrix = new int[][] {
           {1, 2, 3},
           {4, 5, 6},
           {9, 8, 9},
   };

   public static void main(String[] args) {
      DiagonalDifference diagonalDifference = new DiagonalDifference();
      int result = diagonalDifference.dif(diagonalDifference.matrix);
      System.out.println("the difference between the diagonal of the matrix is: " + result);
   }

   public int dif(int[][] matrix) {
      int firstSumDiagonal = 0;
      int secondSumDiagonal = 0;
      int difference;

      for(int i = 0; i < matrix.length; i++) {
         firstSumDiagonal += matrix[i][i];
         secondSumDiagonal += matrix[i][matrix.length - 1 - i];
      }

      difference = Math.abs(firstSumDiagonal - secondSumDiagonal);
      return difference;
   }
}
