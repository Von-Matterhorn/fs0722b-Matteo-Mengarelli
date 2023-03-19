package com.GestioneIncendiAzienda.factories;

import org.springframework.stereotype.Repository;

import com.GestioneIncendiAzienda.models.Dispositivo;
import com.GestioneIncendiAzienda.models.Sonda;

//ho dovuto mettere @Repository altrimenti per qualche motivo non mi era concesso fare l'autowired di questa classe nel runner, avrei potuto non mettere @Repository ma poi avrei dovuto inizializzare la variabile a mano nel runner
@Repository
public class SondaFactory extends DispositivoFactory {
	public Dispositivo create() {
		return new Sonda();
	}
}
