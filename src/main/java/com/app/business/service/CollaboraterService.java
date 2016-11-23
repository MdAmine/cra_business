package com.app.business.service;

import java.util.List;

import com.app.business.bo.Cra;
import com.app.business.bo.Tache;
import com.mdamine.dao.exceptions.EntityNotFoundException;

public interface CollaboraterService {

	public void addCra(Cra pCra);

	public Cra getCraById(Long pId) throws EntityNotFoundException;

	public List<Cra> getAllCras();

	public void deleteCra(Long pCraId) throws EntityNotFoundException;

	public void updateCra(Cra pCra);

	public Tache getTaskById(Long pId) throws EntityNotFoundException;

	public Tache getTaskByTitle(String t);

	public List<Tache> getTasksOfProject(Long idProject);

	public void addTask(Tache pTache);

	public List<Tache> getAllTasks();

	public void updateTask(Tache pTache);

	public List<Tache> getUserTasks(Long idColl);

	public List<Cra> getUserCras(Long idColl);
	
	public int getActualDuration(Tache t);

}
