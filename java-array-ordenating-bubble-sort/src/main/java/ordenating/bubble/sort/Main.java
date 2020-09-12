package ordenating.bubble.sort;

public class Main {

	public static void main(String[] args) {
		
		int[] values = {3 , 6, 5, 2, 1, 4, 0, 7};
		int aux;
		
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if(values[i] > values[j]) {
					aux = values[i];
					values[i] = values[j];
					values[j] = aux;
				}
			}
		}
		
		for (int value : values) {
			System.out.print(value + " ");
		}
		
	}

}
