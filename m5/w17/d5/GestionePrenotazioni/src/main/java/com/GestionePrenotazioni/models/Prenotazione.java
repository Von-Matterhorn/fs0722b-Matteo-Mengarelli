package com.GestionePrenotazioni.models;

import java.time.LocalDate;
import java.util.List;

import com.GestionePrenotazioni.utils.TipoPostazione;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prenotazioneId;

	@ManyToOne
	@JoinColumn(name = "utenteid")
	private Utente utente;

	@ManyToOne
	@JoinColumn(name = "postazioneid")
	private Postazione postazione;

	private LocalDate dataPrenotazione;

	@Override
	public String toString() {
		return "Prenotazione [prenotazioneId=" + prenotazioneId + ", utente=" + utente + ", postazione=" + postazione
				+ ", dataPrenotazione=" + dataPrenotazione + "]";
	}

}
