package com.GestioneIncendiAzienda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestioneIncendiAzienda.models.CentroControllo;
import com.GestioneIncendiAzienda.repositories.CentroControlloRepository;

@Service
public class CentroControlloService {

	@Autowired
	CentroControlloRepository centroRepository;

	public CentroControllo centroCrea(CentroControllo ct) {
		centroRepository.save(ct);
		return ct;
	}

	public CentroControllo centroUpdate(CentroControllo ct) {

		centroRepository.save(ct);
		return ct;
	}

	public void centroElimina(CentroControllo ct) {
		centroRepository.delete(ct);
	}

	public CentroControllo centroTrovaTramiteId(Long id) {
		return centroRepository.findById(id).get();
	}

	public List<CentroControllo> centroTrovaTutti() {
		return (List<CentroControllo>) centroRepository.findAll();
	}

}
