import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream2 {
	public static void main(String[] args) {
		// Important Intermediate Operations
		

		// To find the square of numbers in Array List
		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);

		// To filter out the names starts with the specific letter as per the Predicate
		// passed
		List<String> names = Arrays.asList("Gloria", "Glo", "Feba");
		List<String> result = names.stream().filter(s -> s.startsWith("G")).collect(Collectors.toList());
		System.out.println(result);
		
		// To Sort
		List<String> name = Arrays.asList("AAA", "ZZZ", "VVV", "GGG");
		List<String> results = name.stream().sorted().collect(Collectors.toList());
		System.out.println(results);
		name.sort(null);
		System.out.println("New sorted elements : " +name);
		
		// Terminal Operations

		// Set square
		List<Integer> num = Arrays.asList(2, 3, 4, 5, 3);
		Set<Integer> sqr = num.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(sqr);

		// ForEach
		List<Integer> no = Arrays.asList(2, 3, 4, 5);
		no.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		// reduce
		List<Integer> nos = Arrays.asList(2, 3, 4, 5, 6, 7,8,9);
		int even = nos.stream().filter(x -> x % 2 == 0).reduce(0,(ans1, ans2) -> ans1 + ans2);
		System.out.println("Sum of Even Numbers :-" +even);
       
	}
}
