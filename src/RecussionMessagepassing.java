
public class RecussionMessagepassing {

    static void passMessage(String[] queue, int currentIndex) {
        if (currentIndex == queue.length - 1) {
            System.out.println(queue[currentIndex] + " has the message and passes it to " + queue[0]);
            return;
        }

        System.out.println(queue[currentIndex] + " has the message and passes it to " + queue[currentIndex + 1]);
        passMessage(queue, currentIndex + 1);
    }

    public static void main(String[] args) {
        String[] queue = {"Person 1", "Person 2", "Person 3", "Person 4", "Person 5"};

        System.out.println("Initial Queue:");
        for (String person : queue) {
            System.out.println(person);
        }

        System.out.println("\nMessage Passing:");
        passMessage(queue, 0);
    }
}
