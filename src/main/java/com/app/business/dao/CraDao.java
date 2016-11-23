package com.app.business.dao;

import java.util.List;

import com.app.business.bo.Cra;
import com.mdamine.dao.GenericDao;

public interface CraDao extends GenericDao<Cra, Long> {

	public List<Cra> getUserCras(Long idColl);

}
