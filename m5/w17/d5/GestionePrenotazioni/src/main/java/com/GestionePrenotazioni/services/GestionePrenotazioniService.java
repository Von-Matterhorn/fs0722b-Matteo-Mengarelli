package com.GestionePrenotazioni.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionePrenotazioni.models.Edificio;
import com.GestionePrenotazioni.models.Postazione;
import com.GestionePrenotazioni.models.Prenotazione;
import com.GestionePrenotazioni.models.Utente;
import com.GestionePrenotazioni.repositories.EdificioRepository;
import com.GestionePrenotazioni.repositories.PostazioneRepository;
import com.GestionePrenotazioni.repositories.PrenotazioneRepository;
import com.GestionePrenotazioni.repositories.UtenteRepository;
import com.GestionePrenotazioni.utils.TipoPostazione;

@Service
public class GestionePrenotazioniService {

	@Autowired
	UtenteRepository utenteRepository;
	@Autowired
	EdificioRepository edificioRepository;
	@Autowired
	PostazioneRepository postazioneRepository;
	@Autowired
	PrenotazioneRepository prenotazioneRepository;

	// SEZIONE UTENTE

	public void UtenteSalvaAggiorna(Utente u) {
		utenteRepository.save(u);
		System.out.println("Utente salvato");
	}

	public void UtenteElimina(Utente u) {
		utenteRepository.delete(u);
		System.out.println("UtenteEliminato");
	}

	public Utente UtenteGetById(Integer id) {
		return utenteRepository.getById(id);
	}

	public List<Utente> UtenteGetAll() {
		return (List<Utente>) utenteRepository.findAll();
	}

	// SEZIONE EDIFICIO

	public void EdificioSalvaAggiorna(Edificio e) {
		edificioRepository.save(e);
		System.out.println("Edificio salvato");
	}

	public void EdificioElimina(Edificio e) {
		edificioRepository.delete(e);
		System.out.println("Edificio eliminato");
	}

	public Edificio EdificioGetById(Integer id) {
		return edificioRepository.getById(id);
	}

	public List<Edificio> EdificioGetAll() {
		return (List<Edificio>) edificioRepository.findAll();
	}

	// SEZIONE POSTAZIONE

	public void PostazioneSalvaAggiorna(Postazione p) {
		postazioneRepository.save(p);
		System.out.println("Postazione salvata");
	}

	public void PostazioneElimina(Postazione p) {
		postazioneRepository.delete(p);
		System.out.println("Postazione eliminata");
	}

	public Postazione PostazioneGetById(Integer id) {
		return postazioneRepository.getById(id);
	}

	public List<Postazione> PostazioneGetAll() {
		return (List<Postazione>) postazioneRepository.findAll();
	}

	public List<Postazione> PostazioneGetByCittaAndTipo(String citta, TipoPostazione tipo) {
		List<Postazione> res = new ArrayList<Postazione>();
		List<Postazione> postazioni = PostazioneGetAll();
		postazioni.forEach(p -> {
			if (p.getTipo().compareTo(tipo) == 0 && p.getEdificio().getCittà().equals(citta)) {
				res.add(p);
			}
		});
		if (res.isEmpty()) {
			System.out.println("Nessuna postazione trovata");
		}
		return res;
	}

	// SEZIONE PRENOTAZIONE
	static boolean vietato = false;

	public void PrenotazioneSalvaAggiorna(Prenotazione p) {

		List<Prenotazione> prenotazioni = PrenotazioneGetAll();
		for (int i = 0; i < prenotazioni.size(); i++) {

			if (prenotazioni.get(i).getPostazione().getPostazioneId() == p.getPostazione().getPostazioneId()
					&& prenotazioni.get(i).getDataPrenotazione().equals(p.getDataPrenotazione())) {
				vietato = true;
				System.out.println("La postazione è già occupata");
				break;
			}
			if (prenotazioni.get(i).getUtente().getUtenteId() == p.getUtente().getUtenteId()
					&& prenotazioni.get(i).getDataPrenotazione().equals(p.getDataPrenotazione())) {
				vietato = true;
				System.out.println("L'utente ha già una prenotazione questo giorno");
				break;
			}

		}

		if (!vietato) {
			prenotazioneRepository.save(p);
			System.out.println("Prenotazione salvata");
		}
		vietato = false;

	}

	public void PrenotazioneElimina(Prenotazione p) {
		prenotazioneRepository.delete(p);
		System.out.println("Prenotazione eliminata");
	}

	public Prenotazione PrenotazioneGetById(Integer id) {
		return prenotazioneRepository.getById(id);
	}

	public List<Prenotazione> PrenotazioneGetAll() {
		return (List<Prenotazione>) prenotazioneRepository.findAll();
	}

}
