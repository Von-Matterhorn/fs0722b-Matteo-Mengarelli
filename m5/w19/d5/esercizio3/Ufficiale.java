package it.epicode.exercises.week7.giorno1.esercizio3;

public abstract class Ufficiale {

	Ufficiale superiore = null;

	public void setSuperiore(Ufficiale ufficiale) {
		this.superiore = ufficiale;
	}

	public abstract void check(int stipendio);

}