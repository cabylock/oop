
public class Square extends Expression {
   private Expression expression;

   /**
    * Constructor for Square.
    * 
    * @param expression e
    */
   public Square(Expression expression) {

      this.expression = expression;
   }

   /**
    * square constructor.
    * 
    * @return the string representation of the square expression
    */
   @Override
   public String toString() {
      return "("
            + expression.toString()
            + ")"
            + " ^ 2";
   }

   @Override
   public double evaluate() {
      return expression.evaluate() * expression.evaluate();
   }

}
