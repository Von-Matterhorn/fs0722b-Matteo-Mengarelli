package com.GestionePrenotazioni.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer utenteId;
	@Column(unique = true)
	String username;
	private String nomeCompleto;
	@Column(unique = true)
	private String email;
	@OneToMany(mappedBy = "utente")
	private List<Prenotazione> prenotazione;

	@Override
	public String toString() {
		return "Utente [utenteId=" + utenteId + ", username=" + username + ", nomeCompleto=" + nomeCompleto + ", email="
				+ email + "]";
	}

}
