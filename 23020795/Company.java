import java.util.List;
import java.util.ArrayList;

public class Company {
   private List<Employee> employees;

   public Company() {
      employees = new ArrayList<>();
   }

   public void addEmployee(Employee e) {
      employees.add(e);
   }

   public void removeEmployee(Employee e) {
      employees.remove(e);
   }

   public List<Employee> getEmployeeByDepartmet(String department) {
      List<Employee> result = new ArrayList<>();
      for (Employee e : employees) {
         if (e instanceof Manager && ((Manager) e).getDepartment().equals(department)) {
            result.add(e);
         }
      }
      return result;
   }

   public double getTotalSalary() {
      double total = 0;
      for (Employee e : employees) {
         total += e.calculateSalary();
      }
      return total;
   }

   public String getInfo() {
      String res = "Company Employees:\n";
      for (Employee e : employees) {
         res += e.getInfo() + "\n";
      }
      return res;
   }

}
