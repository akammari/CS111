public class MultTable {
    
    public static int printTable (int tab) {
        for (int i = 1; i <= tab; i++){
            for (int j = 1; j <= tab; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println("\n");
        }
        return tab;

    }

    public static void main (String [] args) {
        int a = Integer.parseInt(args[0]);

        MultTable.printTable(a);
    }
}
