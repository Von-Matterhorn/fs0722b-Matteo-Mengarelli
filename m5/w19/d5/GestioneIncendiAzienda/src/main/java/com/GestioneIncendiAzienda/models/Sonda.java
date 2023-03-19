package com.GestioneIncendiAzienda.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Sonda extends Dispositivo {
	private int longitudine;
	private int latitudine;
	private int livelloFumo;
	@ManyToOne
	@JoinColumn(name = "centroid")
	private CentroControllo centro;

	public void setLongitudine(int longitudine) {
		this.longitudine = longitudine;
	}

	public void setLatitudine(int latitudine) {
		this.latitudine = latitudine;
	}

	public void setLivelloFumo(int livelloFumo) {
		this.livelloFumo = livelloFumo;
		if (livelloFumo > 5) {
			centro.allarmeIncendio(id, longitudine, latitudine, livelloFumo);
		}
	}

	public void setCentro(CentroControllo centro) {
		this.centro = centro;
	}

}
