package com.soccer.web.daoImpls;

import com.soccer.web.daos.ScheduleDao;

public class ScheduleDaoImpl implements ScheduleDao{
	private static ScheduleDaoImpl instance = new ScheduleDaoImpl();

	private static ScheduleDaoImpl getInstance() {
		return instance;
	}
	public ScheduleDaoImpl() {}
}
