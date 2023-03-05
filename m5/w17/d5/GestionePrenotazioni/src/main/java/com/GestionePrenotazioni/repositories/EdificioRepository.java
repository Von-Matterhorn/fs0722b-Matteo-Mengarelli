package com.GestionePrenotazioni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionePrenotazioni.models.Edificio;

public interface EdificioRepository extends JpaRepository<Edificio, Integer> {

}
