public abstract class BinaryExpression extends Expression {
   protected Expression left;

   protected Expression right;

   /**
    * Constructor for BinaryExpression.
    * 
    * @param left  l
    * @param right r
    */
   public BinaryExpression(Expression left, Expression right) {
      this.left = left;
      this.right = right;
   }

   public abstract String toString();

   public abstract double evaluate();
}
