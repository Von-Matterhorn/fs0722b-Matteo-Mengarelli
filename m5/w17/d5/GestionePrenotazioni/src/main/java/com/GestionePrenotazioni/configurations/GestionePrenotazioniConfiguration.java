package com.GestionePrenotazioni.configurations;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.GestionePrenotazioni.models.Edificio;
import com.GestionePrenotazioni.models.Postazione;
import com.GestionePrenotazioni.models.Prenotazione;
import com.GestionePrenotazioni.models.Utente;
import com.GestionePrenotazioni.utils.TipoPostazione;

public class GestionePrenotazioniConfiguration {

	@Bean
	@Scope("prototype")
	public Utente utente(String username, String nomeCompleto, String email) {
		Utente utente = new Utente();
		utente.setUsername(username);
		utente.setNomeCompleto(nomeCompleto);
		utente.setEmail(email);
		return utente;
	}

	@Bean
	@Scope("prototype")
	public Edificio edificio(String citta, String indirizzo, String nome) {
		Edificio edificio = new Edificio();
		edificio.setCittà(citta);
		edificio.setIndirizzo(indirizzo);
		edificio.setNome(nome);
		return edificio;
	}

	@Bean
	@Scope("prototype")
	public Postazione postazione(Edificio edificio, TipoPostazione tipo, String descrizione, int numeroMaxOccupanti) {
		Postazione postazione = new Postazione();
		postazione.setEdificio(edificio);
		postazione.setNumeroMassimoOccupanti(numeroMaxOccupanti);
		postazione.setTipo(tipo);
		postazione.setDescrizione(descrizione);
		return postazione;
	}

	@Bean
	@Scope("prototype")
	public Prenotazione prenotazione(Utente utente, Postazione postazione, LocalDate data) {
		Prenotazione prenotazione = new Prenotazione();
		prenotazione.setPostazione(postazione);
		prenotazione.setUtente(utente);
		prenotazione.setDataPrenotazione(data);
		return prenotazione;
	}
}
