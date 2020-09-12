package repetition;

import br.com.softblue.commons.io.Console;

public class Main2 {

	public static void main(String[] args) {

		double grade = 0; 
		int cont = 1;
		double sum = 0;

		while (grade != -1) {
			System.out.println("\nType the grade " + cont++ + " (-1 to exit): ");
			
			grade = Console.readDouble();
			
			if (grade == -1)
				break;
			
			sum += grade;
		} 

		System.out.println("\n\nYou're final grade is: " + (sum / (cont - 2)));
		
		System.out.println("\n\nEnd of program!");
	}

}
