package hackerrank.ProblemSolved;

import java.util.ArrayList;
import java.util.List;

public class Eletronic {

    public static void main(String[] args) {
        int b = 60;
        int[] keybords = {40, 50, 60};
        int[] drivers = {5, 8, 12};

        System.out.println("This is the maximum amount he can spend: " + shop(b, keybords, drivers));
    }

    private static int shop(int b, int[] keyboards, int[] drivers) {
        int maxSpent = -1;
        List<Integer> sums = new ArrayList<>();


        for(int keyboard : keyboards) {
            for(int driver : drivers) {
                sums.add(keyboard + driver);
            }
        }


        for(int cost : sums) {
            if(cost <= b) {
                maxSpent = Math.max(maxSpent, cost);
            }
        }

        return maxSpent;
    }


}
