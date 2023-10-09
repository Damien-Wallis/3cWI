package at.dam.units;

import java.util.Random;

public class While {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;

        int sum = 0;
        while (!isFinished) {
            int randomNumber = random.nextInt(10, 30);
            sum = sum + randomNumber;

            if (randomNumber == 15 || randomNumber == 25) {
                isFinished = true;
            }
        }
        System.out.println(sum);
    }
}
