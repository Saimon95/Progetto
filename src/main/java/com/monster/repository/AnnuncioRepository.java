package com.monster.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monster.persistence.entity.Annuncio;

public interface AnnuncioRepository extends JpaRepository<Annuncio, Integer>{
	List<Annuncio> findByDataPubblicazioneGreaterThanEqual(Date dataPubblicazione);
	List<Annuncio>findByContratto(String contratto);
}
