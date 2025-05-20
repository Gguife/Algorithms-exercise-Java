package hackerrank.ProblemSolved.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningTime {

    public static int runningTime(List<Integer> arr) {
        int shifts = 0;

        for(int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                shifts++;
                j--;
            }

            arr.set(j + 1, key);
        }

        return shifts;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2, 1, 3, 1, 2));
        int result = runningTime(arr);
        System.out.println("The result is: " + result);
    }
}
