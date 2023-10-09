package at.dam.units;

import java.util.Random;

public class IfBedingungen2 {
    public static void main(String[] args) {

        // Erstelle zwei Zufallszahlen zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"
        if (randomNumber < randomNumber2 && randomNumber < 50) {
            System.out.println(randomNumber + " ist kleiner als " + randomNumber2 + " und Mini");
        }

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        // dann gib aus "Eine der beiden ist kleiner als 30"
        else if (randomNumber < 30 || randomNumber2 < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");
        }

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        // dann gib aus "Erste Zahl klein, zweite kein 50er"
        else if (randomNumber < 50 && randomNumber2 != 50) {
            System.out.println("Erste Zahl klein, zweite Zahl kein 50er");
        }
    }
}
