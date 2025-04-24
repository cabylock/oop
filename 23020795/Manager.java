public class Manager extends Employee {
   protected int teamSize;
   protected String department;

   public Manager() {
      super();
   }

   public Manager(String name, String id, double baseSalary, int yearsOfExperience,
         int teamSize, String department) {
      super(name, id, baseSalary, yearsOfExperience);
      this.teamSize = teamSize;
      this.department = department;
   }

   /**
    * @return the teamSize
    */
   public int getTeamSize() {
      return teamSize;
   }

   /**
    * @param teamSize the teamSize to set
    */
   public void setTeamSize(int teamSize) {
      this.teamSize = teamSize;
   }

   /**
    * @return the department
    */
   public String getDepartment() {
      return department;
   }

   /**
    * @param department the department to set
    */
   public void setDepartment(String department) {
      this.department = department;
   }

   @Override
   public String getInfo() {
      return "Manager(" + name + " - " + id + ")"
            + " - " + department + " Department, " + "Team of " + teamSize;
   }

   @Override
   public double calculateSalary() {
      double bonusEx = yearsOfExperience * 1000;
      double bonusTeam = teamSize * 200;
      return baseSalary + bonusEx + bonusTeam;
   }

   @Override
   public String toString() {
      return "Manager[name=" + name + ",id=" + id + ",baseSalary=" + baseSalary
            + ",yearsOfExperience=" + yearsOfExperience
            + ",teamSize=" + teamSize
            + ",department=" + department + "]";
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (!super.equals(obj)) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Manager other = (Manager) obj;
      if (teamSize != other.teamSize) {
         return false;
      }
      if (department == null) {
         if (other.department != null) {
            return false;
         }
      } else if (!department.equals(other.department)) {
         return false;
      }
      return true;
   }

}
