public class Triangle implements GeometricObject {
   private Point p1;
   private Point p2;
   private Point p3;

   /**
    * Khởi tạo một tam giác với 3 điểm.
    * 
    * @param p1 điểm thứ nhất
    * @param p2 điểm thứ hai
    * @param p3 điểm thứ ba
    * @throws RuntimeException nếu 3 điểm không tạo thành tam giác hợp lệ
    */
   public Triangle(Point p1, Point p2, Point p3) {
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
      if (p1.distance(p2) + p2.distance(p3) <= p3.distance(p1)
            || p1.distance(p3) + p3.distance(p2) <= p2.distance(p1)
            || p2.distance(p3) + p3.distance(p1) <= p1.distance(p2)) {
         throw new RuntimeException();
      }
      if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) {
         throw new RuntimeException();
      }
   }

   /**
    * Lấy điểm thứ nhất của tam giác.
    * 
    * @return điểm thứ nhất
    */
   public Point getP1() {
      return p1;
   }

   /**
    * Lấy điểm thứ hai của tam giác.
    * 
    * @return điểm thứ hai
    */
   public Point getP2() {
      return p2;
   }

   /**
    * Lấy điểm thứ ba của tam giác.
    * 
    * @return điểm thứ ba
    */
   public Point getP3() {
      return p3;
   }

   /**
    * Tính diện tích tam giác.
    * 
    * @return diện tích tam giác
    */
   @Override
   public double getArea() {
      double a = p1.distance(p2);
      double b = p2.distance(p3);
      double c = p3.distance(p1);
      double s = (a + b + c) / 2;
      return Math.sqrt(s * (s - a) * (s - b) * (s - c));
   }

   /**
    * Tính chu vi tam giác.
    * 
    * @return chu vi tam giác
    */
   @Override
   public double getPerimeter() {
      return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
   }

   /**
    * Lấy thông tin tam giác dưới dạng chuỗi.
    * 
    * @return chuỗi chứa thông tin tam giác
    */
   @Override
   public String getInfo() {
      return String.format("Triangle[%s,%s,%s]", p1.toString(), p2.toString(), p3.toString());
   }
}
