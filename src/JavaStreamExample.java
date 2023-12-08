//import java.util.*;  
//class Product{  
//    int id;  
//    String name;  
//    float price;  
//    public Product(int id, String name, float price) {  
//        this.id = id;  
//        this.name = name;  
//        this.price = price;  
//    }  
//}  
//public class JavaStreamExample {  
//    public static void main(String[] args) {  
//        List<Product> productsList = new ArrayList<Product>();  
//        //Adding Products  
//        productsList.add(new Product(1,"HP Laptop",25000f));  
//        productsList.add(new Product(2,"Dell Laptop",30000f));  
//        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
//        productsList.add(new Product(4,"Sony Laptop",28000f));  
//        productsList.add(new Product(5,"Apple Laptop",90000f));  
//        List<Float> productPriceList = new ArrayList<Float>();  

//        for(Product product: productsList){  
//              
//            // filtering data of list  
//            if(product.price<30000){  
//                productPriceList.add(product.price);    // adding price to a productPriceList  
//            }  
//        }  
//        System.out.println(productPriceList);   // displaying data  
//    }  
//} 

import java.util.*;

class Election {
	public int age;
	public String name;

	public Election(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

	public class JavaStreamExample {
		public static void main(String[] args) {

			List<Election> ElectoralRoll = new ArrayList<Election>();
			// Adding Electoral
			ElectoralRoll.add(new Election(18, "Gladiya"));
			ElectoralRoll.add(new Election(21, "Gloria"));
			ElectoralRoll.add(new Election(13, "Bakht Singh"));
			ElectoralRoll.add(new Election(7, "Sony"));
			ElectoralRoll.add(new Election(90, "Sundar"));
			List<String> EleRoll = new ArrayList<String>();

			for (Election ele : ElectoralRoll) {
//        
				// filtering data of list
				if (ele.age >= 18) {
					EleRoll.add(ele.name); // adding price to a productPriceList
				}
			}
			System.out.println("Eligible Voter:-");
			System.out.println(EleRoll); // displaying data
		}
	}


