package com.monster.persistence.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utente_competenza database table.
 * 
 */
@Entity
@Table(name="utente_competenza")
@NamedQuery(name="UtenteCompetenza.findAll", query="SELECT u FROM UtenteCompetenza u")
public class UtenteCompetenza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	//bi-directional many-to-one association to Competenza
	@ManyToOne
	@JoinColumn(name="id_competenza")
	private Competenza competenza;

	//bi-directional many-to-one association to Utente
	@ManyToOne
	@JoinColumn(name="id_utente")
	private Utente utente;

	public UtenteCompetenza() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Competenza getCompetenza() {
		return this.competenza;
	}

	public void setCompetenza(Competenza competenza) {
		this.competenza = competenza;
	}

	public Utente getUtente() {
		return this.utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

}