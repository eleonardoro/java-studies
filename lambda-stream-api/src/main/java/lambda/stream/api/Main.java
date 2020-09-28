package lambda.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	

	private static final Map<String, Integer> PEOPLE = Map.of("pedro", 15, "maria", 20, "paulo", 25, "jorge", 10);

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
//		List<Car> cars = List.of(new Car("BMW", 12000), new Car("Renault", 85000), new Car("VW", 70000));
//		
//		cars.stream()
//		.sorted((c1, c2) -> Double.valueOf(c1.getPrice()).compareTo(c2.getPrice()))
//		.map(c -> new Car(c.getBrand().toLowerCase(), c.getPrice()))
//		//.peek(c -> c.addTax())
//		.peek(Car::addTax)
//		.forEach(System.out::println);

//		Optional<Integer> opt = get("pedro");
//		
//		int age = opt.orElse(0);
//		
//		System.out.println(age);
//		
//		int age2 = opt.orElseThrow();
//		//int age3 = opt.orElseThrow(() -> new IllegalArgumentException());
//		int age3 = opt.orElseThrow(IllegalArgumentException::new);
//		
//		opt.ifPresent(i -> System.out.println(i));
//		opt.ifPresentOrElse(
//			i -> System.out.println(i), 
//			() -> System.out.println("Não encontrado")
//		);
		
//		int mult = 2;
//		
//		IntStream.range(1, 21)
//		.map(i -> i * mult)
//		.forEach(System.out::println);
		
//		int[] array = List.of(3, 2, 5).stream().mapToInt(Integer::intValue).toArray();
//		System.out.println(multiply(array));
//		System.out.println(findBigger(array));
		
		String str = "ACBA";
		
		String result = str.chars()
		.map(i -> i - 64)
		.mapToObj(String::valueOf)
		.collect(Collectors.joining("-", "[", "]"));
		
		System.out.println(result);
	}
	
//	private static int multiply(int[] array) {
//		return Arrays.stream(array).reduce((x, y) -> x * y).orElse(0);
//	}
//	
//	private static int findBigger(int[] array) {
//		return Arrays.stream(array).reduce((x, y) -> x > y ? x : y).orElse(0);
//	}
	
	
//	private static Optional<Integer> get(String name) {
//		return Optional.ofNullable(PEOPLE.get(name));
//	}
}
