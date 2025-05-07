package hackerrank.DS.arrays;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

   public static void main(String[] args) {
      int n = 2;
      List<List<Integer>> queries = List.of(
           List.of(1, 0, 5),
           List.of(1, 1, 7),
           List.of(1, 0, 3),
           List.of(2, 1, 0),
           List.of(2, 1, 1)
      );

      DynamicArray dynamicArray = new DynamicArray();
      List<Integer> response = dynamicArray.dynamic(n, queries);
      System.out.println(response);

   }


   public List<Integer> dynamic(int n, List<List<Integer>> queries) {
      List<List<Integer>> arr = new ArrayList<>();
      for(int i = 0; i < n; i++) {
         arr.add(new ArrayList<>());
      }

      int lastAnswer = 0;
      List<Integer> result = new ArrayList<>();

      for(List<Integer> query : queries) {
         int q = query.get(0);
         int x = query.get(1);
         int y = query.get(2);

         int idx = (x ^ lastAnswer) % n;
         List<Integer> seq = arr.get(idx);

         if(q == 1) {
            seq.add(y);
         }else if(q == 2) {
            lastAnswer = seq.get(y % seq.size());
            result.add(lastAnswer);
         }
      }

      return result;
   }

}
