public class Person implements Comparable<Person> {

   protected String name;
   protected int age;
   protected String address;

   /**
    * Constructor.
    * 
    * @param name    name
    * @param age     age
    * @param address address
    */
   public Person(String name, int age, String address) {
      this.name = name;
      this.age = age;
      this.address = address;
   }

   public Person() {
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   @Override
   public int compareTo(Person other) {
      int nameCompare = this.name.compareTo(other.getName());
      return nameCompare != 0
            ? nameCompare
            : Integer.compare(this.age, other.getAge());
   }

}
