package recursivity;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		System.out.print("Type the number to calculate the Factorial of: ");
		int n = Console.readInt();
		
		System.out.println("\n\nThe Factorial of " + n + " is: " + factorial(n));
		
	}
	
	static int factorial(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}

}
