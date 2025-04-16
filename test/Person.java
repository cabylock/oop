public class Person implements abc {
   private int age;

  

   public Person(int age) {
      this.age = age;
   }

   private void  abc(){
      System.out.println("abc");
   }

   static void azd() {
      System.out.println("azd");
   }

   public final void setAge(int age) {
      this.age = age;
   }

}

