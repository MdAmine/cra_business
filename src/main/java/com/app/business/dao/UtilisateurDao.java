package com.app.business.dao;

import java.util.List;

import com.app.business.bo.Utilisateur;
import com.mdamine.dao.GenericDao;

public interface UtilisateurDao extends GenericDao<Utilisateur, Long> {

	public Utilisateur getUserByName(String n);

	public Utilisateur getUserByLogin(String pLogin);
	
	public List<Utilisateur> getCollaborators();
	
	public List<Utilisateur> getChefMan();

}
