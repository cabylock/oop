public class Subtraction extends BinaryExpression {
   /**
    * Constructor for Substraction.
    * 
    * @param left  l
    * @param right r
    */
   public Subtraction(Expression left, Expression right) {
      super(left, right);
   }

   /**
    * toString method for Substraction.
    * 
    * @return the string representation of the substraction expression.
    */
   @Override
   public String toString() {
      return "("
            + left.toString()
            + " + -"
            + right.toString()
            + ")";
   }

   @Override
   public double evaluate() {
      return left.evaluate() - right.evaluate();
   }
}
