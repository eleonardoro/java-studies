package lambda.stream.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

//		List<Integer> numbers = new ArrayList<>(List.of(5, 3, 4, 1, 2));
//		
//		System.out.println(numbers);
//		
//		NumberComparator comparator = new NumberComparator();
//		
//		Comparator<Integer> comparator = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return -o1.compareTo(o2);
//			}
//		};
//		
//		Comparator<Integer> comparator = (o1, o2) -> -o1.compareTo(o2);
//		
//		numbers.sort((o1, o2) -> -o1.compareTo(o2));
//	
//		System.out.println(numbers);
		
//		Operator op = (x, y) -> x * y;
//		System.out.println(op.execute(3, 4));
//		
//		Operator op = (x, y) -> x + y;
		
//		List<String> words = List.of("CARLOS", "JOSÉ", "JOÃO", "JOANA", "MARIA", "CELSO");
//		
//		List<String> filteredWords = words.stream()
//		.filter(w -> w.startsWith("J"))
//		.map(w -> w.toLowerCase())
//		.collect(Collectors.toList());
//		
//		System.out.println(filteredWords);
//		
//		filteredWords.stream().forEach(w -> System.out.println(w));
//		filteredWords.forEach(w -> System.out.println(w));
//		
//		List<String> filteredWords2 = words.stream()
//				.filter(w -> w.startsWith("J"))
//				.map(String::toLowerCase)
//				.collect(Collectors.toList());
//				
//		filteredWords.forEach(System.out::println);
	
		List<Car> cars = List.of(new Car("BMW", 12000), new Car("Renault", 85000), new Car("VW", 70000));
		
		cars.stream()
		.sorted((c1, c2) -> Double.valueOf(c1.getPrice()).compareTo(c2.getPrice()))
		.map(c -> new Car(c.getBrand().toLowerCase(), c.getPrice()))
		//.peek(c -> c.addTax())
		.peek(Car::addTax)
		.forEach(System.out::println);
		
	}
}
