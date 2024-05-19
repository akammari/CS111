public class BankAccounts {
    private double checking;
    private double savings;

    public static double account() {
        savings = 1000;
        checking = 0; 
    }

    public static double money(double moneyNeeded) {
        savings = savings - moneyNeeded;
        checking = checking + moneyNeeded;
    }

    public static void main (String [] args) {
        int x = Integer.parseInt(args[0]);
        money(x);
    }
}
