
public class Circle extends Shape {
   protected double radius;
   protected Point center;

   public Circle() {
      super();
   }

   public Circle(double radius) {
      this.radius = radius;
   }

   /**
    * Constructor.
    * 
    * @param radius radius
    * @param color  color
    * @param filled filled
    */
   public Circle(double radius, String color, boolean filled) {
      this.radius = radius;
      this.color = color;
      this.filled = filled;
   }

   /**
    * constructor.
    * 
    * @param center center
    * @param radius radius
    * @param color  color
    * @param filled filled
    */
   public Circle(Point center, double radius, String color, boolean filled) {
      this.radius = radius;
      this.color = color;
      this.filled = filled;
      this.center = center;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public Point getCenter() {
      return center;
   }

   public void setCenter(Point center) {
      this.center = center;
   }

   /**
    * Calculate circle area.
    *
    * @return circle area
    */
   public double getArea() {

      return Math.PI * this.radius * this.radius;
   }

   /**
    * Calculate circle perimeter.
    *
    * @return circle perimeter
    */
   public double getPerimeter() {
      return 2 * Math.PI * this.radius;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == this) {
         return false;
      }
      if (obj == null) {
         return false;
      }

      if (obj instanceof Circle) {
         Circle circle = (Circle) obj;
         return Math.abs(this.radius - circle.radius) < 0.001
               && Math.abs(this.center.getPointX() - circle.center.getPointX()) < 0.001
               && Math.abs(this.center.getPointY() - circle.center.getPointY()) < 0.001;
      }
      return false;
   }

   @Override
   public String toString() {
      return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%b]",
            this.center, this.radius, this.color,
            this.filled);
   }
}
