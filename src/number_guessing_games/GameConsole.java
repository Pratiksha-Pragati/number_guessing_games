package number_guessing_games;

import java.util.Scanner;

public class GameConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set the range and maximum attempts
        int min = 1;
        int max = 100;
        int maxAttempts = 10;

        NumberGuessingGame game = new NumberGuessingGame(min, max, maxAttempts);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + min + " and " + max + ". Can you guess it?");

        while (game.attemptsLeft > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (game.makeGuess(guess)) {
                break; // Exit the loop if the guess is correct
            }
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
