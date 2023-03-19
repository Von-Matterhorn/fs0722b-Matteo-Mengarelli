package com.GestioneIncendiAzienda.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CentroControllo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public void allarmeIncendio(Long idSonda, int longitudine, int latitudine, int livelloFumo) {
		System.out.println("http://host/alarm?=idsonda=[" + idSonda + "]&lat=[" + latitudine + "]&lon=[" + longitudine
				+ "]&smokelevel=[" + livelloFumo + "]");
	}
}
