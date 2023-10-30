import java.util.Scanner;

public class ArraysFruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes"};
        double[] prices = {1.0, 0.5, 0.8, 2.0};

        System.out.println("Welcome to the Fruit Shop!");

        
        System.out.println("Available Fruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i + 1 + ". " + fruits[i] + " - $" + prices[i]);
        }

        
        System.out.print("Enter the number of the fruit you want to buy: ");
        int choice = scanner.nextInt();


        if (choice >= 1 && choice <= fruits.length) {
            int selectedFruitIndex = choice - 1;
            System.out.print("Enter the quantity you want to buy: ");
            int quantity = scanner.nextInt();

            
            double totalCost = prices[selectedFruitIndex] * quantity;

            System.out.println("You have selected: " + fruits[selectedFruitIndex]);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: $" + totalCost);
        } else {
            System.out.println("Invalid choice. Please select a valid fruit.");
        }
    }
}
