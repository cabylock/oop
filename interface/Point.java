public class Point {
   private double pointX;
   private double pointY;

   /**
    * Khởi tạo một điểm với tọa độ x, y.
    * 
    * @param pointX tọa độ x
    * @param pointY tọa độ y
    */
   public Point(double pointX, double pointY) {
      this.pointX = pointX;
      this.pointY = pointY;
   }

   /**
    * Lấy tọa độ x của điểm.
    * 
    * @return tọa độ x
    */
   public double getPointX() {
      return pointX;
   }

   /**
    * Cập nhật tọa độ x của điểm.
    * 
    * @param pointX tọa độ x mới
    */
   public void setPointX(double pointX) {
      this.pointX = pointX;
   }

   /**
    * Lấy tọa độ y của điểm.
    * 
    * @return tọa độ y
    */
   public double getPointY() {
      return pointY;
   }

   /**
    * Cập nhật tọa độ y của điểm.
    * 
    * @param pointY tọa độ y mới
    */
   public void setPointY(double pointY) {
      this.pointY = pointY;
   }

   /**
    * Tính khoảng cách từ điểm này đến điểm khác.
    * 
    * @param other điểm cần tính khoảng cách đến
    * @return khoảng cách giữa hai điểm
    */
   public double distance(Point other) {
      return Math.sqrt(Math.pow(pointX - other.pointX, 2) + Math.pow(pointY - other.pointY, 2));
   }

   /**
    * Chuyển đổi điểm thành chuỗi.
    * 
    * @return chuỗi biểu diễn điểm dạng (x,y)
    */
   @Override
   public String toString() {
      return String.format("(%.2f,%.2f)", pointX, pointY);
   }
}
