
//public class DivideByZeroError {
//	 public static void main(String[] args) {
//		
//	
//		try {
//			int x = 10 / 0;
//			System.out.println("Rest of the code in the try-block is not executed when exception occurs.. ");
//			System.out.println("result = " + x);
//		}
//
//		catch (Exception e) {
//			System.out.println("ArithmeticException =>" + e.getMessage());
//			System.out.println("If An Exception occurs catch block will be executed..");
//			System.out.println(
//					"If none of the statements in the try block generates an exception, the catch block is skipped.");
//		}
//	}
//
//}

// The finally-block
public class DivideByZeroError {
	public static void main(String[] args) {
		try {
		int x=10/0;
		System.out.println("Rest of the code in the try-block is not executed when exception occurs.. ");
		System.out.println("result = "+ x);
		if(x==1) {
			throw new ArithmeticException("Error");
		}
		}
		
		catch(Exception e)
		{
			System.out.println("ArithmeticException =>" + e.getMessage());
			
		}
	
	finally
	{
		System.out.println("If An Exception occurs catch block will be executed..");
		System.out.println("If none of the statements in the try block generates an exception, the catch block is skipped.");
	}
	}
}
