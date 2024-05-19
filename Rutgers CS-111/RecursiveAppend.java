/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Akshaj Kammari AK1990
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if (n == 0) {
            return original;
        }
        else {
            return appendNTimes(original, n - 1) + original;
        }

	// WRITE YOUR CODE HERE 
    }

    public static void main (String[] args) {
        System.out.println(appendNTimes("cat", 3));

	// WRITE TEST CASES HERE to test your method
    }
}
