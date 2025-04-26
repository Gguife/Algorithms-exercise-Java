package hackerrank.ProblemSolved;

public class DrawingBooks {

    public static void main(String[] args) {
        int result = pageBooks(3, 4);
        System.out.println("The minimum page to passe is: " + result);
    }


    private static int pageBooks(int n, int p) {
        int front = p / 2;
        int back = Math.abs(n/2 - front);

        return Math.min(front, back);
    }

}
