package hackerrank.ProblemSolved;

import java.util.Arrays;

public class GradingStudents {
   int[] grades = new int[] {73, 67, 38, 33};

   public static void main(String[] args) {
      GradingStudents gradingStudents = new GradingStudents();
      int[] roundedGrades = gradingStudents.grade(gradingStudents.grades);
      System.out.println("The new grade: " + Arrays.toString(roundedGrades));
   }

   public int[] grade(int[] grades) {
      return Arrays.stream(grades)
              .map(grade -> {
                 int diff = (int) (Math.ceil(grade / 5.0) * 5 - grade);
                 System.out.println(diff);
                 return (diff < 3 && grade >= 38) ? (int) Math.ceil(grade / 5.0) * 5 : grade;
              })
              .toArray();
   }
}
