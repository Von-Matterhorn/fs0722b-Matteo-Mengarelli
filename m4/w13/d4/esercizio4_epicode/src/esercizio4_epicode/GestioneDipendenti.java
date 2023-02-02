package esercizio4_epicode;

public class GestioneDipendenti {

	public static void main(String[] args) {
		Dipendente damiano = new Dipendente(666, Dipartimento.PRODUZIONE);
		Dipendente riccardo = new Dipendente(667, Dipartimento.PRODUZIONE);
		Dipendente francesco = new Dipendente(668, 1200, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente stefano = new Dipendente(669, 2000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);

		riccardo.promuovi();
		francesco.promuovi();

		damiano.stampaDatiDipendente();
		System.out.println("");
		riccardo.stampaDatiDipendente();
		System.out.println("");
		francesco.stampaDatiDipendente();
		System.out.println("");
		stefano.stampaDatiDipendente();
		System.out.println("");

		System.out.println(calcolaPaga(damiano, 5));
		System.out.println(calcolaPaga(riccardo, 5));
		System.out.println(calcolaPaga(francesco, 5));
		System.out.println(calcolaPaga(stefano, 5));
	}

	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.getStipendio();
	}

	public static double calcolaPaga(Dipendente dipendente, int ore) {
		return dipendente.getStipendio() + dipendente.getImportoOrarioStraordinario() * ore;
	}
}
