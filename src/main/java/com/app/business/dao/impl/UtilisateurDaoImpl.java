package com.app.business.dao.impl;

import java.util.List;

import org.springframework.orm.ObjectRetrievalFailureException;

import com.app.business.bo.Utilisateur;
import com.app.business.dao.UtilisateurDao;
import com.mdamine.dao.impl.GenericDaoImpl;

public class UtilisateurDaoImpl extends GenericDaoImpl<Utilisateur, Long> implements UtilisateurDao {

	public UtilisateurDaoImpl() {
		super(Utilisateur.class);
	}

	public Utilisateur getUserByName(String n) {
		return (Utilisateur) getHibernateTemplate().find("from Utilisateur where nom=?", n).get(0);
	}

	public Utilisateur getUserByLogin(String pLogin) {

		List users = getHibernateTemplate().find("from Utilisateur where login = ? ", pLogin);

		if (users == null || users.size() == 0 || users.size() != 1)
			throw new ObjectRetrievalFailureException(Utilisateur.class, pLogin);

		return (Utilisateur) users.get(0);
	}

	public List<Utilisateur> getCollaborators() {
		return getHibernateTemplate().find("from Utilisateur where id_role = 3");
	}

	public List<Utilisateur> getChefMan() {
		return getHibernateTemplate().find("from Utilisateur where id_role = 2");
	}
}
