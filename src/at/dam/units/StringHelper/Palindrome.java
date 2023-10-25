package at.dam.units.StringHelper;

public class Palindrome {
    public static Boolean palindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) == text.charAt(text.length() - i - 1)) {
                return true;
            }

        }return false;
    }

}
