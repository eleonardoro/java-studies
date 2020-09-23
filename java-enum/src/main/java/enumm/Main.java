package enumm;

public class Main {

	public static void main(String[] args) {

		DiaDaSemana d1 = DiaDaSemana.Quinta;
		DiaDaSemana d2 = null;
		
		DiaDaSemana domingo = DiaDaSemana.valueOf("Domingo");
		System.out.println(domingo);
		
		System.out.println(d1.isDiaUtil());
		System.out.println(domingo.isDiaUtil());
		
		System.out.println(DiaDaSemana.valueOf("Sexta").isDiaUtil());
	}

}
