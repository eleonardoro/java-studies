package polymorphism;

public class Bicicleta extends Automovel{

	@Override
	public void andar() {
		System.out.println("Bicicleta está andando");
	}
	
	public void empinar() {
		System.out.println("Bicicleta está empinando");
	}	
	
}
