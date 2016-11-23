package com.app.business.dao.impl;

import com.app.business.bo.Role;
import com.app.business.dao.RoleDao;
import com.mdamine.dao.impl.GenericDaoImpl;

public class RoleDaoImpl extends GenericDaoImpl<Role, Long> implements RoleDao {

	public RoleDaoImpl() {
		super(Role.class);
	}

	public Role getRoleByName(String pRole) {

		return (Role) getHibernateTemplate().find("from Role where role_name=?", pRole).get(0);
	}

}
