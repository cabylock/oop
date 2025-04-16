

public class Student extends Person {
   public int age;

   private Student() {
      super(1);

   }

   public void abd(int x, String y, int z) {
      return;
   }

   public void abd(int x, int y, String z) {
      return;
   }

   public static void main(String[] args) {

      Person p = new Student();
      System.out.println(p instanceof abc);

   }

}
