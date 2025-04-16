public class Numeral extends Expression {
   private double value;

   /**
    * Constructor for Numeral.
    * 
    * @param value v
    */
   public Numeral(double value) {
      this.value = value;
   }

   public Numeral() {
      this.value = 0;
   }

   /**
    * toString method for Numeral.
    * 
    * @return the string representation of the numeral expression
    */
   @Override
   public String toString() {
      return String.format("%.0f", value);
   }

   @Override
   public double evaluate() {
      return value;
   }

}
