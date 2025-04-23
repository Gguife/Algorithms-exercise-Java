package hackerrank.ProblemSolved;

import java.util.List;

public class BillDivision {

    public static void main(String[] args) {
        List<Integer> billAr = List.of(3, 10, 2, 9);
        int k = 1;
        int b = 12;

        bill(billAr, k, b);
    }

    public static void bill(List<Integer> billAr, int k, int b) {
        int totalCost = 0;

        for(int i = 0; i < billAr.size(); i++) {
            if(i != k) {
                totalCost += billAr.get(i);
            }
        }

        int annaShare = totalCost / 2;

        if(annaShare == b) {
            System.out.println("Bon Appetit");
        }else {
            System.out.println(b - annaShare);
        }
    }

}

