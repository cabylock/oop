public interface GeometricObject {
   /**
    * Tính diện tích của hình.
    * 
    * @return diện tích của hình
    */
   public double getArea();

   /**
    * Tính chu vi của hình.
    * 
    * @return chu vi của hình
    */
   public double getPerimeter();

   /**
    * Lấy thông tin của hình dưới dạng chuỗi.
    * 
    * @return chuỗi chứa thông tin của hình
    */
   public String getInfo();
}
