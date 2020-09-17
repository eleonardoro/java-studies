package exceptions;

public class ContaBancaria {

	private double saldo = 1000;
	
	public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
		
		if(valor <= 0) {
			throw new ValorNegativoException("O valor " + valor + " � negativo!");
		}
		
		if(saldo - valor < 0) {
			throw new SaldoInsuficienteException("Saldo de => R$ " + saldo + " <= � insuficiente!");
		}
		
		saldo -= valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
