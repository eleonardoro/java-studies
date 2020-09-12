package temperature.conversor;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		System.out.print("Digite a temperatura: ");
		double temp = Console.readDouble();
		
		System.out.println("\nWhich conversion? (1 = F -> C, 2 = C -> F)");
		int choice = Console.readInt();
		
		double res = 0;
		
		if(choice == 1) {
			res = convertToCelsius(temp);
		}else if (choice == 2) {
			res = convertToFahrenheit(temp);
		}else {
			System.out.println("\nInvalid choice!");
			return;
		}
		
		System.out.println("\n\n The converted temperature is: " + res);
		
	}

	static double convertToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}
	
	static double convertToFahrenheit(double celsius) {
		return celsius * 1.8 + 32;
	}
	
}
