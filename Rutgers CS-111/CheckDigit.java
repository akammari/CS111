public class CheckDigit {
    public static void main (String [] args) {

        long num = Long.parseLong(args[0]);
        long temp = num;
        long temp1 = num/10;
        long sum = 0;
        long sum1 = 0;

        while (temp != 0){
            long a = temp%10;
            sum += a;
            temp = temp/10;
            temp = temp/10;
        }

        long ones = sum%10;

        while (temp1 != 0){
            long a = temp1%10;
            sum1 += a;
            temp1 = temp1/10;
            temp1 = temp1/10;
        }

        long ones1 = sum1%10;

        long ones2 = (ones1*3)%10;

        long ans = (ones+ones2)%10;

        System.out.println(ans);
    }
    
}
