public class Circle {
   private double radius;
   private String color;

   protected static final double PI = 3.14;

   public Circle() {
      this.radius = 1.0;
      this.color = "red";
   }

   public Circle(double radius) {
      this.radius = radius;
      this.color = "red";
   }

   public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public double getRadius() {
      return radius;
   }

   public double getArea() {
      return PI * radius * radius;
   }

   public String getColor() {
      return color;
   }

   /**
    * toString.
    * 
    * @return string
    */
   @Override
   public String toString() {
      return "Circle[radius=" + radius + ",color=" + color + "]";
   }

}
