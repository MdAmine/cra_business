package com.app.business.bo;

import java.util.Date;
import java.util.Set;

public class Utilisateur {

	private Long id;
	private String login;
	private String password;
	private String matricule;
	private String nom;
	private String prenom;
	private boolean enabled = true;
	private boolean accountNotExpired = true;
	private boolean accountNotLocked = true;
	private Date lastAccessDate;
	private Date beforeLastAccessDate;
	private Role role;
	private Set<Projet> projets;
	private Set<Tache> taches;
	private Set<Cra> cras;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isAccountNotExpired() {
		return accountNotExpired;
	}

	public void setAccountNotExpired(boolean accountNotExpired) {
		this.accountNotExpired = accountNotExpired;
	}

	public boolean isAccountNotLocked() {
		return accountNotLocked;
	}

	public void setAccountNotLocked(boolean accountNotLocked) {
		this.accountNotLocked = accountNotLocked;
	}

	public Date getLastAccessDate() {
		return lastAccessDate;
	}

	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Set<Projet> getProjets() {
		return projets;
	}

	public void setProjets(Set<Projet> projets) {
		this.projets = projets;
	}

	public Set<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	public Set<Cra> getCras() {
		return cras;
	}

	public void setCras(Set<Cra> cras) {
		this.cras = cras;
	}

	public Date getBeforeLastAccessDate() {
		return beforeLastAccessDate;
	}

	public void setBeforeLastAccessDate(Date beforeLastAccessDate) {
		this.beforeLastAccessDate = beforeLastAccessDate;
	}

	@Override
	public String toString() {
		return nom;
	}

}
