

public class test1 {

   private static class Person {
      
      public Person() {
         System.out.println("Personx");
      }
   }

   public static class Employee extends Person {
      public Employee(int x) {

         System.out.println("Employee");
      }
      

   }

   public static void main(String[] args) {
      Employee employee = new Employee(5);
      
   }

}
