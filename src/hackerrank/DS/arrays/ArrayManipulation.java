package hackerrank.DS.arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        int n = 5;
        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9 ,1}
        };

        long result = arrayManipulation(n, queries);
        System.out.println("The maximum value is: " + result);
    }



    public static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 2];

        for(int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];

            if( a >= 1 && a <= n) {
                arr[a] += k;
            }
            if(b + 1 >= 1 && b + 1 <= n + 1){
                arr[b + 1] -= k;
            }
        }

        long max = 0;
        long current = 0;
        for(int i = 1; i <= n; i++) {
            current += arr[i];
            if(current > max) {
                max = current;
            }
        }

        return max;
    }
}