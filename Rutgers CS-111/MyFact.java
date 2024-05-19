public class MyFact {
    public static void main (String [] args) {
        int n = Integer.parseInt(args [0]);
        int count = n;
        int fact = 1;

        while (count > 0){
            fact = fact*count;
            count--;
        }
        System.out.println(fact);
    }
}
