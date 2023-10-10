package at.dam.units;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        boolean diceGameIsFinished = false;
        Random playerRandom = new Random();
        Random computerRandom = new Random();
        Scanner scanner = new Scanner(System.in);

        //Regeln
        System.out.println("Sie und der Computer wuerfeln 6 Mal.");
        System.out.println("Wer am meisten Punkte hat, gewinnt!");
        System.out.println("Geben Sie 1 ein, um zu wuerfeln.");

        while(!diceGameIsFinished){
            int playerScore = 0;
            int computerScore = 0;

            for (int throwCounter = 0; throwCounter < 6; throwCounter++){
                int selection = scanner.nextInt();

                if (selection == 1){
                    int playerThrow = playerRandom.nextInt(1, 7);
                    int computerThrow = computerRandom.nextInt(1,7);

                    playerScore += playerThrow;
                    computerScore += computerThrow;

                    System.out.println("Sie haben eine " + playerThrow  + " gewuerfelt.");
                    System.out.println("Sie haben insgesamt " + playerScore + " Punkte.");
                    System.out.println("");
                    System.out.println("Der Computer hat eine " + computerThrow  + " gewuerfelt.");
                    System.out.println("Der Computer hat insgesamt " + computerScore + " Punkte.");
                }
            }

        }
    }
}
