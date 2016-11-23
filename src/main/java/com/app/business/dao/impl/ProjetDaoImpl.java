package com.app.business.dao.impl;

import java.util.List;

import com.app.business.bo.Projet;
import com.app.business.bo.Utilisateur;
import com.app.business.dao.ProjetDao;
import com.mdamine.dao.impl.GenericDaoImpl;

public class ProjetDaoImpl extends GenericDaoImpl<Projet, Long> implements ProjetDao {

	public ProjetDaoImpl() {
		super(Projet.class);
	}

	public List<Projet> getUserProjects(Long pId) {
		return getHibernateTemplate().find("from Projet where id_utilisateur=?", pId);
	}

}
