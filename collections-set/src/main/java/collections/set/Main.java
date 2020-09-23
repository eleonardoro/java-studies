package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		
//		Set<Integer> numbers = new HashSet<Integer>();
//		
//		numbers.add(1);
//		numbers.add(2);
//		numbers.add(10);
//		numbers.add(22);
//		
//		for(int n : numbers) {
//			System.out.println("=> " + n);
//		}
//		
//		System.out.println("\n\nRepeating Numbers!\n");
//		
//		numbers.add(2);
//		for(int n : numbers) {
//			System.out.println("=> " + n);
//		}
		
		Month m1 = new Month("January", 1);
		Month m2 = new Month("February", 2);
		Month m3 = new Month("March", 3);
		Month m4 = new Month("April", 4);
		
		Set<Month> months = new HashSet<Month>();
		months.add(m1);
		months.add(m2);
		months.add(m3);
		months.add(m4);
		
		System.out.println(months);
		
		Month m5 = new Month("Fevereiro", 2);
		months.add(m5);

		System.out.println(months);
	}

}
