package hackerrank.ProblemSolved;

public class TimeConversion {
   String time = "07:05:45PM";

   public static void main(String[] args) {
      TimeConversion timeConversion = new TimeConversion();
      System.out.println("The new time conversion is: " + timeConversion.conversion(timeConversion.time));
   }

   public String conversion(String time) {
      String[] timeArr =  time.split(":");
      int hours = Integer.parseInt(timeArr[0], 10);
      String minutes = timeArr[1];
      String seconds = timeArr[2].substring(0, 2);

      if(time.contains("PM") && hours != 12) {
         hours += 12;
      }
      if(time.contains("AM") && hours == 12) {
         hours = 0;
      }

       return String.format("%02d:%s:%s", hours, minutes, seconds);
   }
}
