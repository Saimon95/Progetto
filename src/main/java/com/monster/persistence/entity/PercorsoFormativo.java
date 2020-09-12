package com.monster.persistence.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the percorso_formativo database table.
 * 
 */
@Entity
@Table(name="percorso_formativo")
@NamedQuery(name="PercorsoFormativo.findAll", query="SELECT p FROM PercorsoFormativo p")
public class PercorsoFormativo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String descrizione;

	private String formazione;

	//bi-directional many-to-one association to UtentePercorso
	@OneToMany(mappedBy="percorsoFormativo")
	private List<UtentePercorso> utentePercorsos;

	public PercorsoFormativo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getFormazione() {
		return this.formazione;
	}

	public void setFormazione(String formazione) {
		this.formazione = formazione;
	}

	public List<UtentePercorso> getUtentePercorsos() {
		return this.utentePercorsos;
	}

	public void setUtentePercorsos(List<UtentePercorso> utentePercorsos) {
		this.utentePercorsos = utentePercorsos;
	}

	public UtentePercorso addUtentePercorso(UtentePercorso utentePercorso) {
		getUtentePercorsos().add(utentePercorso);
		utentePercorso.setPercorsoFormativo(this);

		return utentePercorso;
	}

	public UtentePercorso removeUtentePercorso(UtentePercorso utentePercorso) {
		getUtentePercorsos().remove(utentePercorso);
		utentePercorso.setPercorsoFormativo(null);

		return utentePercorso;
	}

}