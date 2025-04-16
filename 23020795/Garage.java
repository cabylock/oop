import java.util.List;
import java.util.ArrayList;

public class Garage {
   List<Vehicle> vehicles;

   public Garage() {
      vehicles = new ArrayList<>();
   }

   public void addVehicle(Vehicle vehicle) {
      vehicles.add(vehicle);
   }

   public void removeVehicle(Vehicle vehicle) {
      vehicles.remove(vehicle);
   }

   public List<Vehicle> getVehicles() {
      return vehicles;
   }

   public double getTotalValue() {
      double totalValue = 0;
      for (Vehicle vehicle : vehicles) {
         totalValue += vehicle.calculateValue();
      }
      return totalValue;
   }

   public String getInfo() {
      String res = "Garage Inventory:\n";
      for (Vehicle vehicle : vehicles) {
         res += vehicle.getInfo() + "\n";
      }
      return res;
   }

}
