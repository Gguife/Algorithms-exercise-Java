package hackerrank.ProblemSolved;

import java.util.Arrays;

public class AngryProfessor {

    public static void main(String[] args) {
        int k = 3;
        int[] a = {-2, -1, 0, 1, 2};
        String result = angryProf(k ,a);
        System.out.println("The professor answer is: " + result);
    }

    public static String angryProf(int k, int[] a) {
        return Arrays.stream(a).filter(time -> time <= 0).count() >= k ? "NO" : "YES";
    }
}
