package com.GestionePrenotazioni.models;

import java.util.List;

import com.GestionePrenotazioni.utils.TipoPostazione;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Postazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer postazioneId;

	private String descrizione;
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;
	private int numeroMassimoOccupanti;

	@ManyToOne
	@JoinColumn(name = "edificioid")
	private Edificio edificio;

	@OneToMany(mappedBy = "postazione")
	private List<Prenotazione> prenotazione;

	@Override
	public String toString() {
		return "Postazione [postazioneId=" + postazioneId + ", descrizione=" + descrizione + ", tipo=" + tipo
				+ ", numeroMassimoOccupanti=" + numeroMassimoOccupanti + "]";
	}

}
