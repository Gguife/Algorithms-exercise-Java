package hackerrank.ProblemSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesignerPDF {


    public static void main(String[] args) {
        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String word = "abc";

        int result = pdfViewer(h, word);

        System.out.println("The maximum value is: " + result);
    }

     public static int pdfViewer(int[] h, String word) {
        String[] newWords = word.split("");
        String[] alphabet = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };

        //Convert alphabet to lowercase
        List<String> alphabetLowercase = new ArrayList<>();
        for(String letter : alphabet) {
            alphabetLowercase.add(letter.toLowerCase());
        }

        //Create a new array to store heights
        List<Integer> newArr = new ArrayList<>();

        for(String newWord : newWords) {
            int index = alphabetLowercase.indexOf(newWord);
            if(index != -1) {
                newArr.add(h[index]);
            }
        }

        int maxValue = newArr.stream().max(Integer::compare).orElse(0);
        return maxValue * newWords.length;
    }

}
