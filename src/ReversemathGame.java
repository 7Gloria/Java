import java.util.Random;
import java.util.Scanner;

public class ReversemathGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1 = random.nextInt(10); 
        int num2 = random.nextInt(10);
        int result = num1 + num2;
        
        System.out.println("Welcome to the Reverse Math Game!");
        System.out.println("You are given the result of the addition.");
        System.out.println("Guess the two numbers that were added together.");
        System.out.println("Result: " + result);
        
        System.out.print("Enter your first guess: ");
        int guess1 = scanner.nextInt();
        
        System.out.print("Enter your second guess: ");
        int guess2 = scanner.nextInt();
        
        if (guess1 == num1 && guess2 == num2) {
            System.out.println("Correct! Well done.");
        } else if (guess1 == num2 && guess2 == num1) {
            System.out.println("Correct! Well done.");
        } else {
            System.out.println("Incorrect. The correct numbers are " + num1 + " and " + num2 + ".");
        }
    }
}

