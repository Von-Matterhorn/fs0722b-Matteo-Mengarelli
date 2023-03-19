package com.GestioneIncendiAzienda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestioneIncendiAzienda.models.Sonda;
import com.GestioneIncendiAzienda.repositories.SondaRepository;

@Service
public class SondaService {
	@Autowired
	SondaRepository sondaRepository;

	public Sonda sondaCrea(Sonda sn) {
		sondaRepository.save(sn);
		return sn;
	}

	public Sonda sondaUpdate(Sonda sn) {

		sondaRepository.save(sn);
		return sn;
	}

	public void sondaElimina(Sonda sn) {
		sondaRepository.delete(sn);
	}

	public Sonda sondaTrovaTramiteId(long id) {
		return sondaRepository.findById(id).get();
	}

	public List<Sonda> sondaTrovaTutti() {
		return (List<Sonda>) sondaRepository.findAll();
	}
}
