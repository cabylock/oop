import java.util.ArrayList;
import java.util.List;

public class Person {
   private String name;
   private String address;
   private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

   /**
    * Constructor.
    * 
    * @param name    name
    * @param address address
    */
   public Person(String name, String address) {
      this.name = name;
      this.address = address;
   }

   public void addVehicle(Vehicle vehicle) {
      vehicleList.add(vehicle);
   }

   /**
    * Remove vehicle from the list.
    * 
    * @param registrationNumber registration number
    */
   public void removeVehicle(String registrationNumber) {
      for (Vehicle v : vehicleList) {
         if (v.getRegistrationNumber().equals(registrationNumber)) {
            vehicleList.remove(v);
            return;
         }
      }
   }

   public String getName() {
      return name;
   }

   /**
    * setter.
    * 
    * @param address the address to set
    */
   public void setAddress(String address) {
      this.address = address;
   }

   /**
    * setter.
    * 
    * @param name the name to set
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * getter.
    * 
    * @return the address
    */
   public String getAddress() {
      return address;
   }

   /**
    * Get vehicles info.
    * 
    * @return String info
    */
   public String getVehiclesInfo() {

      if (vehicleList.isEmpty()) {
         return String.format("%s has no vehicle!", name);
      }

      String res = String.format("%s has:\n", name);
      res += "\n";
      for (Vehicle v : vehicleList) {
         res += v.getInfo() + "\n";
      }
      return res;
   }

}
