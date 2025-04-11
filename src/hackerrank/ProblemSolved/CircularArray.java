package hackerrank.ProblemSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArray {

   public static void main(String[] args) {
      List<Integer> a = Arrays.asList(3, 4, 5);
      List<Integer> queries = Arrays.asList(1, 2);
      int k = 2;
      CircularArray circularArray = new CircularArray();
      List<Integer> result = circularArray.circularArrayRotation(a, k, queries);
      System.out.println("The list after rotation: " + result);
   }

   public List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
      List<Integer> newList = new ArrayList<>(a);
      List<Integer> response = new ArrayList<>();

      for(int i = 0; i < k; i++) {
         int lastElement = newList.remove(newList.size() - 1);
         newList.add(0, lastElement);
      }

      for(int query : queries) {
         query = newList.get(query);
         response.add(query);
      }

      return response;
   }
}
