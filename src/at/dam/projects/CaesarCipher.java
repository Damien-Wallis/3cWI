package at.dam.projects;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        System.out.println("Welchen Text moechten Sie verschlüsseln?");
        String text = scanner.nextLine();

        String encryptedText = encrypt;
    }
    public static String encrypt(String string, int ){

        System.out.println("Verschlüsseltes Wort: " + encryptedText);
    }
}
