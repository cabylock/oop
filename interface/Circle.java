public class Circle implements GeometricObject {
   public static final double PI = 3.14;
   private double radius;
   private Point center;

   /**
    * Khởi tạo một hình tròn với tâm và bán kính.
    * 
    * @param center điểm tâm của hình tròn
    * @param radius bán kính của hình tròn
    */
   public Circle(Point center, double radius) {
      this.radius = radius;
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
    * Tính diện tích hình tròn.
    * 
    * @return diện tích hình tròn
    */
   @Override
   public double getArea() {
      return PI * radius * radius;
   }

   /**
    * Tính chu vi hình tròn.
    * 
    * @return chu vi hình tròn
    */
   @Override
   public double getPerimeter() {
      return 2 * PI * radius;
   }

   /**
    * Lấy thông tin hình tròn dưới dạng chuỗi.
    * 
    * @return chuỗi chứa thông tin hình tròn
    */
   @Override
   public String getInfo() {
      return String.format("Circle[%s,r=%.2f]",
            this.center.toString(),
            this.radius);
   }

}
