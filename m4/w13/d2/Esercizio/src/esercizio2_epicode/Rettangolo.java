package esercizio2_epicode;

public class Rettangolo {

	// atributi
	int latoA;
	int latoB;

	// costruttore
	public Rettangolo(int a, int b) {

		this.latoA = a;
		this.latoB = b;

	}

	// metodi
	public int calcoloPerimetro() {

		return (this.latoA + this.latoB) * 2;
	}

	public int calcoloArea() {

		return this.latoA * this.latoB;
	}

}
