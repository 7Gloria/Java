public class StringsExample 
{
    public static void main(String[] args) 
    {
        
        String greeting = "Hello, ";
        String name = "Gloria";

        // Concatenation
        String message = greeting + name;
        System.out.println(message); 

        
        int messageLength = message.length();
        System.out.println("Length of the message: " + messageLength); 

        // Accessing characters
        char firstChar = message.charAt(0);
        char lastChar = message.charAt(message.length() - 1);
        System.out.println("First character: " + firstChar); 
        System.out.println("Last character: " + lastChar); 

        // Substring
        String subString = message.substring(7);
        System.out.println("Substring from index 7: " + subString); 

       //isEqual
        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual); 

        // Conversion to uppercase and lowercase
        String upperCaseMessage = message.toUpperCase();
        String lowerCaseMessage = message.toLowerCase();
        System.out.println("Uppercase message: " + upperCaseMessage); 
        System.out.println("Lowercase message: " + lowerCaseMessage); 

        // Checking for substring
        String sentence = "Java is fun!";
        boolean containsJava = sentence.contains("Java");
        System.out.println("Does the sentence contain 'Java'? " + containsJava); 
        
        
        int indexOfIs = sentence.indexOf("is");
        System.out.println("Index of 'is': " + indexOfIs); 

        // Replace
        String newSentence = sentence.replace("fun", "awesome");
        System.out.println("New sentence: " + newSentence);  
    }
}
