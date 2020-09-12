package com.monster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monster.persistence.entity.Azienda;

public interface AziendaRepository extends JpaRepository<Azienda, Long>{
	
	
	Azienda findByNome(String nome);
	Azienda findByEmail(String email);
	
	
}
