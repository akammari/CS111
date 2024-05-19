public class matrix {
    public static void main (String [] args) {

        int c = StdIn.readInt();
        
        int[][] arr = {{1, 0, 1, 0}, {1, 1, 0, 1}, {1, 0, 0, 1}};

        for (int i = 0; i < arr.length; i++){
            StdOut.println(arr[i][c-1]);
        }
    }
}
