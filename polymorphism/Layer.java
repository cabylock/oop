import java.util.ArrayList;
import java.util.List;

public class Layer {

   private List<Shape> shapes;

   public Layer() {
      shapes = new ArrayList<Shape>();
   }

   public void addShape(Shape shape) {
      shapes.add(shape);
   }

   /**
    * get info of all shapes in layer.
    * 
    * @return String
    */
   public String getInfo() {
      String info = "";
      info += "Layer of crazy shapes:\n";
      for (Shape shape : shapes) {
         info += shape.toString() + "\n";
      }
      return info;
   }

   /**
    * remove all circles in layer.
    */
   public void removeCircles() {
      for (int i = 0; i < shapes.size(); i++) {
         if (shapes.get(i) instanceof Circle) {
            shapes.remove(i);
            i--;
         }
      }
   }

   /**
    * remove all triangles in layer.
    */
   public void removeDuplicates() {
      for (int i = 0; i < shapes.size(); i++) {
         for (int j = i + 1; j < shapes.size(); j++) {
            if (shapes.get(i).equals(shapes.get(j))) {
               shapes.remove(j);
               j--;
            }
         }
      }
   }

}
