public class test3 {
   interface i1 {
      void f();

      public int x = 3;
   }
   
   interface i2
   {
      int f(int x );
   }

   interface i3 {
      int f();
   }

   public static class c1 {
      public int f() {
         return 1;
      }
   }
   
   public static class c2 implements i1, i2 {
      public void f() {
      };

      public int f(int i) {
         return 1;
      }
   }

   public static class c3 extends c1 implements i2 {

      public int f(int i) {
         return 1;
      }
   }


   
   public static class c4 extends c3 implements i3 {
      public int f() {
         return 1;
      }
   }

   public class c5 extends c1  {
      public int f() {
         return 2; 
      };
   }

   interface i4 extends i1, i3 {
      
   }


}
