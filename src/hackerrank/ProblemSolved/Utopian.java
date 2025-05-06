package hackerrank.ProblemSolved;

public class Utopian {

    public static void main(String[] args) {
        int n = 4;
        int result = utopianTree(n);
        System.out.println("The height of trees after the given number of clicks: " + result);
    }

    public static int utopianTree(int n) {
        int height = 1;

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0 & i != 0) {
               height = height * 2;
            }else {
                height += 1;
            }
        }

        return height;
    }
}
