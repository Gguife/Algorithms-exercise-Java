package hackerrank.ProblemSolved;

public class BeautiDays {

    public static void main(String[] args) {
        int i = 13;
        int j = 45;
        int k = 3;
        System.out.println("Number of beautiful days in the interval: " + beautifulDays(i, j, k));
    }

    public static int beautifulDays(int i, int j, int k) {
        int days = 0;

        for(int day = i; day <= j; day++ ) {
            int reverseSum = Integer.parseInt(new StringBuilder(String.valueOf(day)).reverse().toString());
            if(Math.abs(day - reverseSum) % k == 0) {
                days += 1;
            }
        }

        return  days;
    }

}
