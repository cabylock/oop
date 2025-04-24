
public class Student extends Person {
   public int age = 10;

   public void abc(int x, String y, int z) {
      return;
   }

   public void abd(int x, int y, String z) {
      return;
   }

   public static void main(String[] args) {

      Person p = new Student();
      p.abc();

   }

}
