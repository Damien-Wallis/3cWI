package at.dam.units.StringHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Geben Sie einen beliebigen Text ein: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //isPalindrome
        Boolean isPalindrome = StringHelper.isPalindrome(text);
        System.out.println("Ist der Text ein Palindrom? " + isPalindrome);

        /*
        //countLetters
        int countLetters = StringHelper.countLetters(text);
        System.out.println("Anzahl der Buchstaben im Text " + countLetters);

        //reverse String
        String reverseString = StringHelper.reverseString;
        System.out.println("Der Text rückwärts geschrieben lautet: " + reverseString);

        //printAmountOfLetters
        String letterAmount = StringHelper.letterAmount;
        System.out.println("Anzahl der einzelnen Buchstaben im Text: " + letterAmount);

         */

    }
}
