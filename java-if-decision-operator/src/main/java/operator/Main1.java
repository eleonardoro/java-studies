package operator;
import br.com.softblue.commons.io.Console;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("Type your age: ");
		int age = Console.readInt();
		
		if(age <= 12) {
			System.out.println("\n\nYou're a child!");
		}else {
			System.out.println("\n\nYou're an adult!");
		}
		
		System.out.println("\n\nEnd of program!");

	}

}
