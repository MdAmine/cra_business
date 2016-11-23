package com.app.business.dao;

import java.util.List;

import com.app.business.bo.Tache;
import com.mdamine.dao.GenericDao;

public interface TacheDao extends GenericDao<Tache, Long> {

	public Tache getTacheByTitle(String pTitle);

	public List<Tache> getTasksOfProject(Long idProject);
	
	public List<Tache> getUserTasks(Long idColl);

}
