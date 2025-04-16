public class Addition extends BinaryExpression {
   /**
    * Constructor for Addition.
    * 
    * @param left  l
    * @param right r
    */
   public Addition(Expression left, Expression right) {
      super(left, right);
   }

   /**
    * toString method for Addition.
    * 
    * @return the string representation of the addition expression
    */
   @Override
   public String toString() {
      return "("
            + left.toString()
            + " + "
            + right.toString()
            + ")";

   }

   @Override
   public double evaluate() {
      return left.evaluate() + right.evaluate();
   }

}
