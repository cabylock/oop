public class Developer extends Employee {

   protected String programmingLanguage;
   protected int projectsCompleted;

   public Developer() {
      super();
   }

   public Developer(String name, String id, double baseSalary, int yearsOfExperience,
         String programmingLanguage, int projectsCompleted) {
      super(name, id, baseSalary, yearsOfExperience);
      this.programmingLanguage = programmingLanguage;
      this.projectsCompleted = projectsCompleted;
   }

   /**
    * @return the programmingLanguage
    */
   public String getProgrammingLanguage() {
      return programmingLanguage;
   }

   /**
    * @param programmingLanguage the programmingLanguage to set
    */
   public void setProgrammingLanguage(String programmingLanguage) {
      this.programmingLanguage = programmingLanguage;
   }

   /**
    * @return the projectsCompleted
    */
   public int getProjectsCompleted() {
      return projectsCompleted;
   }

   /**
    * @param projectsCompleted the projectsCompleted to set
    */
   public void setProjectsCompleted(int projectsCompleted) {
      this.projectsCompleted = projectsCompleted;
   }

   @Override
   public String getInfo() {
      return "Developer(" + name + " - " + id + ")"
            + " - " + programmingLanguage + ", " + projectsCompleted + " projects";
   }

   @Override
   public double calculateSalary() {
      double bonusEx = yearsOfExperience * 500;
      double bonusPro = projectsCompleted * 1000;
      return baseSalary + bonusEx + bonusPro;
   }

   @Override
   public String toString() {
      return "Developer[name=" + name + ",id=" + id + ",baseSalary=" + baseSalary
            + ",yearsOfExperience=" + yearsOfExperience
            + ",programmingLanguage=" + programmingLanguage
            + ",projectsCompleted=" + projectsCompleted + "]";
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
      Developer other = (Developer) obj;
      if (projectsCompleted != other.projectsCompleted) {
         return false;
      }
      if (programmingLanguage == null) {
         if (other.programmingLanguage != null) {
            return false;
         }
      } else if (!programmingLanguage.equals(other.programmingLanguage)) {
         return false;
      }
      return true;
   }

}
