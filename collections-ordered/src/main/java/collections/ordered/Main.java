package collections.ordered;

import java.util.Set;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {

//		Set<Character> alphabet = new TreeSet<Character>();
//		
//		alphabet.add('F');
//		alphabet.add('E');
//		alphabet.add('C');
//		alphabet.add('Z');
//		alphabet.add('H');
//		
//		System.out.println(alphabet);
		
		
//		Set<Month> months = new TreeSet<Month>();
//		
//		Month m1 = new Month("January", 1);
//		Month m4 = new Month("April", 4);
//		Month m2 = new Month("February", 2);
//		Month m3 = new Month("March", 3);
//		
//		months.add(m1);
//		months.add(m2);
//		months.add(m3);
//		months.add(m4);
//		
//		System.out.println(months);
//		
//		Month m5 = new Month("March", 3);
//		
//		months.add(m5);
//		
//		System.out.println(months);
		
		Set<Character> alphabetInverted = new TreeSet<Character>(new InverseComparator());
		
		alphabetInverted.add('F');
		alphabetInverted.add('E');
		alphabetInverted.add('C');
		alphabetInverted.add('Z');
		alphabetInverted.add('H');
		
		System.out.println(alphabetInverted);
	}

}
