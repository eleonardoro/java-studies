package methods;

public class Main {

	public static void main(String[] args) {

		calculateFibonnaci(10);
		
		System.out.println("\n\n");
		
		int array[] = returnFibonnaci(5);
		for (int val : array) {
			System.out.print(val + " ");
		}

	}
	
	static void calculateFibonnaci(int n) {
		for (int cont = 0, i = 0, j = 1; cont < n; cont++) {
			System.out.print(i + " ");
			
			i = i + j;
			j = i - j;
		}
	}
	
	static int[] returnFibonnaci(int n) {
		int array[] = new int[n];
		
		for (int cont = 0, i = 0, j = 1; cont < n; cont++) {
			array[cont] = i;
			
			i = i + j;
			j = i - j;
		}
		
		return array;
	}

}
