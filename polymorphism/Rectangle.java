
public class Rectangle extends Shape {
   protected double width;
   protected double length;
   protected Point topLeft;

   public Rectangle() {
      super();
   }

   public Rectangle(double width, double length) {
      this.width = width;
      this.length = length;
   }

   /**
    * Constructor.
    * 
    * @param width  a
    * @param length a
    * @param color  a
    * @param filled a
    */
   public Rectangle(double width, double length, String color, boolean filled) {
      this.width = width;
      this.length = length;
      this.color = color;
      this.filled = filled;
   }

   /**
    * Constructor.
    * 
    * @param topLeft top left point
    * @param width   width
    * @param length  length
    * @param color   color
    * @param filled  filled
    */
   public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
      this.width = width;
      this.length = length;
      this.color = color;
      this.filled = filled;
      this.topLeft = topLeft;
   }

   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getLength() {
      return length;
   }

   public void setLength(double length) {
      this.length = length;
   }

   public Point getTopLeft() {
      return topLeft;
   }

   public void setTopLeft(Point topLeft) {
      this.topLeft = topLeft;
   }

   public double getArea() {
      return width * length;
   }

   public double getPerimeter() {
      return 2 * (width + length);
   }

   @Override
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

   @Override
   public String toString() {
      return String.format(
            "Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%b]",
            topLeft.toString(), width, length, color, filled);
   }

}
