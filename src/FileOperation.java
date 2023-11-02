import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileOperation 
{
    public static void main(String[] args) 
    {
  try {
           File fc = new File("glo.txt");
           if (fc.createNewFile()) {
               System.out.println("File created:" + fc.getName());
           } else {
               System.out.println("File already exists.");
           }
      FileWriter fw = new FileWriter("glo.txt");
          fw.write("Hello");
          fw.close();
          
          System.out.println("Successfully wrote to the file");

            File fr = new File("glo.txt");
            Scanner reader = new Scanner(fr);
            
            while (reader.hasNextLine()) 
            {
                String data = reader.nextLine();
                
                System.out.println(data); 
            }
            reader.close();

            File fd = new File("glo.txt");
            if (fd.delete()) 
            {
                System.out.println("Deleted the file:" + fd.getName());
            } else {
                System.out.println("Failed to delete the file");
            }

        } 
  catch (IOException e) 
  {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
