package com.app.business.bo;

import java.util.Date;

public class Cra {

	private Long id;
	private String title;
	private Date dateDebut;
	private Date dateFin;
	private String RAF;
	private String causeAbsence;
	private Utilisateur utilisateur;
	private Tache tache;

	public Cra() {
	}

	public Cra(String title, Date dateDebut, Date dateFin) {
		this.title = title;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Cra(String title, Date dateDebut, Date dateFin, Utilisateur utilisateur, Tache tache, String raf) {
		this.title = title;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.utilisateur = utilisateur;
		this.tache = tache;
		RAF = raf;
	}

	public Cra(String title, Date dateDebut, Date dateFin, Utilisateur utilisateur, String causeAbsence) {
		this.title = title;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.causeAbsence = causeAbsence;
		this.utilisateur = utilisateur;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}

	public String getRAF() {
		return RAF;
	}

	public void setRAF(String rAF) {
		RAF = rAF;
	}

	public String getCauseAbsence() {
		return causeAbsence;
	}

	public void setCauseAbsence(String causeAbsence) {
		this.causeAbsence = causeAbsence;
	}

}