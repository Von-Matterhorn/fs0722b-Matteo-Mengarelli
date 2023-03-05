package com.GestionePrenotazioni.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Edificio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer edificioId;
	private String nome;
	@Column(unique = true)
	private String indirizzo;
	private String città;
	@OneToMany(mappedBy = "edificio")
	private List<Postazione> postazione;

	@Override
	public String toString() {
		return "Edificio [edificioId=" + edificioId + ", nome=" + nome + ", indirizzo=" + indirizzo + ", città=" + città
				+ ", postazione=" + postazione + "]";
	}

}