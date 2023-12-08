import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Map<String, Integer> RMenu = new HashMap<>();
		   System.out.println("\u001B[4m"+"\u001B[32m");
		   System.out.println("Regular Pizza Menu: \n");
		   System.out.println("\033[0m");
		   RMenu.put("Hot Veg",95);
		   RMenu.put("Veggies Pizza",90);
		   RMenu.put("Italian veg",115);
		   RMenu.put("Panner Pizza",130);
		   RMenu.put("Chicken Royal Pizza",190);
		   RMenu.put("Corn Cheese Pizza",170);
		   RMenu.put("Capsicum Pizza",90);
		   List<String> keys = new ArrayList<String>();
		   List<Integer> val = new ArrayList<Integer>();
 		   for (Entry<String, Integer> entry : RMenu.entrySet()) {
//	           System.out.println(entry.getKey() + " : " + "₹" +entry.getValue());
	           keys.add(entry.getKey());
 		   }
 		   
 		   System.out.println("Pizza Available:");
	           for(String k : keys)
	           {
	        	   System.out.println(k);
	           }
	           
	           for (String key : keys) {
	               Integer value = RMenu.get(key);
	               val.add(value);
	           }
	           System.out.println("Cost:");
	           for(Integer v : val)
	           {
	        	   System.out.println(v);
	           }
	           
 		      
	       
		  
	}

}
