public class scrap {
    

    public static double calc(int a, double b) {
        int result = calc(45, 9.0);
        return 1;
    }
    public static void main (String [] args) {
        double sum = 0;
        int count = 0;

        for (int i = 200000; i > 0; i--) {
            if (i%17 == 0) {
                sum += i;
                count++;
            }
        }
        double average = sum/count;
        System.out.println("The average is " + average);

    }
}