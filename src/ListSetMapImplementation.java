import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class PizzaListSetMap {
	public static void List()
	{
		List<String> PizTyp = new ArrayList<String>();
		PizTyp.add("Hot Veg");
		PizTyp.add("Veggies Pizza");
		PizTyp.add("Italian veg");
		PizTyp.add("Panner Pizza");
		PizTyp.add("Chicken Royal Pizza");
		PizTyp.add("Corn Cheese Pizza");
		PizTyp.add("Capsicum Pizza");
		
		String Menu  = PizTyp.get(0);
		int PizVariety = PizTyp.size();
		
//		PizTyp.remove("pizza");
		
		
		System.out.println("PIZZA TASTE OF PARADISE...!");
		System.out.println("We have "+ PizVariety +" varieties of PIZZA.." );
		System.out.println("The best(TOP 1) PIZZA : "+Menu);
		
		
		System.out.println("Menu:");
		
		for(String Pizza : PizTyp)
		{
			System.out.println(Pizza);
		}
		System.out.println("Enter your favorite pizza to check whether available :");
		Scanner  scanner = new Scanner(System.in);
		String favPiz = scanner.nextLine();
	
		boolean contains = PizTyp.contains(favPiz);
		
		if(contains)
		{
			System.out.println("Yahoo... WE HAVE YOUR FAVORITE PIZZA 😋");
		}
		else
		{
			System.out.println("Oops.. Sorry 😔");
		}

		scanner.close();
	}
	
	public static void Map()
	{
		System.out.println("Reguler/Medium(Enter r/m) ???");
		Scanner scanner = new Scanner(System.in);
		String PizSize = scanner.next().toLowerCase();
		switch(PizSize)
		{
		case "r":
	   Map<String, Integer> RMenu = new TreeMap<>();
	   System.out.println("\033[4m"+"\u001B[32m"); // \u001B same as \033
	   System.out.println("Regular Pizza Menu: \n");
	   System.out.println("\033[0m");
	   RMenu.put("Hot Veg",95);
	   RMenu.put("Veggies Pizza",90);
	   RMenu.put("Italian veg",115);
	   RMenu.put("Panner Pizza",130);
	   RMenu.put("Chicken Royal Pizza",190);
	   RMenu.put("Corn Cheese Pizza",170);
	   RMenu.put("Capsicum Pizza",90);
	   
	   for (Entry<String, Integer> entry : RMenu.entrySet()) {
           System.out.println(entry.getKey() + " : " + "₹" +entry.getValue());
       }
	  
	   break;
	   
		case"m":
	   Map<String, Integer> MMenu = new HashMap<>();
	   System.out.println("Medium Pizza Menu: ");
	   MMenu.put("Hot Veg",175);
	   MMenu.put("Veggies Pizza",170);
	   MMenu.put("Italian veg",195);
	   MMenu.put("Panner Pizza",210);
	   MMenu.put("Chicken Royal Pizza",270);
	   MMenu.put("Hot Veg",90);
	   MMenu.put("Corn Cheese Pizza",255);
	   MMenu.put("Capsicum Pizza",170);
	   MMenu.put("Hot Veg",190);
	   for (Map.Entry<String, Integer> entry : MMenu.entrySet()) {
           System.out.println(entry.getKey() + " : " + "₹" + entry.getValue());
       }
	  
	   break;
	   default: System.out.println("Invalid");
	   break;
	   
		}
		scanner.close();
	   
	}
	
	public static void Set()
	{
		System.out.println("Pizza Extra Toppings Price(Pepperoni,Cheese,Chicken):");
		Set<Integer> Toppings = new TreeSet<>();
		Toppings.add(50);
		Toppings.add(35);  // TreeSet used for sorted order
		Toppings.add(20);
		Toppings.add(20);
		for(int T :Toppings)
		{
			System.out.println(T);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter 1 to view menu and check availability\n Enter 2 to view menu with cost \n Enter 3 for Extra Toppings Cost \n Enter 4 to Exit\n");
		System.out.println("Enter Your Choice:");
		Scanner scanner = new Scanner(System.in);
		int choice= scanner.nextInt();
		
		switch(choice)
		{
		case 1: List();
		        break;
		        
		case 2: Map();
		        break;
		        
		case 3: Set();
		        break;
		        
		 default:System.out.println("Invalid Choice");       
		}
		scanner.close();
	}

}
