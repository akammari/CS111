public class RecursiveTriangle {
    
    public static int pyramid (int nStars) {
        if (nStars == 0) {
            return;
        }
        pyramid(nStars-1);
        printRow(nStars);
    }

    public static int upsideDownPyramid (int nStars) {
        if (nStars == 0) {
            return;
        }
        printRow(nStars);
        upsideDownPyramid(nStars-1);
    }

    public static void printRow (int nStars) {
        if (nStars == 0) {
            System.out.println();
        }
        System.out.println("*");
        printRow(nStars - 1);
    }

    public static void main (String [] args) {
        int x = Integer.parseInt(args[0]);
        pyramid(x);
    }
}

