//DiceRoll
import java.util.Random;
public class Forloop {
    public static void main(String[] args) {
        int numRolls = 50; // Number of times to roll the dice
        int[] frequencies = new int[6]; // Array to store frequency of each face

        Random random = new Random();

        for (int i = 0; i < numRolls; i++) {
            int rollResult = random.nextInt(6) + 1; // Simulate a dice roll (1 to 6)

            // Increment the frequency counter for the corresponding face
            frequencies[rollResult - 1]++;
        }

        System.out.println("Dice Roll Frequencies:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Face " + (i + 1) + ": " + frequencies[i] + " times");
        }
    }
}
