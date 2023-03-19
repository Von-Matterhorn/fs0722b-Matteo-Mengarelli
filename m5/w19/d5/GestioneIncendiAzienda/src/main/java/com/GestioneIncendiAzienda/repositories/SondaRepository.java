package com.GestioneIncendiAzienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestioneIncendiAzienda.models.Sonda;

@Repository
public interface SondaRepository extends JpaRepository<Sonda, Long> {

}
