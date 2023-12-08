// throw
//public class ThrowAndThrows {
//
//	public static void Arithmetic() {
//	throw new ArithmeticException("Trying to divide by Zero");
              //throw keyword to explicitly throw an exception.
//	}
//
//	public static void main(String[] args) {
//		Arithmetic();
//	}
//}

// throws

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowAndThrows
{
	public static void findfile() throws IOException
	{
		File file = new File("Developer.txt");
		FileInputStream stream = new FileInputStream(file); //When an exception occurs within a method, it creates an object. 
//		If the file developer.txt does not exist, 
//		FileInputStream throws a FileNotFoundException
	}
	public static void main(String[] args)  {
//		try
//		{
			findfile();
//		}
//		catch(IOException e)  
//		                      // This object is called the exception object.(e)
//		{
//			System.out.println(e);  // And contains info about name and description of the exception
//		}
	}
}



// Run-time Exception(Unchecked Exception) like ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException
// It's not checked at the compile-time but at the Run-time..
//A runtime exception happens due to a programming error.

//IOException,SQL Exception (checked Exception)
//They are checked by the compiler at the compile-time
//like FileNotFoundException
