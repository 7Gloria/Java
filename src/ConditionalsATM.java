import java.util.Scanner;

public class ConditionalsATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int balance = 1000;

        System.out.println("Welcome to the ATM!");

        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        
        if (pin == 1234) {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is $" + balance);
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();

                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds. Transaction canceled.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn $" + withdrawAmount + ". Remaining balance: $" + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = scanner.nextInt();

                    if (depositAmount <= 0) {
                        System.out.println("Invalid amount. Transaction canceled.");
                    } else {
                        balance += depositAmount;
                        System.out.println("Deposited $" + depositAmount + ". New balance: $" + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } else {
            System.out.println("Invalid PIN. Access denied.");
        }
    }
}
