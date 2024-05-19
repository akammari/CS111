public class LargestOfFive {
    public static void main (String [] args) {
        
        int a = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args [1]);
        int c = Integer.parseInt(args [2]);
        int d = Integer.parseInt(args [3]);
        int e = Integer.parseInt(args [4]);

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max){
            max = d;
        }
        if (e > max){
            max = e;
        }

        System.out.println(max);
    }
}
