public class BooleanTrendingTopics {
    public static void main(String[] args) {
        
        int numberOfTweets = 1500;
        int numberOfRetweets = 2000;
        int numberOfLikes = 3000;

        // Determine if the topic is trending
        boolean isTrending = numberOfTweets > 1000 && numberOfRetweets > 1500 && numberOfLikes > 2000;

        if (isTrending) {
            System.out.println("This topic is currently trending!");
        } else {
            System.out.println("This topic is not trending right now.");
        }
    }
}
