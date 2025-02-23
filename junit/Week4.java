
public class Week4 {

   /**
    * int max2Int(int a, int b)
    * 
    * @param a : so nguyen duong
    * @param b : so nguyen duong
    * @return : result
    */
   public static int max2Int(int a, int b) {
      // Tim gia tri lon nhat cua hai so nguyen

      return (a > b) ? a : b;
   }

   /**
    * minArray(int[] array)
    * int minArray(int[] array)
    * 
    * @param array : mang so nguyen
    * @return : result
    */
   public static int minArray(int[] array) {
      // Tim gia tri nho nhat cua 1 mang so nguyen
      int min = array[0];
      for (int i = 1; i < array.length; i++) {
         if (array[i] < min) {
            min = array[i];
         }
      }
      return min;
   }

   /**
    * calculateBMI(double weight, double height)
    * 
    * @param weight : can nang cua nguoi
    * @param height : chieu cao cua nguoi
    * @return : result
    */
   public static String calculateBMI(double weight, double height) {
      // Tinh BMI
      double bmi = weight / (height * height);
      bmi = Math.round(bmi * 10.0) / 10.0;
      if (bmi < 18.5) {
         return "Thiếu cân";
      } else if (bmi >= 18.5 && bmi < 22.9) {
         return "Bình thường";
      } else if (bmi >= 23 && bmi <= 24.9) {
         return "Thừa cân";
      } else {
         return "Béo phì";
      }
   }

}
