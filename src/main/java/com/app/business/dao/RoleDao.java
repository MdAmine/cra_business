package com.app.business.dao;

import com.app.business.bo.Role;
import com.mdamine.dao.GenericDao;

public interface RoleDao extends GenericDao<Role, Long> {

	public Role getRoleByName(String pRole);
	
}
