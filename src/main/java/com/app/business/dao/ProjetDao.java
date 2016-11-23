package com.app.business.dao;

import java.util.List;

import com.app.business.bo.Projet;
import com.mdamine.dao.GenericDao;

public interface ProjetDao extends GenericDao<Projet, Long> {
	public List<Projet> getUserProjects(Long pId);
}
