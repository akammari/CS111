public class inPlaceReverse {
    public static void main (String [] args) {

        int n = args.length;
        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(args[i]);
        }

        for (int x = arr.length; x > 0; x--){
            System.out.println(arr[x-1]);
        }
        
    }
}
