package com.soccer.web.daoImpls;

import com.soccer.web.daos.TeamDao;

public class TeamDaoImpl implements TeamDao{
	private static TeamDaoImpl instance = new TeamDaoImpl();

	private static TeamDaoImpl getInstance() {
		return instance;
	}
	public TeamDaoImpl() {}
	

}
