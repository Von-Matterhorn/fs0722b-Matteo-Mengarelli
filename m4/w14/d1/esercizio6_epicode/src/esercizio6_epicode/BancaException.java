package esercizio6_epicode;

public class BancaException extends Exception {

	String messaggio;

	public BancaException(String message) {
		super();
		this.messaggio = message;
	}

	@Override
	public String toString() {
		return "BancaException [messaggio=" + messaggio + "]";
	}

}
