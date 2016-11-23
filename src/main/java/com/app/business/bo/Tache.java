package com.app.business.bo;

import java.util.Set;

public class Tache {

	private Long id;
	private String titreTache;
	private int duree;
	private int dureeActuelle = 0;
	private boolean completed;
	private Projet projet;
	private Utilisateur utilisateur;
	private Set<Cra> cras;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitreTache() {
		return titreTache;
	}

	public void setTitreTache(String titreTache) {
		this.titreTache = titreTache;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Set<Cra> getCras() {
		return cras;
	}

	public void setCras(Set<Cra> cras) {
		this.cras = cras;
	}

	public int getDureeActuelle() {
		return dureeActuelle;
	}

	public void setDureeActuelle(int dureeActuelle) {
		this.dureeActuelle = dureeActuelle;
	}

	@Override
	public String toString() {
		return titreTache;
	}

}
