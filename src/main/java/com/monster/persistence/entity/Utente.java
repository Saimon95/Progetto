package jpaProject;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the utente database table.
 * 
 */
@Entity
@Table(name="utente")
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String cognome;

	private String cv;

	@Temporal(TemporalType.DATE)
	@Column(name="data_nascita")
	private Date dataNascita;

	private String email;

	private String nome;

	private String password;

	private String telefono;

	//bi-directional many-to-one association to Candidatura
	@OneToMany(mappedBy="utente")
	private List<Candidatura> candidaturas;

	//bi-directional many-to-one association to UtenteCompetenza
	@OneToMany(mappedBy="utente")
	private List<UtenteCompetenza> utenteCompetenzas;

	//bi-directional many-to-one association to UtenteEsperienza
	@OneToMany(mappedBy="utente")
	private List<UtenteEsperienza> utenteEsperienzas;

	//bi-directional many-to-one association to UtentePercorso
	@OneToMany(mappedBy="utente")
	private List<UtentePercorso> utentePercorsos;

	public Utente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCv() {
		return this.cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public Date getDataNascita() {
		return this.dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Candidatura> getCandidaturas() {
		return this.candidaturas;
	}

	public void setCandidaturas(List<Candidatura> candidaturas) {
		this.candidaturas = candidaturas;
	}

	public Candidatura addCandidatura(Candidatura candidatura) {
		getCandidaturas().add(candidatura);
		candidatura.setUtente(this);

		return candidatura;
	}

	public Candidatura removeCandidatura(Candidatura candidatura) {
		getCandidaturas().remove(candidatura);
		candidatura.setUtente(null);

		return candidatura;
	}

	public List<UtenteCompetenza> getUtenteCompetenzas() {
		return this.utenteCompetenzas;
	}

	public void setUtenteCompetenzas(List<UtenteCompetenza> utenteCompetenzas) {
		this.utenteCompetenzas = utenteCompetenzas;
	}

	public UtenteCompetenza addUtenteCompetenza(UtenteCompetenza utenteCompetenza) {
		getUtenteCompetenzas().add(utenteCompetenza);
		utenteCompetenza.setUtente(this);

		return utenteCompetenza;
	}

	public UtenteCompetenza removeUtenteCompetenza(UtenteCompetenza utenteCompetenza) {
		getUtenteCompetenzas().remove(utenteCompetenza);
		utenteCompetenza.setUtente(null);

		return utenteCompetenza;
	}

	public List<UtenteEsperienza> getUtenteEsperienzas() {
		return this.utenteEsperienzas;
	}

	public void setUtenteEsperienzas(List<UtenteEsperienza> utenteEsperienzas) {
		this.utenteEsperienzas = utenteEsperienzas;
	}

	public UtenteEsperienza addUtenteEsperienza(UtenteEsperienza utenteEsperienza) {
		getUtenteEsperienzas().add(utenteEsperienza);
		utenteEsperienza.setUtente(this);

		return utenteEsperienza;
	}

	public UtenteEsperienza removeUtenteEsperienza(UtenteEsperienza utenteEsperienza) {
		getUtenteEsperienzas().remove(utenteEsperienza);
		utenteEsperienza.setUtente(null);

		return utenteEsperienza;
	}

	public List<UtentePercorso> getUtentePercorsos() {
		return this.utentePercorsos;
	}

	public void setUtentePercorsos(List<UtentePercorso> utentePercorsos) {
		this.utentePercorsos = utentePercorsos;
	}

	public UtentePercorso addUtentePercorso(UtentePercorso utentePercorso) {
		getUtentePercorsos().add(utentePercorso);
		utentePercorso.setUtente(this);

		return utentePercorso;
	}

	public UtentePercorso removeUtentePercorso(UtentePercorso utentePercorso) {
		getUtentePercorsos().remove(utentePercorso);
		utentePercorso.setUtente(null);

		return utentePercorso;
	}

}