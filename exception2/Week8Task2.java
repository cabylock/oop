import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
   public void arithmeticEx() throws ArithmeticException {
      throw new ArithmeticException();
   }

   /**
    * Method .
    *
    * @return either error or info String
    */
   public String arithmeticExTest() {
      try {
         arithmeticEx();
      } catch (ArithmeticException e) {
         return "Lỗi Arithmetic";
      }
      return "Không có lỗi";
   }

   public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
      throw new ArrayIndexOutOfBoundsException();
   }

   /**
    * Method .
    *
    * @return either error or info String
    */
   public String arrayIndexOutOfBoundsExTest() {
      try {
         arrayIndexOutOfBoundsEx();
      } catch (ArrayIndexOutOfBoundsException e) {
         return "Lỗi Array Index Out of Bounds";
      }
      return "Không có lỗi";
   }

   public void fileNotFoundEx() throws FileNotFoundException {
      throw new FileNotFoundException();
   }

   /**
    * Method .
    *
    * @return either error or info String
    */
   public String fileNotFoundExTest() {
      try {
         fileNotFoundEx();
      } catch (FileNotFoundException e) {
         return "Lỗi File Not Found";
      }
      return "Không có lỗi";
   }

   public void ioEx() throws IOException {
      throw new IOException();
   }

   /**
    * Method .
    *
    * @return either error or info String
    */
   public String ioExTest() {
      try {
         ioEx();
      } catch (IOException e) {
         return "Lỗi IO";
      }
      return "Không có lỗi";
   }

   public void nullPointerEx() throws NullPointerException {
      throw new NullPointerException();
   }

   /**
    * Method .
    * 
    * @return either error or info String
    */
   public String nullPointerExTest() {
      try {
         nullPointerEx();
      } catch (NullPointerException e) {
         return "Lỗi Null Pointer";
      }
      return "Không có lỗi";
   }
}
