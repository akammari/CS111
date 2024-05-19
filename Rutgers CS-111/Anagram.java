public class Anagram {
    
    public static boolean Anagram(String x, String y) {
        if (x.length() != y.length()) {
            return false;
        }

        for (int i = 0; i < x.length(); i++) {
            char letter = x.charAt(i);
            int index = y.indexOf(letter);

            if (index == -1) {
                return false;
            }
            else  {
                String before = y.substring(0, index);
                String after = y.substring (index+1);
                y = before + after;
            }
        }

        return true;
    }
}
