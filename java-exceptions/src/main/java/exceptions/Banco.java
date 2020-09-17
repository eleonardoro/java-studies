package exceptions;

public class Banco {

	public void realizarOperacao() {
		
		ContaBancaria c = new ContaBancaria();
		
		try {
			c.sacar(100);
			c.sacar(1000)
			;
		} catch (ValorNegativoException e) {
			System.out.println("Valor Negativo!");
			
		}catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente: " + e.getMessage());
			
		}catch (Exception e) {
			System.out.println("Algum erro aconteceu: " + e);
			
		}finally {
			System.out.println("Fim do Saque!");
			System.out.println("Saldo Final: " + c.getSaldo());
		}
		
		
	}

}
