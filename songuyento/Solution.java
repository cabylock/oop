package songuyento;

public class Solution {
   /**
    * Find the greatest common divisor.
    * @param n prime number
    * @return return prime number
    */
   public boolean isPrime(int n) {
      if (n < 2) {
         return false;
      }
      for (int i = 2; i <= Math.sqrt(n); i++) {
         if (n % i == 0) {
            return false;
         }
      }
      return true;
   }
}
