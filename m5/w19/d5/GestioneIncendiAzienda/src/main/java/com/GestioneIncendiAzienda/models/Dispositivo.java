package com.GestioneIncendiAzienda.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public abstract class Dispositivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
}
