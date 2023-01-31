package esercizio2_epicode;

public class Articolo {

	// attributi
	int codiceArticolo;
	String descrizioneArticolo;
	int prezzo;
	int articoliDisponibili;

	// costruttore
	public Articolo(int cod, String des, int pr, int disp) {
		this.codiceArticolo = cod;
		this.descrizioneArticolo = des;
		this.prezzo = pr;
		this.articoliDisponibili = disp;
	}
}
