//Operators
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxRange = 100; 
        int secretNumber = random.nextInt(maxRange) + 1; 
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I've selected a number between 1 and " + maxRange + ". Try to guess it.");

        while (!guessed) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                guessed = true;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
    }
}