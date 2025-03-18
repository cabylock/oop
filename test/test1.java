package test;

public class test1 {

   private static class Person {
      
      public Person(int x) {
         System.out.println("Personx");
      }
   }

   public static class Employee extends Person {
      public Employee(int x) {
         super(x);
         System.out.println("Employee");
      }

   }

   public static void main(String[] args) {
      Employee employee = new Employee(5);
      
   }

}
