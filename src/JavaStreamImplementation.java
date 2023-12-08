import java.util.ArrayList;
import java.util.List;  
class Election1{  
    int age;  
    String name;  
    
    public Election1(int age, String name) {  
        this.age = age;  
        this.name = name;  
         }  

public class JavaStreamExample2 {  
    public static void main(String[] args) { 
    	
    	
    	List<Election1> ElectoralRoll = new ArrayList<Election1>();  
      //Adding Electoral  
    	ElectoralRoll.add(new Election1(18,"Gladiya"));  
    	ElectoralRoll.add(new Election1(21,"Gloria"));  
    	ElectoralRoll.add(new Election1(13,"Sha"));  
    	ElectoralRoll.add(new Election1(7,"Fem"));  
    	ElectoralRoll.add(new Election1(90,"Feb"));  
      List<String> EleRoll= new ArrayList<String>();
      
      for(Election1 ele: ElectoralRoll){  
//        
      // filtering data of list  
      if(ele.age>=18){  
    	  EleRoll.add(ele.name);    // adding price to a productPriceList  
      }  
  } 
  System.out.println("Voter:-");
  System.out.println(ElectoralRoll);   // displaying data  
}  
    }
    	
    }

