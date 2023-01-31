package esercizio2_epicode;

public class Cliente {

	// atributi
	long codiceCliente;
	String nomeECognome;
	String email;
	String dataIscrizione;

	// costruttore
	public Cliente(long l, String nom, String em, String dat) {
		this.codiceCliente = l;
		this.nomeECognome = nom;
		this.email = em;
		this.dataIscrizione = dat;
	}

}
