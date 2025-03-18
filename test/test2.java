package test;

public class test2 {

   public static class MyStack {
      private Object[] elements = new Object[100];
      private int length = 0;

      public void push(Object element) {
         elements[length++] = element;

      }
   }

   public static void main(String[] args) {
      
      MyStack stack = new MyStack();
      stack.push("1");
      stack.push(String.format("%.3f", 2.523523));
      // test1.Person person = new test1.Person(); 
   }
}
