package student;

import java.util.*;

/**
 * The StudentManagement class provides methods to manage students.
 */
public class StudentManagement {

   private Student[] students = new Student[100];
   private int size = 0;

   /**
    * Adds a new student to the management system.
    *
    * @param newStudent the student to be added
    */
   public void addStudent(Student newStudent) {
      this.students[size] = newStudent;
      size++;
   }

   /**
    * Groups students by their group and returns the information as a string.
    *
    * @return a string containing students grouped by their group
    */
   public String studentsByGroup() {
      String result = "";
      Map<String, Integer> map = new HashMap<String, Integer>();
      for (int i = 0; i < size; i++) {
         if (map.get(students[i].getGroup()) == null) {
            map.put(students[i].getGroup(), 1);
            result += students[i].getGroup() + "\n";
            result += students[i].getInfo() + "\n";
            for (int j = i + 1; j < size; j++) {
               if (sameGroup(students[j], students[i])) {
                  result += students[j].getInfo() + "\n";
               }
            }
         } else {
            continue;
         }
      }
      return result;
   }

   /**
    * Removes a student from the management system by their ID.
    *
    * @param id the ID of the student to be removed
    */
   public void removeStudent(String id) {
      for (int i = 0; i < size; i++) {
         if (students[i].getId().equals(id)) {
            for (int j = i; j < size - 1; j++) {
               students[j] = students[j + 1];
            }
            size--;
            break;
         }
      }
   }

   /**
    * Checks if two students are in the same group.
    *
    * @param s1 the first student
    * @param s2 the second student
    * @return true if the students
    *         are in the same group, false otherwise
    */
   public static boolean sameGroup(Student s1, Student s2) {
      return s1
            .getGroup().equals(s2.getGroup());
   }

   /**
    * The main method to run the StudentManagement program.
    *
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      StudentManagement sm = new StudentManagement();
      Student s1 = new Student("Nguyen Van An", "17020001", "an@example.com");
      Student s2 = new Student("Le Thi B", "17020002", "b@example.com");
      Student s3 = new Student("Tran Van C", "17020003", "c@example.com");
      s2.setGroup("K62CC");
      sm.addStudent(s1);

      sm.addStudent(s2);

      sm.addStudent(s3);

      System.out.println(sm.studentsByGroup());
   }
}
