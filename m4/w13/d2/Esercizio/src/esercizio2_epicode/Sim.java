package esercizio2_epicode;

import java.util.Arrays;

public class Sim {

	// attributi
	long numeroTelefono;
	double creditoDisponibile = 0;
	Chiamata ultimeChiamate[] = new Chiamata[5];

	// costruttore
	public Sim(long num) {
		this.numeroTelefono = num;
	}

	// metodi
	public void stampaDati() {
		System.out.println("numero di telefono: " + this.numeroTelefono);
		System.out.println("credito rimanente: " + this.creditoDisponibile);
		System.out.println("ultime chiamate: " + Arrays.toString(this.ultimeChiamate));
	}

}
