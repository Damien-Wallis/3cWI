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

    public static int countLetters(String text, char letter) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter){
                count ++;
            }
        }
        return count;
    }

    public static String reverseString(String text) {
        String reverseString = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseString += text.charAt(i);
        }
        return reverseString;
    }
}


