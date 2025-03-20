public class MotorBike extends Vehicle {
   private boolean hasSidecar;

   /**
    * Constructor.
    * 
    * @param brand             brand
    * @param model             model
    * @param registratorNumber number
    * @param owner             owner
    * @param hasSidecar        sidecar
    */
   public MotorBike(String brand, String model, String registratorNumber,
         Person owner, boolean hasSidecar) {
      super(brand, model, registratorNumber, owner);
      this.hasSidecar = hasSidecar;
   }

   /**
    * setter.
    * 
    * @param hasSidecar the hasSidecar to set
    */
   public void setHasSidecar(boolean hasSidecar) {
      this.hasSidecar = hasSidecar;
   }

   /**
    * getter.
    * 
    * @return the hasSidecar
    */
   public boolean isHasSidecar() {
      return hasSidecar;
   }

   /**
    * getinfo.
    * 
    * @return info
    */
   public String getInfo() {
      return "Motor Bike:\n"
            + "\t" + String.format("Brand: %s", brand) + "\n"
            + "\t" + String.format("Model: %s", model) + "\n"
            + "\t" + String.format("Registration Number: %s", registrationNumber) + "\n"
            + "\t" + String.format("Has Side Car: %s", hasSidecar) + "\n"
            + "\t" + String.format("Belongs to %s - %s", owner.getName(), owner.getAddress());
   }
}
