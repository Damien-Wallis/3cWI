package at.dam.projects;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int offset = 2;
        System.out.println("Welchen Text moechten Sie verschlüsseln?");
        String text = scanner.nextLine();
        System.out.println("Zu verschlüsselnder Text: " + text);

        String encryptedText = CaesarCipher.encrypt(text, offset);
        System.out.println("Verschlüsselter Text: " + encryptedText);

        String decryptedText = CaesarCipher.decrypt(encryptedText, offset);
        System.out.println("Entschlüsselter Text: " + decryptedText);
    }

    //Encrypt Funktion
    public static String encrypt(String text, int offset) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char encryptedC = (char) (c + offset);
            encryptedText.append(encryptedC);
        }
        return encryptedText.toString();
    }

    public static String decrypt(String text, int offset) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char decryptedC = (char) (c - offset);
            decryptedText.append(decryptedC);
        }
        return decryptedText.toString();
    }
}