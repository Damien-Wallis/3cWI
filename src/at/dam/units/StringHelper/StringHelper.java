package at.dam.units.StringHelper;

public class StringHelper {
    public static Boolean isPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }

        }
        return true;
    }

    /*public static int countLetters(String text, char character) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            
        }
        return count;
    }
     */
}


