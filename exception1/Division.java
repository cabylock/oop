public class Division extends BinaryExpression {
   /**
    * Constructor for Division.
    * 
    * @param left  l
    * @param right r
    */
   public Division(Expression left, Expression right) {
      super(left, right);
   }

   /**
    * toString method for Division.
    * 
    * @return the string representation of the division expression
    */
   @Override
   public String toString() {
      return "(" + left.toString() + " / " + right.toString() + ")";
   }

   @Override
   public double evaluate() throws ArithmeticException {
      if (right.evaluate() == 0) {
         throw new ArithmeticException("Lỗi chia cho 0");
      }
      return left.evaluate() / right.evaluate();
   }

}
