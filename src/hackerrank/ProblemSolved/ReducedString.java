package hackerrank.ProblemSolved;

import java.util.*;

public class ReducedString {

    public static void main(String[] args) {
        String s = "aaabb";
        System.out.println("The result is: " + superReducedString(s));
    }

    public static String superReducedString(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for(char c : stack) {
            result.append(c);
        }

        return result.length() == 0 ? "Empty String" : result.toString();
    }
}
