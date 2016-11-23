package com.app.business.dao.impl;

import java.util.List;

import com.app.business.bo.Tache;
import com.app.business.dao.TacheDao;
import com.mdamine.dao.impl.GenericDaoImpl;

public class TacheDaoImpl extends GenericDaoImpl<Tache, Long> implements TacheDao {

	public TacheDaoImpl() {
		super(Tache.class);
	}

	public Tache getTacheByTitle(String pTitle) {
		return (Tache) getHibernateTemplate().find("from Tache where titre_tache=?", pTitle).get(0);
	}

	public List<Tache> getTasksOfProject(Long idProject) {
		return getHibernateTemplate().find("from Tache where id_projet=?", idProject);
	}

	public List<Tache> getUserTasks(Long idColl) {
		return getHibernateTemplate().find("from Tache where id_utilisateur=?", idColl);
	}
	

}
