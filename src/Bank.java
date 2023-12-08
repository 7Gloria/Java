import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Random;
import java.util.Scanner;

public class BankTask3 
{
  
    private String Name;
    private int Current_Bal = 1500;
    private int min_Bal = 1000;
    private static final int[] pin_no = {1234, 5678, 9876, 5432, 1111};
    private static final String[] names = {"Gloria", "Gladiya", "Glisilla", "Femina", "Febin",
            "Reuben", "Jenita", "Jennifer", "Jehosheeba", "Joemon"};
    private static final int[] AcNo = {12345678, 87654321, 45897032, 36782549, 12654783, 
    		28730984, 39129384, 45890267, 10333456, 34567778};
    
    
//    private static HashSet<Integer> generatedAccountNumbers = new HashSet<>();
//    Random random = new Random();
//    int AcNo_range = 100000000;

//    public BankTask3() 
//    {
//        while (true) 
//        {
//            AcNo = random.nextInt(AcNo_range);
//            if (!generatedAccountNumbers.contains(AcNo)) 
//            {
//                generatedAccountNumbers.add(AcNo);
//                break;
//            }
//        }
//        Name = names[AcNo % names.length];
//    }

    public int[] getAccountNumber() 
    {
        return AcNo;
    }

    public String getName() 
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
    
    public void deposit(int amount) 
    {
    	if (amount <= 0) {
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
    
    
    public void displayAccountDetails() 
    {
    	    System.out.println("\033[35m");  // Set text color to blue

    	    System.out.println("===================================");
    	    System.out.println("|        Account Details          |");
    	    System.out.println("===================================");
    	    System.out.println("| Account Number : " + AcNo);
    	    System.out.println("| Name           : " + Name);
    	    System.out.println("| Current Balance:" + Current_Bal);
    	    System.out.println("===================================");

    	    System.out.println("\033[0m"); // Reset text color to default
    	}

    	
       
    public static void main(String[] args) 
    {
        BankTask3 AcHolder = new BankTask3();
        Scanner scanner = new Scanner(System.in);
        int attempts = 2;
        int Current_Bal=1500;
        boolean exit=false;
        
        while (attempts > 0) 
        {
            System.out.print("Enter PIN: ");
            int enteredPIN = scanner.nextInt();
            
            if (Arrays.stream(AcHolder.getPin()).anyMatch(pin -> pin == enteredPIN)) 
            {
                break;
            } 
            else 
            {
                System.out.println("Invalid PIN. " + (--attempts) + " attempts remaining.");
            }
        }
        
        if (attempts <= 0) 
        {
        	System.out.println("\033[35m");
            System.out.println("Too many incorrect attempts. Access denied. Exiting.");
            System.out.println("\033[0m");
            scanner.close();
            return;
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
            break;
        case 3:
        	System.out.print("Enter the amount to deposit: ");
        	int depositAmount = scanner.nextInt();
            AcHolder.deposit(depositAmount);
        	break;
            
        case 4:
        	AcHolder.displayAccountDetails();
            break;

        case 5:
        	System.out.println("Thank you..\n Have a Nice day...!!!");
            exit =true;
        	break;
       
        default:
            System.out.println("Invalid choice. Please try again.");
            break;
    }
    

        } while(!exit);
   
    scanner.close();
    }
    
}
    
  
    
