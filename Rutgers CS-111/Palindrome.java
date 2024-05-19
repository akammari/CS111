public class Palindrome {

    public static boolean Palindrome (String s) {
        String s1 = "";

        for (int i = s.length()-1; i >= 0; i--) {
            s1 += s.charAt(i);
        }

        if (s.equals(s1)) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main (String [] args) {
        System.out.println(Palindrome("otto"));
    }

}
