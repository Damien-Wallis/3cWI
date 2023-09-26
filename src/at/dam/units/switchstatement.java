package at.dam.units;

import java.util.Random;

public class switchstatement {
    public static void main(String[] args) {

        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNumber = random.nextInt(5,11);

        switch (randomNumber) {
            case 10 -> System.out.println("Ten");
            case 9 -> System.out.println("Nine");
            case 8 -> System.out.println("Eight");
            case 7 -> System.out.println("Seven");
            case 6 -> System.out.println("Six");
            case 5 -> System.out.println("Five");
        }
    }
}
