import java.util.List;

/**
 * Lớp tiện ích để xử lý và hiển thị thông tin các hình học.
 */
public class ShapeUtil {
   /**
    * In thông tin của danh sách các hình học.
    * 
    * @param shapes danh sách các hình học cần hiển thị
    * @return chuỗi chứa thông tin các hình theo định dạng yêu cầu
    */
   public String printInfo(List<GeometricObject> shapes) {
      String result = "Circle:\n";
      for (GeometricObject shape : shapes) {
         if (shape instanceof Circle) {
            result += shape.getInfo() + "\n";
         }
      }
      result += "Triangle:\n";
      for (GeometricObject shape : shapes) {
         if (shape instanceof Triangle) {
            result += shape.getInfo() + "\n";
         }
      }
      return result;
   }
}
