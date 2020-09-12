package repetition;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		/*
		for(int x = 0; x <= 10; x++) {
			System.out.println(x);
		}
		*/
		
		System.out.println("Type a number and I'll show the 'times table':");
		int n = Console.readInt();
		
		for(int x = 0; x <= 10; x++) {
			System.out.println(n + " x " + x + " = " + (n * x));
		}

	}

}
