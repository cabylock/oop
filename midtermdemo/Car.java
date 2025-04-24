
public class Car extends Vehicle {
   protected int seats;
   
   public Car() {

   }
   
   public Car(String brand, String model, int year, int seats) {
      super(brand, model, year);
      this.seats = seats;
   }

   @Override
   public String getInfo() {
      return "Car(" + brand + " " + model + " " + year + ") - " + seats + " seats";
   }
   
   @Override
   public double calculateValue() {
      double baseValue = 0;
      if (year < 3) {
         baseValue = 50000;
      } else if (year >= 3 && year <= 7) {
         baseValue = 30000;
      } else {
         baseValue = 15000;
      }
      return baseValue + (seats * 1000);
   }
   
   @Override
   public String toString() {
      return "Car[brand=" + brand + ", model=" + model + ", year=" + year + ", seats=" + seats + "]";
   }

   @Override
   public boolean equals(Object obj) {
      
      if (this == obj) return true;
      if (!(obj instanceof Car)) return false;
      Car other = (Car) obj;
      return super.equals(obj) && this.seats == other.seats;
   }

}
