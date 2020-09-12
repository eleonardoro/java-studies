package variables;

public class Main {

	public static void main(String[] args) {
		int age = 20;
		double grade = 8.6;
		boolean on = true;
		String name = "Eleonardo";
		
		System.out.println("Age: " + age);
		System.out.println("\nGrade: " + grade);
		System.out.println("\nOn: " + on);
		System.out.println("\nName: " + name);
		
		//int 2x; NOT
		//int NUMBER = 10; NOT
		//int Number = 10; NOT
		int numberOfPeople = 10; //YES
		
		//Generic type of variable. 
		//Java will separate memory space based on the type of data that was first saved
		var x = 5;  

	}

}
