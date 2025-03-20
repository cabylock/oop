
public abstract class Vehicle {
   protected String brand;
   protected String model;
   protected String registrationNumber;
   protected Person owner;

   /**
    * Constructor.
    * 
    * @param brand              brand
    * @param model              model
    * @param registrationNumber registration number
    * @param owner              owner
    */
   public Vehicle(String brand, String model, String registrationNumber, Person owner) {
      this.brand = brand;
      this.model = model;
      this.registrationNumber = registrationNumber;
      this.owner = owner;

   }

   public void transferOwnership(Person newOwner) {
      this.owner = newOwner;
   }

   /**
    * get.
    * 
    * @return the brand
    */
   public String getBrand() {
      return brand;
   }

   /**
    * get.
    * 
    * @param brand the brand to set
    */
   public void setBrand(String brand) {
      this.brand = brand;
   }

   /**
    * get.
    * 
    * @param model the model to set
    */
   public void setModel(String model) {
      this.model = model;
   }

   /**
    * get.
    * 
    * @param owner the owner to set
    */
   public void setOwner(Person owner) {
      this.owner = owner;
   }

   /**
    * get.
    * 
    * @return the model
    */
   public String getModel() {
      return model;
   }

   /**
    * get.
    * 
    * @return the owner
    */
   public Person getOwner() {
      return owner;
   }

   /**
    * get.
    * 
    * @return the registrationNumber
    */
   public String getRegistrationNumber() {
      return registrationNumber;
   }

   /**
    * get.
    * 
    * @param registrationNumber the registrationNumber to set
    */
   public void setRegistrationNumber(String registrationNumber) {
      this.registrationNumber = registrationNumber;
   }

   public abstract String getInfo();

}
