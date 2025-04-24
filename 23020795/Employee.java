public abstract class Employee {
   protected String name;
   protected String id;
   protected double baseSalary;
   protected int yearsOfExperience;

   public Employee() {
   };

   public Employee(String name, String id, double baseSalary, int yearsOfExperience) {
      this.name = name;
      this.id = id;
      this.baseSalary = baseSalary;
      this.yearsOfExperience = yearsOfExperience;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public double getBaseSalary() {
      return baseSalary;
   }

   public void setBaseSalary(double baseSalary) {
      this.baseSalary = baseSalary;
   }

   public int getYearsOfExperience() {
      return yearsOfExperience;
   }

   public void setYearsOfExperience(int yearsOfExperience) {
      this.yearsOfExperience = yearsOfExperience;
   }

   public abstract double calculateSalary();

   public abstract String getInfo();

   public String toString() {
      return "Employee[name=" + name +
            ",id=" + id + ",baseSalary=" + baseSalary + ",yearsOfExperience=" + yearsOfExperience + "]";
   }

   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
         return false;
      }
      Employee other = (Employee) obj;
      return Double.compare(other.baseSalary, baseSalary) == 0 &&
            yearsOfExperience == other.yearsOfExperience &&
            name.equals(other.name) &&
            id.equals(other.id);
   }

}
