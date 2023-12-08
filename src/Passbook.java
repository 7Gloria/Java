import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Passbook 
{
	 
  private static int Current_Bal = 1500;
  private int min_Bal = 1000;
  private static final int[] pin_no = {1234, 5678, 9876, 5432, 1111};
  private static final String[] Name = new String[]{"Gloria", "Gladiya", "Glisilla", "Femina", "Febin"};
  private static final int[] AcNo = {12345678, 87654321, 45897032, 36782549, 12654783};
  
  public int[] getAccountNumber() 
  {
      return AcNo;
  }

  public String[] getName() 
  {
      return Name;
  }

  public double getBalance() 
  {
      return Current_Bal;
  }

  public int[] getPin() 
  {
      return pin_no;
  }
 
  
  public void displayAccountDetails(int EnteredNo) 
  {
	  int i;
	  for(i=0;i<AcNo.length;i++)
	  { 
		  if (EnteredNo == AcNo[i])
		  {
			  break;
		  }
	    
	    
	  }
  	    System.out.println("\033[35m");  // Set text color to blue

  	    System.out.println("===================================");
  	    System.out.println("|        Account Details          |");
  	    System.out.println("===================================");
  	    
  	    System.out.println("| Account Number : " + AcNo[i]);
  	    System.out.println("| Name           : " + Name[i]);
  	    
  	    System.out.println("| Current Balance: " + Current_Bal);
  	    System.out.println("===================================");
       
  	    System.out.println("\033[0m"); // Reset text color to default
  	   
  	}
  
  public void  deposit(int amount) 
  {
  	if (amount <= 0) 
  	{
  		System.out.println("Invalid amount. Transaction canceled.");
  	} 
  	else 
  	{
      Current_Bal += amount;
      System.out.println("Deposit successful. Current Balance: " + Current_Bal);
  }
  	
  }
  

  public void withdraw(int amountw) 
  
 {
	  
      if (Current_Bal == 500) 
      {
          System.out.println("Insufficient Balance. Withdrawal denied.");
        
      } 
      else if(Current_Bal-amountw<500)
      {
      	System.out.println("Unable to withdraw...");
      }
      else if(Current_Bal <= min_Bal)
      { 
 		System.out.println("Warning!!! Check the balance");
         Current_Bal -= amountw;
         System.out.println("Withdrawn " + amountw + ". Remaining balance: " + Current_Bal);
     } 
     
      else if (amountw % 10 != 0) 
      {
          System.out.println("Please enter a multiple of 10. Withdrawal denied.");
      }
      else 
      {
          Current_Bal -= amountw;
          System.out.println("Withdrawal successful. Current Balance: " + Current_Bal);
         
      }
      
      
  }
  
  public void appendDepositeToFile(int EnteredNo, int amt )
  {
	  
File[] files = new File[Name.length];
     
      
      for (int i=0; i<AcNo.length; i++)
      {
    	  if (EnteredNo==AcNo[i]) 
    	  {
    		  files[i]=new File(Name[i]+".txt");
        	  try {
				files[i].createNewFile();
				
				FileWriter fw = new FileWriter(files[i].getName(),true);
				 SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

			        // Get the current date
			        Date currentDate = new Date();

			        // Format the date using the SimpleDateFormat object
			        String formattedDate = dateFormat.format(currentDate);
				 fw.write("\n"+formattedDate + "\t\t Credited (+" + amt+ ")\t\t"+Current_Bal);
	        	  
				  fw.close();
			} 
        	  
        	  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
      }
        	  
        	  
        	  
        	  
               
    	  }
      
  
   
  public void appendWithdrawToFile(int EnteredNo, int amt )
  {
File[] files = new File[Name.length];
     
      
      for (int i=0; i<AcNo.length; i++)
      {
    	  if (EnteredNo==AcNo[i]) 
    	  {
    		  files[i]=new File(Name[i]+".txt");
        	  try {
				files[i].createNewFile();
				
				FileWriter fw = new FileWriter(files[i].getName(),true);
				 SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

			        // Get the current date
			        Date currentDate = new Date();

			        // Format the date using the SimpleDateFormat object
			        String formattedDate = dateFormat.format(currentDate);
				 fw.write("\n"+ formattedDate + "\t\t Debited (-" + amt+ ")\t\t"+Current_Bal);
	        	  
				  fw.close();
			} 
        	  
        	  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
      }
        	 
        	  
  
  }
  	
      
  public static void main(String[] args) throws IOException 
  {
      Passbook AcHolder = new Passbook();
      Scanner scanner = new Scanner(System.in);
      int attempts = 2;
      int flag=0;
      boolean exit=false;
      
      
      
      System.out.println("Enter the account Nuumber:");
      int EnteredNo= scanner.nextInt();
      while(attempts>0)
      {
    	  System.out.println("Enter PIN:");
      	int EnteredPin = scanner.nextInt();
     for(int i=0; i<pin_no.length; i++)
     {
    	
    	
    	if(EnteredPin==pin_no[i])
    	{
    		flag=1;
    		break;
    	}
     }
       if(flag==1)
       {
    	   break;
       }
    		attempts--;
    		if(attempts==0)
    		{
    			System.out.println("Sorry, you've ran out of chances");
    			return;
    		}
    		else
    		{
    			System.out.println("Invalid PIN\n"+ attempts+" attempt remaining");
    		}
    	}
    
     
     
      do
      {
  System.out.println("\033[46m");
  System.out.println("1. Check Balance");
  System.out.println("2. Withdraw");
  System.out.println("3. Deposit");
  System.out.println("4. Display");
  System.out.println("5. Exit");
  System.out.println("\033[0m");
  
  System.out.print("Enter your choice: ");
  int choice = scanner.nextInt();
 
  
  switch (choice) 
  {
      case 1:
          System.out.println("Your balance is " + Current_Bal);
          
         break;

      case 2:
          System.out.print("Enter the amount to withdraw: ");
          int withdrawAmount = scanner.nextInt();
          AcHolder.withdraw(withdrawAmount);
          AcHolder.appendWithdrawToFile(EnteredNo, withdrawAmount);
          
          break;
      case 3:
      	System.out.print("Enter the amount to deposit: ");
      	int depositAmount = scanner.nextInt();
          AcHolder.deposit(depositAmount);
          AcHolder.appendDepositeToFile(EnteredNo, depositAmount);
      	break;
          
      case 4:
      	AcHolder.displayAccountDetails(EnteredNo);
      	
          break;

      case 5:
      	System.out.println("Thank you..\n Have a Nice day...!!!");
          exit = true;
      	break;
     
      default:
          System.out.println("Invalid choice. Please try again.");
          break;
  }
  

      } while(!exit);
 
  scanner.close();
  
  
  }
  
}

  


  
