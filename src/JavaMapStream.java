import java.util.*;

public class JavaMapStream {
	public static void main(String[] args) {
		Map<String, Integer> map =new TreeMap<String, Integer>();
		map.put("T-shirt", 500);
		map.put("Saree", 1500);
		map.put("Kurta", 800);
		map.put("hoodie", 1000);
		map.replace("hoodie", 700);
		System.out.println("Actual Price:\n");
		System.out.println(map.keySet()+":"+map.values());
		System.out.println("10% Discount");
		map.values().stream()
		            .map(value -> value - (value*0.1))
		            .forEach(System.out::println);
		            
	}

}
