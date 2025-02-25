package phanso;

public class Solution {
   private int numerator;
   private int denominator;

   public int getDenominator() {
      return denominator;
   }
   
   public int getNumerator() {
      return numerator;
   }

   /**
    * Set the denominator of the fraction.
    * 
    * @param denominator this is the denominator
    */
   public void setDenominator(int denominator) {

      if (denominator != 0) {
         this.denominator = denominator;
      }
   }

   /**
    * Set the numerator of the fraction.
    * 
    * @param numerator this is the numerator
    */
   public void setNumerator(int numerator) {
      this.numerator = numerator;
   }

   /**
    * Constructor.
    * 
    * @param numerator   this is the numerator
    * @param denominator this is the denominator
    */
   Solution(int numerator, int denominator) {
      if (denominator != 0) {

         this.numerator = numerator;
         this.denominator = denominator;
      } else {
         this.numerator = numerator;
         this.denominator = 1;
      }

   }

   /**
    * Find the greatest common divisor.
    * 
    * 
    * @param a prime number
    * @param b prime number
    * @return prime number
    */
   public int gcd(int a, int b) {
      if (b == 0) {
         return a;
      }
      return gcd(b, a % b);
   }

   /**
    * Reduce the fraction.
    * 
    * @return the reduced fraction
    */
   public Solution reduce() {
      int gcd = gcd(numerator, denominator);
      return new Solution(numerator / gcd, denominator / gcd);
   }

   /**
    * Add two fractions.
    * 
    * @param other the other fraction
    * @return the sum of the two fractions
    */
   public Solution add(Solution other) {
      this.numerator = numerator * other.getDenominator() + other.getNumerator() * denominator;
      this.denominator = denominator * other.getDenominator();
      return this.reduce();
   }

   /**
    * Subtract two fractions.
    * 
    * @param other the other fraction
    * @return the difference of the two fractions
    */
   public Solution subtract(Solution other) {
      this.numerator = numerator * other.getDenominator() - other.getNumerator() * denominator;
      this.denominator = denominator * other.getDenominator();
      return this.reduce();
   }

   /**
    * Multiply two fractions.
    * 
    * @param other the other fraction
    * @return the product of the two fractions
    */
   public Solution multiply(Solution other) {
      this.numerator = numerator * other.getNumerator();
      this.denominator = denominator * other.getDenominator();
      return this.reduce();
   }

   /**
    * Divide two fractions.
    * 
    * @param other the other fraction
    * @return the quotient of the two fractions
    */
   public Solution divide(Solution other) {
      this.numerator = numerator * other.getDenominator();
      this.denominator = denominator * other.getNumerator();
      return this.reduce();
   }

   /**
    * Check if two fractions are equal.
    * 
    * @param obj the other fraction
    * @return true if the two fractions are equal, false otherwise
    */
   public boolean equals(Object obj) {
      if (obj instanceof Solution) {
         Solution other = (Solution) obj;
         return numerator * other.getDenominator() == other.getNumerator() * denominator;
      } else {
         return false;
      }
   }

}
