package esercizio2_epicode;

public class main_project {

	public static void main(String[] args) {

		// sezione oggetto rettangolo
		Rettangolo r = new Rettangolo(5, 7);
		Rettangolo r2 = new Rettangolo(6, 12);
		stampaRettangolo(r);
		stampaDueRettangoli(r, r2);

		// sezione oggetto sim
		Sim s = new Sim(3485444027L);
		s.stampaDati();

		// sezione oggetti articolo,cliente e carrello
		// articolo:
		Articolo a = new Articolo(5557, "bello", 25, 7);
		System.out.println("codice articolo: " + a.codiceArticolo + ", descrizione: " + a.descrizioneArticolo
				+ ", prezzo: " + a.prezzo + "$, articoli rimasti: " + a.articoliDisponibili);

		// cliente:
		Cliente c = new Cliente(3456999L, "Stefano Gavioli", "steve.gavvio@gmail.com", "31/01/2023");
		System.out.println("codice cliente: " + c.codiceCliente + ", nome e cognome: " + c.nomeECognome + ", email: "
				+ c.email + ", data iscrizione: " + c.dataIscrizione);

		// carrello:
		Articolo b = new Articolo(6666, "brutto", 13, 2);
		Articolo arr[] = { a, b };
		Carrello d = new Carrello(c, arr);
		System.out.println("prezzo totale di spesa: " + d.totaleCosto + "$");
	}

	public static void stampaRettangolo(Rettangolo a) {
		System.out.println(a.calcoloArea());
		System.out.println(a.calcoloPerimetro());
	}

	public static void stampaDueRettangoli(Rettangolo a, Rettangolo b) {
		System.out.println(a.calcoloArea());
		System.out.println(a.calcoloPerimetro());
		System.out.println(b.calcoloArea());
		System.out.println(b.calcoloPerimetro());
		System.out.println(a.calcoloArea() + a.calcoloPerimetro());
		System.out.println(b.calcoloArea() + b.calcoloPerimetro());
	}
}
