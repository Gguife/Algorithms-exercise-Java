package leetCode.addTwoNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {

   public static void main(String[] args) {
      int[] l1 = {2, 4, 3};
      int[] l2 = {5, 6, 4};

      int[] result = addTwoNumbers(l1, l2);


      System.out.println(Arrays.toString(result));
      for(int num : result) {
         System.out.println(num + " ");
      }
   }

   public static int[] addTwoNumbers(int[] l1, int[] l2) {
      List<Integer> resultList = new ArrayList<>();
      int carry = 0;
      int i = 0, j = 0;

      while(i < l1.length || j < l2.length || carry > 0) {
         int sum = carry;

         if(i < l1.length) {
           sum += l1[i];
           i++;
         }

         if(j < l2.length) {
            sum += l2[j];
            j++;
         }

         carry = sum / 10;
         resultList.add(sum % 10);
      }


      //Convert the result list to an array
      return resultList.stream().mapToInt(Integer::intValue).toArray();
   }
}
