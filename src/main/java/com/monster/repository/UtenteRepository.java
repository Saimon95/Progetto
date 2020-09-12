package com.monster.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.monster.persistence.entity.Utente;


public interface UtenteRepository extends JpaRepository<Utente, Integer>{
	
	Utente findByEmail(String email);
	//@Query("SELECT u FROM User u WHERE x.age >= ?1")
	List<Utente> findByDataNascitaGreaterThanEqual(Date dataNascita);

}
