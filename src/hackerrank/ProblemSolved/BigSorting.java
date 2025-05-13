package hackerrank.ProblemSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigSorting {

    public static void main(String[] args) {
        ArrayList<String> unsorted = new ArrayList<>(Arrays.asList(
                "6",
                "31415926535897932384626433832795",
                "1",
                "3",
                "10",
                "3",
                "5"
        ));

        List<String> sorted = sorting(unsorted);

        for (String s : sorted) {
            System.out.println(s);
        }

    }


    public static List<String> sorting(List<String> unsorted) {
        unsorted.sort((a, b) -> {
            if(a.length() != b.length()) {
                return  a.length() - b.length();
            } else {
                return  a.compareTo(b);
            }
        });

        return unsorted;
    }


}
