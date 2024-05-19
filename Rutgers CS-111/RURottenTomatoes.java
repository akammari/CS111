public class RURottenTomatoes {
    public static void main (String [] args){

        int row = Integer.valueOf(args[0]);
        int column = Integer.valueOf(args[1]);

        int x = 0;
        int y = 0;

        int arr[][] = new int [row][column];

        int z = 2;
        for (int a = 0; a < row; a++){
            for (int b = 0; b < column; b++){
                arr[a][b] = Integer.valueOf(args[z]);
                z++;
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                x = x + arr[j][i];
            }
            if (x > max) {
                max = x;
                y = i;
            }
            x = 0;
        }

         StdOut.println(y);

    }
}
