package data;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("How's the size of the array?");
		int size = Console.readInt();
		
		//double grades = {3, 5, 6};
		double[] grades = new double [size];
		
		System.out.println("\n\n");
		
		for(int i = 0; i < size; i++) {
			System.out.println("Type the position " + i + " of array: ");
			grades[i] = Console.readDouble();
		}

		/*
		for(int i = 0; i < size; i++) {
			System.out.println("grades[" + i + "] -> " + grades[i]);
		}
		*/
		
		System.out.println("\n\n");
		
		for(double grade : grades) {
			System.out.println("grade: " + grade);
		}

	}

}
