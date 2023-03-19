package com.GestioneIncendiAzienda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestioneIncendiAzienda.models.CentroControllo;
@Repository
public interface CentroControlloRepository extends JpaRepository<CentroControllo, Long> {

}
