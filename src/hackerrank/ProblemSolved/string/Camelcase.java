package hackerrank.ProblemSolved.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Camelcase {

    public static void main(String[] args) {
        String s = "camelCase";
        int result = camelcase(s);
        System.out.println("In string have " + result + " words.");
    }

    public static int camelcase(String s) {
        int count = 1;

        if(s == null || s.isEmpty()) return 0;

        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) count++;
        }

        return count;
    }
}
