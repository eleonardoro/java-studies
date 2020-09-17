package stacktrace;

public class PistaException extends Exception {

	public PistaException(String string) {
		System.out.println(string);
	}

	public PistaException(String string, AcimaVelocidadeException e) {
	}

}
