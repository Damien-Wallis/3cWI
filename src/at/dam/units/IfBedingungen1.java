package at.dam.units;

import java.util.Random;

public class IfBedingungen1 {
    public static void main(String[] args) {

        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        // Gib die Zufallszahl aus
        System.out.print(randomNumber);

        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        if (randomNumber < 20) {
            System.out.print(" Mini");
        }

        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium
        else if (randomNumber > 20 && randomNumber < 50) {
            System.out.print(" Medium");
        }

        // Wenn die Zahl größer als 50 ist gib aus "Large
        else if (randomNumber > 50) {
            System.out.print(" Large");
        }
    }
}