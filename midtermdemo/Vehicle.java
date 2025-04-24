
public abstract class Vehicle {

   protected String brand;
   protected String model;
   protected int year;

   public Vehicle(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year = year;
   }

   public Vehicle() {
   }

   public String getBrand() {
      return brand;
   }

   public String getModel() {
      return model;
   }

   public int getYear() {
      return year;
   }

   public void setBrand(String brand) {
      this.brand = brand;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public abstract String getInfo();

   public abstract double calculateValue();

   public String toString() {
      return "Vehicle[brand=" + brand + ", model=" + model + ", year=" + year + "]";
   }

}
