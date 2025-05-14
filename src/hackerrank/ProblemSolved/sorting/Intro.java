package hackerrank.ProblemSolved.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intro {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(
                1,
                4,
                5,
                6,
                9,
                12
        ));

        int V = 4;
        System.out.println(introTutorial(V, arr));
    }


    public static int introTutorial(int V, List<Integer> arr) {
//        for(int item : arr) {
//            if(item == V) {
//                return arr.indexOf(item);
//            }
//        }
//
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == V) {
                int value = arr.get(i);
                return arr.indexOf(value);
            }
        }
        return -1;
    }
}
