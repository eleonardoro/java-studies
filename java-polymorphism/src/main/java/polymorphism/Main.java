package polymorphism;

public class Main {

	public static void main(String[] args) {

		Veiculo v = new Veiculo();
		v.andar();
		
		Automovel a = new Automovel();
		a.andar();
		
		Veiculo x = new Automovel();
		x.andar();
		
		Automovel g = new Automovel();
		g.andar();
		
		Veiculo j = new Automovel();
		Automovel auto = (Automovel) j;
		auto.acelerar();
		
		Veiculo vb = new Bicicleta();
		
		if (vb instanceof Automovel)
			Automovel auto2 = (Automovel) vb;
		else
			System.out.println("O tipo não é compatível");
	}

}
