package hackerrank.ProblemSolved;

public class Viral {

    public static void main(String[] args) {
        int n = 3;
        System.out.println("The likes accumulated that day: " + viralAdvertising(n));
    }

    public static int viralAdvertising(int n) {
        int likes = 0;
        int recipients = 5;

        for(int i = 1; i <= n; i++) {
            likes = likes + Math.floorDiv(recipients, 2);
            recipients = Math.floorDiv(recipients, 2) * 3;
        }

        return likes;
    }

}
