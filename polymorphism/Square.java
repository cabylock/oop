import java.util.Random;

public class Square extends Rectangle {

   public Square() {
      super();
   }

   public Square(double side) {
      this.width = side;
      this.length = side;
   }

   /**
    * Constructor.
    * 
    * @param side   a
    * @param color  a
    * @param filled a
    */
   public Square(double side, String color, boolean filled) {
      this.width = side;
      this.length = side;
      this.color = color;
      this.filled = filled;
   }

   /**
    * Constructor.
    * 
    * @param topLeft top left point
    * @param side    side
    * @param color   color
    * @param filled  filled
    */
   public Square(Point topLeft, double side, String color, boolean filled) {
      this.width = side;
      this.length = side;
      this.color = color;
      this.filled = filled;
      this.topLeft = topLeft;
   }

   public double getSide() {
      return width;
   }

   public void setSide(double side) {
      this.width = side;
      this.length = side;
   }

   public void setWidth(double side) {
      this.width = side;
      this.length = side;
   }

   public void setLength(double side) {
      this.length = side;
      this.width = side;
   }

   /**
    * Check if two squares are equal.
    * 
    * @param obj object
    * @return true if two squares are equal, false otherwise
    */
   public boolean equals(Object obj) {
      if (this == obj) {

         return false;
      }
      if (obj == null) {

         return false;
      }
      if (getClass() != obj.getClass()) {

         return false;
      }
      Rectangle other = (Rectangle) obj;

      return topLeft.equals(other.topLeft)
            && Math.abs(length - other.length) < 0.001
            && Math.abs(width - other.width) < 0.001;

   }

   public void move() {
      Random random = new Random();
      topLeft.setPointX(random.nextInt(800));
      topLeft.setPointY(random.nextInt(600));
   }

   public void draw(java.awt.Graphics g) {
      g.setColor(java.awt.Color.YELLOW);
      if (isFilled()) {
         g.fillRect((int) topLeft.getPointX(), (int) topLeft.getPointY(), (int) width, (int) length);
      } else {
         g.drawRect((int) topLeft.getPointX(), (int) topLeft.getPointY(), (int) width, (int) length);
      }
   }

   @Override
   public String toString() {
      return String.format(
            "Square[topLeft=%s,side=%.1f,color=%s,filled=%b]", topLeft, width, color, filled);
   }

   // public static void main(String[] args) {
   // Square square = new Square(5, "red", true, new Point(1, 2));
   // System.out.println(square);
   // }

}
