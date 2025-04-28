package hackerrank.ProblemSolved;

public class CatAndMouse {

    public static void main(String[] args) {
        int catA = 2;
        int catB = 5;
        int mouse = 4;

        animalWinner(catA, catB, mouse);
    }


    private static void animalWinner(int x, int z, int y) {
        int catA = Math.abs(x - y);
        int catB = Math.abs(z - y);

        if(catA > catB) {
            System.out.println("Cat B");
        } else if(catA < catB) {
            System.out.println("Cat A");
        } else {
            System.out.println("Mouse C");
        }
    }
}
