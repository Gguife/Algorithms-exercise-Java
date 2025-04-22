package hackerrank.ProblemSolved;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        int[] ar = new int[] {1, 3, 2, 6, 1, 2};

        DivisibleSumPairs divisibleSumPairs = new DivisibleSumPairs();
        int result = divisibleSumPairs.divSumPairs(n, k , ar);
        System.out.println("Divisible count: " + result);
    }


    public int divSumPairs(int n,int k ,int[] ar) {
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
