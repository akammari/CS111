public class BigO {

    public static int sequentialSearch (int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Your number is equal to digit " + i + " in the array.");
                return i;
            }
        }
        return -1;
    }
    public static void main (String [] args) {
        /*String[] arr = {"1:00", "recitation", "wednesdays"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        */
        int[] arr = {15, 2, 8, 1, 17, 5};
        int x = Integer.parseInt(args[0]);
        sequentialSearch(arr, x);
    }
}
