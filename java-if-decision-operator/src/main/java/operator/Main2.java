package operator;
import br.com.softblue.commons.io.Console;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("Type your age: ");
		int age = Console.readInt();
		
		if(age >= 0 && age <= 12) {
			System.out.println("\n\nYou're a child!");
		}else if(age > 12 && age <= 17) {
			System.out.println("\n\nYou're an teenager!");
		}else if(age > 17 && age <= 59) {
			System.out.println("\n\nYou're adult!");
		}else if (age > 59) {
			System.out.println("\n\nYou're old!");
		}else {
			System.out.println("\n\nInvalid age!");
		}
		
		System.out.println("\n\nEnd of program!");

	}

}
