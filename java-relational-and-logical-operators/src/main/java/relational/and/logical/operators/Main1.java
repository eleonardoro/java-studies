package relational.and.logical.operators;

import br.com.softblue.commons.io.Console;

public class Main1 {

	public static void main(String[] args) {

		System.out.println("Type n1: ");
		int n1 = Console.readInt();
		
		System.out.println("Type n2: ");
		int n2 = Console.readInt();
		
		boolean equal = n1 == n2;
		System.out.println("\n\nSame number? " + equal);
		
		boolean different = n1 != n2;
		System.out.println("\nDifferent numbers? " + different);
		
		boolean firstBiggerThanSecond = n1 > n2;
		System.out.println("\nFirst number is bigger than second number? " + firstBiggerThanSecond);
		
		boolean firstBiggerOrEqualThanSecond = n1 >= n2;
		System.out.println("\nFirst number is bigger or equal than second number? " + firstBiggerOrEqualThanSecond);
		
		

	}

}
