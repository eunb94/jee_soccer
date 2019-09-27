package com.soccer.web.daoImpls;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.soccer.web.pool.Constants;
import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;

public class PlayerDaoImpl implements PlayerDao{
	private static PlayerDaoImpl instance = new PlayerDaoImpl();
	public static PlayerDaoImpl getInstance() {	return instance;}
	private PlayerDaoImpl() {}
	
	
	@Override
	public PlayerBean selectBYPlayerIdSolar(PlayerBean param) {
		System.out.println("★★★  8. DAO 임플에 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s ",
				param.getPId(),
				param.getSolar()));

		
		PlayerBean player = null;
		String sql = "SELECT * \n" + 
				"FROM PLAYER  \n" + 
				"WHERE PLAYER_ID LIKE ? \n" + 
				"    AND SOLAR LIKE ?";
		try {
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getPId());
			stmt.setString(2, param.getSolar());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				player = new PlayerBean();
				player.setBackNo(rs.getString("BACK_NO"));
				player.setBDate(rs.getString("BIRTH_DATE"));
				player.setHeight(rs.getString("HEIGHT"));
				player.setEPlayerName(rs.getString("E_PLAYER_NAME"));
				player.setJoinY(rs.getString("JOIN_YYYY"));
				player.setNation(rs.getString("NATION"));
				player.setPId(rs.getString("PLAYER_ID"));
				player.setPName(rs.getString("PLAYER_NAME"));
				player.setPosition(rs.getString("POSITION"));
				player.setSolar(rs.getString("SOLAR"));
				player.setTeamId(rs.getString("TEAM_ID"));
				player.setWeight(rs.getString("WEIGHT"));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("9. 변환된 값 : " + player.toString());		
		return player;
	}
	
	
	@Override
	public List<String> selectPositions() {
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
	
	@Override
	public List<PlayerBean> selectByTeamidPosition(PlayerBean param) {

		
		return null;
	}
	@Override
	public List<PlayerBean> selectByTeamidHeightName(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<PlayerBean> selectByMany(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<>();
		String sql = "? ? ? ?";
		try {
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getPId());
			stmt.setString(2, param.getSolar());
			stmt.setString(3, param.getBackNo());
			stmt.setString(4, param.getBDate());
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}



