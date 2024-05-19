public class PolygonTransform {

    // Returns a new array object that is an exact copy of the given array. 
   // The given array is not mutated. 
   public static double[] copy(double[] array) {
       double[] arr = new double[array.length];
       for (int i = 0; i < array.length; i++) {
           arr[i] = array[i];
       }
       return arr;
   }
    
   // Scales the polygon by the factor alpha. 
   public static void scale(double[] x, double[] y, double alpha) {
       for (int i = 0; i < x.length; i++) {
           x[i] = x[i] * alpha;
       }

       for (int i = 0; i < y.length; i++) {
           y[i] = y[i] * alpha;
       }
   }

   // Translates the polygon by (dx, dy). 
   public static void translate(double[] x, double[] y, double dx, double dy) {
       for (int i = 0; i < x.length; i++) {
        x[i] = x[i] + dx;
       }

       for (int i = 0; i < y.length; i++) {
        y[i] = y[i] + dy;
       }
   }
    
   // Rotates the polygon theta degrees counterclockwise, about the origin. 
   public static void rotate(double[] x, double[] y, double theta) {
       double x1 = 0;
       double y1 = 0;

       for (int i = 0; i < x.length; i++) {
           x1 = x[i];
           y1 = y[i];
           x[i] = (x1*Math.cos(Math.toRadians(theta))) - (y1*Math.sin(Math.toRadians(theta)));
           y[i] = (y1*Math.cos(Math.toRadians(theta))) - (x1*Math.sin(Math.toRadians(theta)));
       }
   }
   // Tests each of the API methods by directly calling them. 
   public static void main(String[] args) {
    
   } 
}
