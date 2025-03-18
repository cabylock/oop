public class Point {
   private double pointX;
   private double pointY;

   public Point(double pointX, double pointY) {
      this.pointX = pointX;
      this.pointY = pointY;
   }

   public double getPointX() {
      return pointX;
   }

   public void setPointX(double pointX) {
      this.pointX = pointX;
   }

   public double getPointY() {
      return pointY;
   }

   public void setPointY(double pointY) {
      this.pointY = pointY;
   }

   public double distance(Point point) {
      return Math.sqrt(Math.pow(pointX - point.getPointX(), 2)
            + Math.pow(pointY - point.getPointY(), 2));
   }

   /**
    * Check if two points are equal.
    * 
    * 
    * @return true if two points are equal, false otherwise
    */
   public boolean equals(Object obj) {
      if (this == obj) {
         return false;
      }
      if (obj == null) {

         return false;
      }
      if (getClass() != obj.getClass()) {

         return false;
      }
      Point other = (Point) obj;
      return Math.abs(pointX - other.pointX) < 0.001 && Math.abs(pointY - other.pointY) < 0.001;
   }

   public int hashCode() {
      return (int) (pointX + pointY);
   }

   public String toString() {
      return String.format("(%.1f,%.1f)", this.pointX, this.pointY);
   }

}
