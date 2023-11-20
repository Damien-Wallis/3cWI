package at.dam.units.StringHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //User Input vom Text
        System.out.println("Geben Sie einen beliebigen Text ein: ");
        Scanner textScanner = new Scanner(System.in);
        String text = textScanner.nextLine();

        //User Input vom einzelnen Buchstaben
        System.out.println("Geben Sie einen Buchstaben ein, von dem Sie wissen möchten, wie oft er im Text vorkommt: ");
        Scanner charScanner = new Scanner(System.in);
        char letter = charScanner.next().charAt(0);

        //isPalindrome
        Boolean isPalindrome = StringHelper.isPalindrome(text);
        System.out.println("Ist der Text ein Palindrom? " + isPalindrome);

        //countLetters
        int countLetters = StringHelper.countLetters(text, letter);
        System.out.println("Anzahl des Buchstaben " + letter + " im Text: " + countLetters);

        /*
        //reverse String
        String reverseString = StringHelper.reverseString;
        System.out.println("Der Text rückwärts geschrieben lautet: " + reverseString);

        //printAmountOfLetters
        String letterAmount = StringHelper.letterAmount;
        System.out.println("Anzahl der einzelnen Buchstaben im Text: " + letterAmount);

         */

    }
}
