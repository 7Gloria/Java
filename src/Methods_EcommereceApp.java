import java.util.Scanner;

public class Methods_EcommereceApp {

	    static String[] products = {"Product A", "Product B", "Product C"};
	    static double[] prices = {10.0, 20.0, 30.0};
	    static double cartTotal = 0.0;

	    static void displayProducts() {
	        for (int i = 0; i < products.length; i++) {
	            System.out.println(i + 1 + ". " + products[i] + " - $" + prices[i]);
	        }
	    }

	    static void addToCart(int productIndex, int quantity) {
	        cartTotal += prices[productIndex] * quantity;
	        System.out.println(quantity + " " + products[productIndex] + "(s) added to the cart.");
	    }

	    static void displayCartTotal() {
	        System.out.println("Cart Total: $" + cartTotal);
	    }

	    static void processPayment(double paymentAmount) {
	        if (paymentAmount >= cartTotal) {
	            double change = paymentAmount - cartTotal;
	            System.out.println("Payment successful! Change: $" + change);
	            cartTotal = 0.0;
	        } else {
	            System.out.println("Insufficient payment. Please try again.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Welcome to the E-Commerce App!");

	        displayProducts();

	        addToCart(0, 2); 
	        addToCart(1, 1); 

	        displayCartTotal();

	        System.out.print("Enter payment amount: $");
	        double paymentAmount = scanner.nextDouble();
	        processPayment(paymentAmount);
	    }
	}
