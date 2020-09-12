package repetition;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		double grade; 
		int cont = 1;
		double sum = 0;
		
		do {
			System.out.println("\nType the grade " + cont++ + " (-1 to exit): ");
			grade = Console.readDouble();
			
			if (grade != -1) 
				sum += grade;
			
		} while(grade != -1);

		System.out.println("\n\nYou're final grade is: " + (sum / (cont - 2)));
		
		System.out.println("\n\nEnd of program!");
	}

}
