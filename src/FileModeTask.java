import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Task2 
{
	public static void main(String[] args) 
	{
		try {
	           File fc = new File("Gloria.html");
	           if (fc.createNewFile()) 
	           {
	               System.out.println("File created:" + fc.getName());
	           } else 
	           {
	               System.out.println("File already exists.");
	           }

	      FileWriter fw = new FileWriter("Gloria.html");
	      fw.write("Hello...");
	          
	      System.out.println("Successfully wrote to the file");
	      StringBuilder link = new StringBuilder();
	      link.append("<a href=\"https://github.com/7Gloria/Java/blob/master/src/GuessingGameTask.java\">Click here for the GuessingGame source code</a>");

	      fw.write(link.toString());
	      fw.close();
	          
	          
	          
	          if (fc.canRead()) 
	          {
	              System.out.println("File is readable.");
	          } 
	          else 
	          {
	              System.out.println("File is not readable.");
	          }
	          
	          
	          if (fc.canWrite()) 
	          {
	              System.out.println("File is writable.");
	          } 
	          else 
	          {
	              System.out.println("File is not writable.");
	          }
	         
 }
	          
	          
	          
	          catch (IOException e) 
	          {
	                    System.out.println("An error occurred");
	                    e.printStackTrace();
	                }
		}
	}


