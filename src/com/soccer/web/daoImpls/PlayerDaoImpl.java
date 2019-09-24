package com.soccer.web.daoImpls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.soccer.web.pool.Constants;
import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;

public class PlayerDaoImpl implements PlayerDao{
	private static PlayerDaoImpl instance = new PlayerDaoImpl();
	private static Connection conn;
	public static PlayerDaoImpl getInstance() {	return instance;}
	private PlayerDaoImpl() {}
	

	@Override
	public List<String> findPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION position \n" + 
					"FROM PLAYER";
							ResultSet rs = DatabaseFactory
										.createDatabase(Constants.VENDOR)
										.getConnection()
										.prepareStatement(sql)
										.executeQuery();

			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return positions;
	}


	private Object getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<PlayerBean> findByTeamidPosition(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<PlayerBean> findByTeamidHeightName(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}
}




