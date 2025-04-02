public class test4 {
   interface abs {
      // public abstract class abc {}; 
   }
   
   protectedN abstract static class Car extends Vehicle {

      private  abstract int z();

      public void start() {
         System.out.println("Car::start");
      }

   }
   public static void main(String[] args) {
      Vehicle vehicle = new Vehicle();
      vehicle.start();

      Car car = new Car();
      car.start();
   }
}
