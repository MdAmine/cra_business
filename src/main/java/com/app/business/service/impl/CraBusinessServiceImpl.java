package com.app.business.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.app.business.bo.Cra;
import com.app.business.bo.Projet;
import com.app.business.bo.Role;
import com.app.business.bo.Tache;
import com.app.business.bo.Utilisateur;
import com.app.business.dao.CraDao;
import com.app.business.dao.ProjetDao;
import com.app.business.dao.RoleDao;
import com.app.business.dao.TacheDao;
import com.app.business.dao.UtilisateurDao;
import com.app.business.service.AdminService;
import com.mdamine.dao.exceptions.EntityNotFoundException;

public class CraBusinessServiceImpl implements AdminService {

	private ProjetDao projetDao;
	private UtilisateurDao utilisateurDao;
	private RoleDao roleDao;
	private TacheDao tacheDao;
	private CraDao craDao;

	public void addProject(Projet pProjet) {
		projetDao.create(pProjet);
	}

	public List<Projet> getAllProjects() {
		return projetDao.getAll();
	}

	public void addUser(Utilisateur pUser) {
		utilisateurDao.create(pUser);
	}

	public List<Utilisateur> getAllUsers() {
		return utilisateurDao.getAll();
	}

	public void deleteUser(Long id) throws EntityNotFoundException {
		utilisateurDao.delete(id);
	}

	public void addRole(Role pRole) {
		roleDao.create(pRole);
	}

	public List<Role> getAllRoles() {
		return roleDao.getAll();
	}

	public void deleteRole(Long id) throws EntityNotFoundException {
		roleDao.delete(id);
	}

	public void deleteProject(Long id) throws EntityNotFoundException {
		projetDao.delete(id);
	}

	public void updateProject(Projet pProjet) {
		projetDao.update(pProjet);
	}

	public Projet getProjectById(Long pId) throws EntityNotFoundException {
		return projetDao.findById(pId);
	}

	public void addCra(Cra pCra) {
		craDao.create(pCra);
	}

	public Cra getCraById(Long pId) throws EntityNotFoundException {
		return craDao.findById(pId);
	}

	public List<Cra> getAllCras() {
		return craDao.getAll();
	}

	public void deleteCra(Long pCraId) throws EntityNotFoundException {
		craDao.delete(pCraId);
	}

	public void updateCra(Cra pCra) {
		craDao.update(pCra);
	}

	public Tache getTaskById(Long pId) throws EntityNotFoundException {
		return tacheDao.findById(pId);
	}

	public Utilisateur getUserById(Long pId) throws EntityNotFoundException {
		return utilisateurDao.findById(pId);
	}

	public void addTask(Tache pTache) {
		tacheDao.create(pTache);
	}

	public List<Tache> getAllTasks() {
		return tacheDao.getAll();
	}

	public Tache getTaskByTitle(String t) {
		return tacheDao.getTacheByTitle(t);
	}

	public List<Tache> getTasksOfProject(Long idProject) {
		return tacheDao.getTasksOfProject(idProject);
	}

	public Utilisateur getUserByName(String n) {
		return utilisateurDao.getUserByName(n);
	}

	/* get/set */
	public ProjetDao getProjetDao() {
		return projetDao;
	}

	public void setProjetDao(ProjetDao projetDao) {
		this.projetDao = projetDao;
	}

	public UtilisateurDao getUtilisateurDao() {
		return utilisateurDao;
	}

	public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}

	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public TacheDao getTacheDao() {
		return tacheDao;
	}

	public void setTacheDao(TacheDao tacheDao) {
		this.tacheDao = tacheDao;
	}

	public CraDao getCraDao() {
		return craDao;
	}

	public void setCraDao(CraDao craDao) {
		this.craDao = craDao;
	}
	/* end get/set */

	public Role getRoleByName(String pRoleName) {
		return null;
	}

	public List<Projet> getUserProjects(Long pId) {
		return projetDao.getUserProjects(pId);
	}

	public List<Utilisateur> getCollaborators() {
		return utilisateurDao.getCollaborators();
	}

	public List<Utilisateur> getChefMan() {
		return utilisateurDao.getChefMan();
	}

	public List<Tache> getUserTasks(Long idColl) {
		return tacheDao.getUserTasks(idColl);
	}

	public List<Cra> getUserCras(Long idColl) {
		return craDao.getUserCras(idColl);
	}

	public void updateTask(Tache pTache) {
		tacheDao.update(pTache);
	}

	public int getCountOfProjectCreatedToday() {
		List<Projet> l = new ArrayList<Projet>();
		l = getAllProjects();
		int c = 0;
		Date today = new Date();
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getDateCreation() != null) {
				if (l.get(i).getDateCreation().getDay() == today.getDay()
						&& l.get(i).getDateCreation().getMonth() == today.getMonth())
					c++;
			}
		}
		return c;
	}

	public int getCountOfCollConnectedToday() {
		List<Utilisateur> l = new ArrayList<Utilisateur>();
		l = getCollaborators();
		int c = 0;
		Date today = new Date();
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getLastAccessDate() != null) {
				if (l.get(i).getLastAccessDate().getDay() == today.getDay()
						&& l.get(i).getLastAccessDate().getMonth() == today.getMonth())
					c++;
			}
		}
		return c;
	}

	public int getCountOfChefConnectedToday() {
		List<Utilisateur> l = new ArrayList<Utilisateur>();
		l = getChefMan();
		int c = 0;
		Date today = new Date();
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getLastAccessDate() != null) {
				if (l.get(i).getLastAccessDate().getDay() == today.getDay()
						&& l.get(i).getLastAccessDate().getMonth() == today.getMonth())
					c++;
			}
		}
		return c;
	}

	public void deleteTask(Long pTaskId) throws EntityNotFoundException {
		tacheDao.delete(pTaskId);
	}

	public int getActualDuration(Tache t) {

		List<Cra> cras = new ArrayList<Cra>();

		cras.addAll(t.getCras());
		int s = 0;
		for (int i = 0; i < cras.size(); i++) {
			if (cras.get(i).getCauseAbsence() == null) {
				s += (cras.get(i).getDateFin().getHours() - cras.get(i).getDateDebut().getHours());
			}
		}

		return s;
	}

	public int getActualDuration(Projet p) {

		List<Tache> taches = new ArrayList<Tache>();
		taches.addAll(p.getTaches());
		int s = 0;
		for (int i = 0; i < taches.size(); i++) {
			s += getActualDuration(taches.get(i));
		}
		return s;
	}

	public int getReelDuration(Projet p) {
		List<Tache> taches = new ArrayList<Tache>();
		taches.addAll(p.getTaches());
		int s = 0;
		for (int i = 0; i < taches.size(); i++) {
			s += taches.get(i).getDuree();
		}
		return s;
	}

}
