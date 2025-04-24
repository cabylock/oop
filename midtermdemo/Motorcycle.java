public class Motorcycle extends Vehicle {
   protected int engineSize;

   public Motorcycle() {

   }

   public Motorcycle(String brand, String model, int year, int engineSize) {
      super(brand, model, year);
      this.engineSize = engineSize;
   }

   @Override
   public String getInfo() {
      return "Motorcycle(" + brand + " " + model + " " + year + ") - " + engineSize + "cc";
   }

   @Override
   public double calculateValue() {
      double baseValue = 0;
      if (year < 3) {
         baseValue = 20000;
      } else if (year >= 3 && year <= 7) {
         baseValue = 10000;
      } else {
         baseValue = 5000;
      }
      return baseValue + (engineSize * 10);
   }

   @Override
   public String toString() {
      return "Motorcycle[brand=" + brand + ", model=" + model + ", year=" + year + ", engineSize=" + engineSize + "]";
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (!(obj instanceof Motorcycle))
         return false;
      Motorcycle other = (Motorcycle) obj;
      return super.equals(obj) && this.engineSize == other.engineSize;
   }

}
