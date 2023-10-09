package number_guessing_games;

import java.util.Random;

public class NumberGuessingGame {
    private int targetNumber;
    int attemptsLeft;

    public NumberGuessingGame(int min, int max, int maxAttempts) {
        this.attemptsLeft = maxAttempts;

        // Generate a random number between min and max 
        Random random = new Random();
        this.targetNumber = random.nextInt(max - min + 1) + min;
    }

    public boolean makeGuess(int guess) {

        if (guess == targetNumber) {
            System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
            return true;
        } else if (guess < targetNumber) {
            System.out.println("Try higher. Attempts left: " + attemptsLeft);
        } else {
            System.out.println("Try lower. Attempts left: " + attemptsLeft);
        }

        if (attemptsLeft == 0) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
        }

        return false;
    }
}

