package com.app.business.dao.impl;

import java.util.List;

import com.app.business.bo.Cra;
import com.app.business.dao.CraDao;
import com.mdamine.dao.impl.GenericDaoImpl;

public class CraDaoImpl extends GenericDaoImpl<Cra, Long> implements CraDao {

	public CraDaoImpl() {
		super(Cra.class);
	}

	public List<Cra> getUserCras(Long idColl) {
		return getHibernateTemplate().find("from Cra where id_utilisateur=?", idColl);
	}

}
