public class Multiplication extends BinaryExpression {
   /**
    * Constructor for Multiplicaation.
    * 
    * @param left  l
    * @param right r
    */
   public Multiplication(Expression left, Expression right) {
      super(left, right);
   }

   /**
    * toString method for Multiplication.
    * 
    * @return the string representation of the multiplication expression
    */
   @Override
   public String toString() {
      return "("
            + left.toString()
            + " * "
            + right.toString()
            + ")";
   }

   @Override
   public double evaluate() {
      return left.evaluate() * right.evaluate();
   }

}
