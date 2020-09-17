package stacktrace;

public class Automovel {

	private static final int VELOCIDADE_MAXIMA = 180;
	
	private int velocidadeAtual;
	
	public void acelerar(int velocidade) throws AcimaVelocidadeException {

		if(velocidadeAtual + velocidade > VELOCIDADE_MAXIMA) {
			throw new AcimaVelocidadeException("Excedeu a velocidade máxima!");
		}
		
		velocidadeAtual += velocidade;
	}

}
