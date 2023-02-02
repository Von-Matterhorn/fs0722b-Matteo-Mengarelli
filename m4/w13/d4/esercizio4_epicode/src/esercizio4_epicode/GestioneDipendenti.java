package esercizio4_epicode;

public class GestioneDipendenti {

	public static void main(String[] args) {
		Dipendente Matteo = new Dipendente(46, Dipartimento.PRODUZIONE);
		Dipendente Aldo = new Dipendente(484, Dipartimento.PRODUZIONE);
		Dipendente Giovanni = new Dipendente(687, 1200, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente Giacomo = new Dipendente(945, 2000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);

		Matteo.promuovi();
		Giovanni.promuovi();

		Matteo.stampaDatiDipendente();
		System.out.println("");
		Aldo.stampaDatiDipendente();
		System.out.println("");
		Giovanni.stampaDatiDipendente();
		System.out.println("");
		Giacomo.stampaDatiDipendente();
		System.out.println("");

		System.out.println(calcolaPaga(Matteo, 5));
		System.out.println(calcolaPaga(Aldo, 5));
		System.out.println(calcolaPaga(Giovanni, 5));
		System.out.println(calcolaPaga(Giacomo, 5));
	}

	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.getStipendio();
	}

	public static double calcolaPaga(Dipendente dipendente, int ore) {
		return dipendente.getStipendio() + dipendente.getImportoOrarioStraordinario() * ore;
	}
}
