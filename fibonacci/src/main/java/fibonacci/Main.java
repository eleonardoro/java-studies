package fibonacci;

public class Main {

	public static void main(String[] args) {
		for (int cont = 0, i = 0, j = 1; cont < 10; cont++) {
			System.out.print(i + " ");
			i = j + i;
			j = i - j;
		}

	}

}
