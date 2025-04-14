package leetCode.palindromeNumber;

public class PalindromeNumber {

   public static void main(String[] args) {
      System.out.println(palindromeNumber(11)); //True
      System.out.println(palindromeNumber(-121)); //False
      System.out.println(palindromeNumber(10)); //False
   }

   public static boolean palindromeNumber(int x) {
      String numStr = Integer.toString(x);
      StringBuilder reverseNum = new StringBuilder();

      //Method to integer reverse
      for(int i = numStr.length() - 1; i >= 0; i--) {
         reverseNum.append(numStr.charAt(i));
      }

      return numStr.equals(reverseNum.toString());
   }

}
