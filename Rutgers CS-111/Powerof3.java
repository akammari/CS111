public class Powerof3 {
    public static boolean isPower3 (int n) {
        if (n ==0) return false; 
        while (n != 1) {
            if (n % 3 != 0) return false; 
            n = n/3;
        }
        return true;
    }

    public static void main (String [] args) {

        int a = Integer.parseInt(args[0]);

        System.out.println(Powerof3.isPower3(a));
            
        
    }

}

