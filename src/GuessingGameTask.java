import java.util.*;
import java.util.Random;
public class GuessingGameTask 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int max_range = 100;
        int secretno = random.nextInt(max_range);
        int attempts = 0;
        boolean guessed = false;
        int[] array = new int[6];
        int myguess=0;

        System.out.println("Welcome to the guessing Game..!");
        System.out.println("I've selected a number between 1 and " + max_range + ". Try to guess it.");
          while (!guessed) 
          { 
            System.out.println("Enter your guess:");
             myguess = scanner.nextInt();
            array[attempts] = myguess; 
            attempts++;
  if (myguess==secretno) 
  {
     guessed = true;
            } 
  else if (myguess>secretno) 
            {
                System.out.println("Too high... Try again!!!");
            } 
  else {
                System.out.println("Too low... Try again!!!");
            }
        
  if(attempts > 6)
  {
	  System.out.println("Maximum attempts exceeded");
	  break;
  }
          }
  if (guessed) {
            System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            

            for (int i=0; i<array.length; i++) 
            {
            	int temp=0;
                for (int j=i+1; j<array.length; j++) 
                {
                    if (array[i] > array[j]) 
                    {
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
                System.out.println(array[i]);
                
           }  
   for(int i=0;i<array.length;i++) 
      {
            if(array[i]==myguess)
          {
             System.out.println("The Guessed number " + myguess + " is present at the location " + i);
          }
        
       }
            scanner.close();
    }
 
  }
}
