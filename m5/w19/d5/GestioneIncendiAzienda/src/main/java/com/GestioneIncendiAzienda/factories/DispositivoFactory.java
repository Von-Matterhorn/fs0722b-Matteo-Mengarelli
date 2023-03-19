package com.GestioneIncendiAzienda.factories;

import com.GestioneIncendiAzienda.models.Dispositivo;

public abstract class DispositivoFactory {
	// ho deciso di fare anche una factory astratta implementabile da tutte le altre
	// factory, per ora avrò solo un'altra factory ma in futuro non si sa mai
	public abstract Dispositivo create();
}
