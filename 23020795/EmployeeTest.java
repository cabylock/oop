import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class EmployeeTest {

      @Test
      public void testDeveloperConstructorAndGetters() {
            Developer developer = new Developer();
            Assert.assertNotNull("res: default constructor", developer);

            developer = new Developer("John Smith", "DEV001", 50000, 5, "Java", 10);
            Assert.assertEquals("res: name", "John Smith", developer.getName());
            Assert.assertEquals("res: id", "DEV001", developer.getId());
            Assert.assertEquals("res: base salary", 50000, developer.getBaseSalary(), 0.001);
            Assert.assertEquals("res: experience", 5, developer.getYearsOfExperience());
            Assert.assertEquals("res: language", "Java", developer.getProgrammingLanguage());
            Assert.assertEquals("res: projects", 10, developer.getProjectsCompleted());
      }

      @Test
      public void testManagerConstructorAndGetters() {
            Manager manager = new Manager();
            Assert.assertNotNull("res: default constructor", manager);

            manager = new Manager("Jane Doe", "MGR001", 70000, 8, 15, "Engineering");
            Assert.assertEquals("res: name", "Jane Doe", manager.getName());
            Assert.assertEquals("res: id", "MGR001", manager.getId());
            Assert.assertEquals("res: base salary", 70000, manager.getBaseSalary(), 0.001);
            Assert.assertEquals("res: experience", 8, manager.getYearsOfExperience());
            Assert.assertEquals("res: team size", 15, manager.getTeamSize());
            Assert.assertEquals("res: department", "Engineering", manager.getDepartment());
      }

      @Test
      public void testDeveloperSetters() {
            Developer developer = new Developer();
            developer.setName("Alice Johnson");
            developer.setId("DEV002");
            developer.setBaseSalary(55000);
            developer.setYearsOfExperience(3);
            developer.setProgrammingLanguage("Python");
            developer.setProjectsCompleted(7);

            Assert.assertEquals("res: name", "Alice Johnson", developer.getName());
            Assert.assertEquals("res: id", "DEV002", developer.getId());
            Assert.assertEquals("res: base salary", 55000, developer.getBaseSalary(), 0.001);
            Assert.assertEquals("res: experience", 3, developer.getYearsOfExperience());
            Assert.assertEquals("res: language", "Python", developer.getProgrammingLanguage());
            Assert.assertEquals("res: projects", 7, developer.getProjectsCompleted());
      }

      @Test
      public void testManagerSetters() {
            Manager manager = new Manager();
            manager.setName("Bob Wilson");
            manager.setId("MGR002");
            manager.setBaseSalary(75000);
            manager.setYearsOfExperience(10);
            manager.setTeamSize(20);
            manager.setDepartment("Marketing");

            Assert.assertEquals("res: name", "Bob Wilson", manager.getName());
            Assert.assertEquals("res: id", "MGR002", manager.getId());
            Assert.assertEquals("res: base salary", 75000, manager.getBaseSalary(), 0.001);
            Assert.assertEquals("res: experience", 10, manager.getYearsOfExperience());
            Assert.assertEquals("res: team size", 20, manager.getTeamSize());
            Assert.assertEquals("res: department", "Marketing", manager.getDepartment());
      }

      @Test
      public void testDeveloperToStringAndGetInfo() {
            Developer developer = new Developer("John Smith", "DEV001", 50000, 5, "Java", 10);
            Assert.assertEquals("res: getInfo", "Developer(John Smith - DEV001) - Java, 10 projects",
                        developer.getInfo());
            Assert.assertEquals("res: toString",
                        "Developer[name=John Smith,id=DEV001,baseSalary=50000.0,yearsOfExperience=5,programmingLanguage=Java,projectsCompleted=10]",
                        developer.toString());
      }

      @Test
      public void testManagerToStringAndGetInfo() {
            Manager manager = new Manager("Jane Doe", "MGR001", 70000, 8, 15, "Engineering");
            Assert.assertEquals("res: getInfo", "Manager(Jane Doe - MGR001) - Engineering Department, Team of 15",
                        manager.getInfo());
            Assert.assertEquals("res: toString",
                        "Manager[name=Jane Doe,id=MGR001,baseSalary=70000.0,yearsOfExperience=8,teamSize=15,department=Engineering]",
                        manager.toString());
      }

      @Test
      public void testDeveloperCalculateSalary() {
            Developer developer = new Developer("John Smith", "DEV001", 50000, 5, "Java", 10);
            double expectedSalary = 50000 + (5 * 500) + (10 * 1000); // base + experience bonus + project bonus
            Assert.assertEquals("res: salary calculation", expectedSalary, developer.calculateSalary(), 0.001);
      }

      @Test
      public void testManagerCalculateSalary() {
            Manager manager = new Manager("Jane Doe", "MGR001", 70000, 8, 15, "Engineering");
            double expectedSalary = 70000 + (8 * 1000) + (15 * 200); // base + experience bonus + team size bonus
            Assert.assertEquals("res: salary calculation", expectedSalary, manager.calculateSalary(), 0.001);
      }

      @Test
      public void testEquals() {
            Developer dev1 = new Developer("John Smith", "DEV001", 50000, 5, "Java", 10);
            Developer dev2 = new Developer("John Smith", "DEV001", 50000, 5, "Java", 10);
            Developer dev3 = new Developer("Alice Johnson", "DEV002", 55000, 3, "Python", 7);

            Assert.assertTrue("res: equal developers", dev1.equals(dev2));
            Assert.assertFalse("res: different developers", dev1.equals(dev3));

            Manager mgr1 = new Manager("Jane Doe", "MGR001", 70000, 8, 15, "Engineering");
            Manager mgr2 = new Manager("Jane Doe", "MGR001", 70000, 8, 15, "Engineering");
            Manager mgr3 = new Manager("Bob Wilson", "MGR002", 75000, 10, 20, "Marketing");

            Assert.assertTrue("res: equal managers", mgr1.equals(mgr2));
            Assert.assertFalse("res: different managers", mgr1.equals(mgr3));
      }

      @Test
      public void testCompanyBasicOperations() {
            Company company = new Company();
            Developer developer = new Developer("John Smith", "DEV001", 50000, 5, "Java", 10);

            company.addEmployee(developer);
            Assert.assertEquals("res: add employee", developer.calculateSalary(), company.getTotalSalary(), 0.001);

            company.removeEmployee(developer);
            Assert.assertEquals("res: remove employee", 0.0, company.getTotalSalary(), 0.001);

            Developer nonExistingDev = new Developer("Alice Johnson", "DEV002", 55000, 3, "Python", 7);
            company.removeEmployee(nonExistingDev);
            Assert.assertEquals("res: remove non-existing", 0.0, company.getTotalSalary(), 0.001);
      }

      @Test
      public void testCompanyGetInfo() {
            Company company = new Company();
            Developer dev = new Developer("John Smith", "DEV001", 50000, 5, "Java", 10);
            Manager mgr = new Manager("Jane Doe", "MGR001", 70000, 8, 15, "Engineering");

            company.addEmployee(dev);
            company.addEmployee(mgr);

            String expectedInfo = "Company Employees:\n" +
                        "Developer(John Smith - DEV001) - Java, 10 projects\n" +
                        "Manager(Jane Doe - MGR001) - Engineering Department, Team of 15\n";

            Assert.assertEquals("res: company info", expectedInfo, company.getInfo());
      }

      @Test
      public void testCompanyGetEmployeeByDepartment() {
            Company company = new Company();
            Manager mgr1 = new Manager("Jane Doe", "MGR001", 70000, 8, 15, "Engineering");
            Manager mgr2 = new Manager("Bob Wilson", "MGR002", 75000, 10, 20, "Marketing");
            Manager mgr3 = new Manager("Carol Taylor", "MGR003", 72000, 9, 12, "Engineering");
            Developer dev = new Developer("John Smith", "DEV001", 50000, 5, "Java", 10);

            company.addEmployee(mgr1);
            company.addEmployee(mgr2);
            company.addEmployee(mgr3);
            company.addEmployee(dev);

            List<Employee> engineeringEmployees = company.getEmployeeByDepartmet("Engineering");
            Assert.assertEquals("res: engineering count", 2, engineeringEmployees.size());
            Assert.assertTrue("res: contains Jane",
                        engineeringEmployees.stream().anyMatch(e -> e.getName().equals("Jane Doe")));
            Assert.assertTrue("res: contains Carol",
                        engineeringEmployees.stream().anyMatch(e -> e.getName().equals("Carol Taylor")));

            List<Employee> marketingEmployees = company.getEmployeeByDepartmet("Marketing");
            Assert.assertEquals("res: marketing count", 1, marketingEmployees.size());
            Assert.assertTrue("res: contains Bob",
                        marketingEmployees.stream().anyMatch(e -> e.getName().equals("Bob Wilson")));
      }

      @Test
      public void testCompanyGetTotalSalary() {
            Company company = new Company();
            Developer dev = new Developer("John Smith", "DEV001", 50000, 5, "Java", 10);
            Manager mgr = new Manager("Jane Doe", "MGR001", 70000, 8, 15, "Engineering");

            company.addEmployee(dev);
            company.addEmployee(mgr);

            double expectedTotal = dev.calculateSalary() + mgr.calculateSalary();
            Assert.assertEquals("res: total salary", expectedTotal, company.getTotalSalary(), 0.001);
      }
}
