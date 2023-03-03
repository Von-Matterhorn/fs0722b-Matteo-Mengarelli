package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Libro extends Elemento {

	private String autore;
	private String genere;

	public Libro() {
		super();
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [codiceISBN=" + this.getCodiceISBN() + ", titolo=" + this.getTitolo() + ", annoPubblicazione="
						+ this.getAnnoPubblicazione() + ", numeroPagine=" + this.getNumeroPagine() +", autore=" + autore + ", genere=" + genere + "]";
	}

}
