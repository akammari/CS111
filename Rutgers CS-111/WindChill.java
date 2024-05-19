public class WindChill {
    public static void main (String [] args) {
        double temp = Double.parseDouble(args[0]);

        double vel = Double.parseDouble(args[1]);

        double x = Math.pow(vel, 0.16);
        double wc = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * x;

        System.out.println("The wind chill is: " + wc);
    }
}
