public class SimpleMathOperations {
    public static void main(String[] args) {
        
    	//find max of two nos.
        int maxNumber = Math.max(10, 20);
        System.out.println("Maximum of 10 and 20 is: " + maxNumber);

        // find min of two nos.
        int minNumber = Math.min(10, 20);
        System.out.println("Minimum of 10 and 20 is: " + minNumber);

        // sqrt
        double sqrtValue = Math.sqrt(25);
        System.out.println("Square root of 25 is: " + sqrtValue);

        // Rounding
        double roundValue = Math.round(3.7);
        System.out.println("Rounded value of 3.7 is: " + roundValue);

        // Generating a random number between 0 and 1
        double randomValue = Math.random();
        System.out.println("Random value between 0 and 1: " + randomValue);

        // Generating a random integer between a specified range
        int randomInt = (int) (Math.random() * 100); // Generates a random integer between 0 and 99
        System.out.println("Random integer between 0 and 99: " + randomInt);

        // pow
        double powerValue = Math.pow(2, 3); // 2 raised to the power of 3
        System.out.println("2 raised to the power of 3 is: " + powerValue);
    }
}
