package hackerrank.ProblemSolved;

import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {


    public static void main(String[] args) {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        sockMerchant(n, ar);
    }

    private static void sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> colorCount = new HashMap<Integer, Integer>();
        int[] pairs = {0};


        for(int i = 0; i < n; i++) {
            int color = ar[i];

            if(colorCount.containsKey(color)) {
                colorCount.put(color, colorCount.get(color) + 1);
            }else {
                colorCount.put(color, 1);
            }
        }


        colorCount.forEach((color, count) -> pairs[0] += (count / 2));

        System.out.println("Number of pairs: " + pairs[0]);
    }

}
