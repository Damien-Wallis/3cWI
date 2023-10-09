package at.dam.units;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        boolean isFinished = false;
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        System.out.println("Selektieren Sie die gewünschte Funktion:");
        System.out.println("    1. Einzahlen");
        System.out.println("    2. Abheben");
        System.out.println("    3. Kontostand");
        System.out.println("    4. Ende");

        while (!isFinished) {

            int selection = scanner.nextInt();

            //Einzahlen
            if (selection == 1) {
                System.out.println("Geben Sie den Betrag ein, den Sie einzahlen möchten: ");
                selection = scanner.nextInt();

                balance = balance + selection;
                System.out.println("Sie haben " + selection + " Euro eingezahlt!");
            }

            //Abheben
            else if (selection == 2) {
                System.out.println("Geben Sie den Betrag ein, den Sie abheben möchten");
                selection = scanner.nextInt();

                balance = balance - selection;
                System.out.println("Sie haben " + selection + " Euro abgehoben!");
            }

            //Kontostand
            else if (selection == 3) {
                System.out.println("Der Kontostand beträgt: " + balance + " Euro!");
            }

            //Beenden
            else if (selection == 4) {
                isFinished = true;
                System.out.println("Maschine gestoppt");
            }
        }
        scanner.close();
    }
}
