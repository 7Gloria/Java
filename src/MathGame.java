import java.util.Random;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1 = random.nextInt(10); 
        int num2 = random.nextInt(10);
        
        System.out.println("Welcome to the Math Game!");
        System.out.println("Please choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        
        int choice = scanner.nextInt();
        int result;
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.print("What is " + num1 + " + " + num2 + "? ");
                break;
            case 2:
                result = num1 - num2;
                System.out.print("What is " + num1 + " - " + num2 + "? ");
                break;
            case 3:
                result = num1 * num2;
                System.out.print("What is " + num1 + " * " + num2 + "? ");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                return;
        }
        
        int userAnswer = scanner.nextInt();
        
        if (userAnswer == result) {
            System.out.println("Correct! Well done.");
        } else {
            System.out.println("Incorrect. The correct answer is " + result + ".");
        }
    }
}