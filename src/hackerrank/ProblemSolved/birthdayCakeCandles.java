package hackerrank.ProblemSolved;

public class birthdayCakeCandles {
   int[] candles = new int[] {3, 3, 2, 3};

   public static void main(String[] args) {
      birthdayCakeCandles birthdayCakeCandles = new birthdayCakeCandles();
      int[] candles = birthdayCakeCandles.candles;
      int result = birthdayCakeCandles.birthdayCake(candles);
      System.out.println("The largest number in this array appeared " + result + "x");
   }


   public int birthdayCake(int[] candles) {
      int maxNum = candles[0];
      int maxNumTotal = 0;

      for(int num : candles) {
         if(num > maxNum) {
            maxNum = num;
            maxNumTotal = 1;
         }else if(num == maxNum) {
            maxNumTotal++;
         }
      }


      return maxNumTotal;
   }
}
