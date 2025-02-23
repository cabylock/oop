import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Week4Test {

   @Test
   public void testMax2Int1() {
      assertEquals(3, Week4.max2Int(2, 3));
   }

   @Test
   public void testMax2Int2() {
      assertEquals(5, Week4.max2Int(4, 5));
   }

   @Test
   public void testMax2Int3() {
      assertEquals(5, Week4.max2Int(5, 5));
   }

   @Test
   public void testMax2Int4() {
      assertEquals(0, Week4.max2Int(0, 0));
   }

   @Test
   public void testMax2Int5() {
      assertEquals(0, Week4.max2Int(-1, 0));
   }

   @Test
   public void testMinArray1() {
      int[] array = { 1, 2, 3, 4, 5 };
      assertEquals(1, Week4.minArray(array));
   }

   @Test
   public void testMinArray2() {
      int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      assertEquals(1, Week4.minArray(array));
   }

   @Test
   public void testMinArray3() {
      int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
      assertEquals(0, Week4.minArray(array));
   }

   @Test
   public void testMinArray4() {
      int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, -1 };
      assertEquals(-1, Week4.minArray(array));
   }

   @Test
   public void testMinArray5() {
      int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -2 };
      assertEquals(-2, Week4.minArray(array));
   }

   @Test
   public void testCalculateBMI1() {
      assertEquals("Thiếu cân", Week4.calculateBMI(40, 1.6));
   }

   @Test
   public void testCalculateBMI2() {

      assertEquals("Thừa cân", Week4.calculateBMI(60, 1.6));
   }

   @Test
   public void testCalculateBMI3() {

      assertEquals("Béo phì", Week4.calculateBMI(70, 1.6));
   }

   @Test
   public void testCalculateBMI4() {
      assertEquals("Béo phì", Week4.calculateBMI(80, 1.6));
   }

   @Test
   public void testCalculateBMI5() {
      assertEquals("Thiếu cân", Week4.calculateBMI(45, 1.6));
   }

}
