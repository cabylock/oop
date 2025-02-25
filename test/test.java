package test;

public class test {

   /**
    * Find the greatest common divisor.
    * 
    * @param n prime number
    * @return return prime number
    */
   public static long fibonacci(long n) {

      if (n < 0) {
         return -1;
      }
      long prev = 0;
      long current = 1;

      if (n <= 1) {
         return n;
      } else {

         for (long i = 2; i <= n; i++) {
            long next = prev + current;
            if (next < current) {
               return Long.MAX_VALUE;
            }
            prev = current;
            current = next;
         }
      }
      return current;

   }

   public static void main(String[] args) {
      long a = Long.MAX_VALUE;
      System.out.println(fibonacci(a));
   }
}
