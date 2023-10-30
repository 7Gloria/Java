//Rocket Launch
public class Whileloop {
    public static void main(String[] args) {
        int countdown = 10; // Initial countdown value

        System.out.println("Initializing rocket launch sequence...");

        while (countdown > 0) {
            System.out.println("T-" + countdown + " seconds");
            countdown--;

            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Blast off!");
    }
}
