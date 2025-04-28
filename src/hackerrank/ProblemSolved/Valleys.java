package hackerrank.ProblemSolved;

public class Valleys {


    public static void main(String[] args) {
        String path = "DDUUUUDD";
        int steps = 8;

        System.out.println("He walked " + count(steps, path) + " valleys.");
    }

    private static int count(int steps, String path) {
        int altitude = 0;
        int valleys = 0;

        //split path
        String[] pathArr = path.split("");


        for(int i = 0; i < steps; i++) {

            if(pathArr[i].equals("U")) {
                altitude++;
            }else if(pathArr[i].equals("D")) {
                altitude--;
            }

            if(altitude == 0 && pathArr[i].equals("U")) {
                valleys++;
            }
        }

        return valleys;
    }
}
