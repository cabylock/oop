public class Cylinder extends Circle {
   private double height;

   public Cylinder() {
      super();
   }

   public Cylinder(double radius) {
      super(radius);
   }

   public Cylinder(double radius, double height) {
      super(radius);
      this.height = height;
   }

   public Cylinder(double radius, double height, String color) {
      super(radius, color);
      this.height = height;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public double getVolume() {
      return getArea() * height;
   }

   public double getArea() {
      return 2 * PI * getRadius() * (getRadius() + height);
   }

   /**
    * overide.
    * 
    * @return String
    */
   @Override
   public String toString() {
      return "Cylinder[" + super.toString() + ",height=" + height + "]";
   }

}
