public class FindDuplicate {
   public static void main (String [] args) {

            int n = args.length;
            int[] arr = new int[n];
      
            for (int i = 0; i<n; i++){
                arr[i] = Integer.parseInt(args[i]);
            }

            for (int x = 0; x < n - 1; x++){
                for (int a = x + 1; a < n; a++){
                    if (arr[a] == arr[x]){
                        StdOut.println("true");
                        return;
                    }
            }
        }
        StdOut.println("false");
   }
}
