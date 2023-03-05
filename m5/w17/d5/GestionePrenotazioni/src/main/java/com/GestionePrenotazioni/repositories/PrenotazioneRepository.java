package com.GestionePrenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.GestionePrenotazioni.models.Prenotazione;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer> {

}
