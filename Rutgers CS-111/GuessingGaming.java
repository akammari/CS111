public class GuessingGaming {
    public static void main (String [] args) {
        int r = (int)(Math.random()*1001);
        int n = StdIn.readInt();
        
        while (n != r){
             
            if (n > r){
                StdOut.println("Your guess is too high.");
                n = StdIn.readInt();
            }

            else if (n < r){
                StdOut.println("Your guess is too low.");
                n = StdIn.readInt();
            }

            else {
                StdOut.println("You win.");
            }
        }
    }
}
