package hackerrank.DS.arrays;

import java.util.Arrays;

public class LeftRotation {

   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int d = 2;

      int[] result = leftRotation(d, arr);

      System.out.println(Arrays.toString(result));
   }

   public static int[] leftRotation(int d, int[] arr) {
      int n = arr.length;
      int[] rotatedArray = new int[n];

      for(int i = 0; i < n; i++) {
         //Calculate the new position for each element
         int newIndex = (i + n - d) % n;
         rotatedArray[newIndex] = arr[i];
      }

      return rotatedArray;
   }
}