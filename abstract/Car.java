public class Car extends Vehicle {
   private int numberOfDoors;

   /**
    * Constructor.
    * 
    * @param brand             brand
    * @param model             model
    * @param registratorNumber registrator number
    * @param owner             owner
    * @param numberOfDoors     doors
    */
   public Car(String brand, String model, String registratorNumber,
         Person owner, int numberOfDoors) {
      super(brand, model, registratorNumber, owner);
      this.numberOfDoors = numberOfDoors;
   }

   /**
    * setter.
    * 
    * @param numberOfDoors the numberOfDoors to set
    */
   public void setNumberOfDoors(int numberOfDoors) {
      this.numberOfDoors = numberOfDoors;
   }

   /**
    * getter.
    * 
    * @return the numberOfDoors
    */
   public int getNumberOfDoors() {
      return numberOfDoors;
   }

   /**
    * Get info.
    * 
    * @return String info
    */
   public String getInfo() {

      return "Car:\n"
            + "\t" + String.format("Brand: %s", brand) + "\n"
            + "\t" + String.format("Model: %s", model) + "\n"
            + "\t" + String.format("Registration Number: %s", registrationNumber) + "\n"
            + "\t" + String.format("Number of Doors: %s", numberOfDoors) + "\n"
            + "\t" + String.format("Belongs to %s - %s", owner.getName(), owner.getAddress());

   }
}
