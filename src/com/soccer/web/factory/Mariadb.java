package com.soccer.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.soccer.web.pool.Constants;

public class Mariadb implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(Constants.MARIA_DRIVER);
			conn = DriverManager.getConnection(
					Constants.MARIA_URL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

	

}
