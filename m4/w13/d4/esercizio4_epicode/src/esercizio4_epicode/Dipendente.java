package esercizio4_epicode;

public class Dipendente {

	// attributi
	static double stipendioBase = 1000;

	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello liv;
	private Dipartimento dip;

	// costruttori
	public Dipendente(int matricola, Dipartimento dip) {
		this.matricola = matricola;
		this.dip = dip;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.liv = Livello.OPERAIO;
	}

	public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello liv,
			Dipartimento dip) {
		this.matricola = matricola;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.liv = liv;
		this.dip = dip;

		// controllo stipendio
		// ad ogni livello inserito controllo se la cifra è superiore allo stipendio
		// minimo e inferiore allo stipendio massimo, in caso contrario setto al minimo
		if (this.liv == Livello.OPERAIO) {
			if (stipendio < 1000 || stipendio >= 1200) {
				this.stipendio = 1000;
			} else
				this.stipendio = stipendio;
		} else if (this.liv == Livello.IMPIEGATO) {
			if (stipendio < 1200 || stipendio >= 1500) {
				this.stipendio = 1200;
			} else
				this.stipendio = stipendio;
		} else if (this.liv == Livello.QUADRO) {
			if (stipendio < 1500 || stipendio >= 2000) {
				this.stipendio = 1500;
			} else
				this.stipendio = stipendio;
		} else {
			if (stipendio < 2000) {
				this.stipendio = 2000;
			} else
				this.stipendio = stipendio;
		}
	}

	// metodi
	public void stampaDatiDipendente() {
		System.out.println("Dati dipendente:");
		System.out.println("matricola: " + this.matricola);
		System.out.println("stipendio: " + this.stipendio + "€");
		System.out.println("straordinari: " + this.importoOrarioStraordinario + "€");
		System.out.println("livello: " + this.liv);
		System.out.println("dipartimento: " + this.dip);
	}

	public Livello promuovi() {
		if (this.liv == Livello.OPERAIO) {
			this.liv = Livello.IMPIEGATO;
			this.stipendio = stipendioBase * 1.2;
			return this.liv;
		} else if (this.liv == Livello.IMPIEGATO) {
			this.liv = Livello.QUADRO;
			this.stipendio = stipendioBase * 1.5;
			return this.liv;
		} else if (this.liv == Livello.QUADRO) {
			this.liv = Livello.DIRIGENTE;
			this.stipendio = stipendioBase * 2;
			return this.liv;
		} else {
			System.out.println("sei già dirigente");
			return this.liv;
		}
	}

	// get e set
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Dipartimento getDip() {
		return dip;
	}

	public void setDip(Dipartimento dip) {
		this.dip = dip;
	}

	public static double getStipendioBase() {
		return stipendioBase;
	}

	public int getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public Livello getLiv() {
		return liv;
	}

}
