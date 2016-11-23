package com.app.business.service;

import java.util.List;

import com.app.business.bo.Role;
import com.app.business.bo.Utilisateur;
import com.app.business.service.exception.DuplicateLoginException;
import com.mdamine.dao.exceptions.EntityNotFoundException;

public interface UserManager {

	public void addUser(Utilisateur user) throws DuplicateLoginException;

	public List<Role> getAllRoles();

	public List<Utilisateur> getAllUser();

	public void deleteUser(Long id) throws EntityNotFoundException;

	public Role getRoleByName(String pRoleName);

	public Utilisateur getUserByLogin(String pLogin);

	public void updateUtilisateur(Utilisateur pUtilisateur);

}
