package esercizio2_epicode;

public class Carrello {

	// attributi
	Cliente clienteAssociato;
	Articolo elencoArticoli[];
	int totaleCosto = 0;

	// costruttore
	public Carrello(Cliente c, Articolo a[]) {
		this.clienteAssociato = c;
		this.elencoArticoli = a;
		for (int i = 0; i < a.length; i++) {
			this.totaleCosto += a[i].prezzo;
		}
	}
}
