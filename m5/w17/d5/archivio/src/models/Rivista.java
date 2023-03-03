package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import utils.periodicità;

@Entity
public class Rivista extends Elemento {

	@Enumerated(EnumType.STRING)
	private periodicità periodicità;

	public Rivista() {

	}

	public periodicità getPeriodicità() {
		return periodicità;
	}

	public void setPeriodicità(periodicità periodicità) {
		this.periodicità = periodicità;
	}

	@Override
	public String toString() {
		return "Rivista [codiceISBN=" + this.getCodiceISBN() + ", titolo=" + this.getTitolo() + ", annoPubblicazione="
				+ this.getAnnoPubblicazione() + ", numeroPagine=" + this.getNumeroPagine() + ", periodicit�="
				+ periodicità + "]";
	}

}
