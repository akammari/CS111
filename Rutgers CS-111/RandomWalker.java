public class RandomWalker {
    public static void main (String [] args) {

        int numSteps = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;

        System.out.println("(" + x + ", " + y + ")");

        for (int i = 0; i < numSteps; i++){
            int step = (int)(Math.random()*4) + 1;

            if (step == 1) {
                x++;
            }
            else if (step == 2) {
                y++;
            }
            else if (step == 3) {
                x--;
            }
            else if (step == 4) {
                y--;
            }
            System.out.println("(" + x + ", " + y + ")");
        }

        double xsq = (int)(Math.pow(x, 2));
        double ysq = (int)(Math.pow(y, 2));
        double ans = xsq + ysq;

        System.out.println("squared distance: " + ans);
    }
}
