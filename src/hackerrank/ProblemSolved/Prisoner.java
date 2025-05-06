package hackerrank.ProblemSolved;

public class Prisoner {

    public static void main(String[] args) {
        int n = 3;
        int m = 7;
        int s = 3;
        System.out.println("The prisoner's chair number will be notified: " + saveThePrisoner(n, m ,s));
    }

    public static int saveThePrisoner(int n, int m, int s) {
        int result = (s + m - 1) % n;
        return result == 0 ? n : result;
    }
}
