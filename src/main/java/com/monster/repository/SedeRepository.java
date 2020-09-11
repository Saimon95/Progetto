package com.monster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monster.persistence.entity.Azienda;
import com.monster.persistence.entity.Sede;

public interface SedeRepository extends JpaRepository<Sede, Long>{
	
	
	
	List<Sede> findByCitta(String Citta);
	List<Sede> findByRegione(String Regione);
	
}
