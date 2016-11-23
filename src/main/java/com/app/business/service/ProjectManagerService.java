package com.app.business.service;

import java.util.List;

import com.app.business.bo.Projet;
import com.app.business.bo.Tache;
import com.app.business.bo.Utilisateur;
import com.mdamine.dao.exceptions.EntityNotFoundException;

public interface ProjectManagerService extends CollaboraterService {

	public void addProject(Projet pProjet);

	public Projet getProjectById(Long pId) throws EntityNotFoundException;

	public List<Projet> getUserProjects(Long pId);

	public List<Projet> getAllProjects();

	public void deleteProject(Long pProjetId) throws EntityNotFoundException;

	public void deleteTask(Long pTaskId) throws EntityNotFoundException;

	public void updateProject(Projet pProjet);

	public List<Utilisateur> getAllUsers();

	public List<Utilisateur> getCollaborators();

	public List<Utilisateur> getChefMan();

	public Utilisateur getUserById(Long pId) throws EntityNotFoundException;

	public Utilisateur getUserByName(String n);

	public int getActualDuration(Projet p);

	public int getReelDuration(Projet p);

}
