package com.soccer.web.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.pool.Constants;

public class ConnTest {
	public static void main (String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USERNAME, Constants.PASSWORD);
			if(conn != null) {
				System.out.println("연결 성공");
				stmt = conn.createStatement();
				rs = stmt.executeQuery("SELECT TEAM_NAME, \r\n" + 
						"       POSITION , \r\n" + 
						"       BACK_NO , \r\n" + 
						"       PLAYER_NAME , \r\n" + 
						"       HEIGHT \r\n" + 
						"FROM (SELECT TEAM_NAME, TEAM_ID\r\n" + 
						"      FROM TEAM)\r\n" + 
						"        JOIN \r\n" + 
						"           (SELECT POSITION, BACK_NO, PLAYER_NAME, HEIGHT, TEAM_ID\r\n" + 
						"            FROM PLAYER\r\n" + 
						"            WHERE TEAM_ID IN ('K07', 'K08', 'K09')\r\n" + 
						"            AND POSITION IN ('GK', 'MF'))\r\n" + 
						"       USING(TEAM_ID)");
				List<String> list = new ArrayList<>();
				while(rs.next()) {
					
					list.add(rs.getString("PLAYER_NAME"));
				
				}
				System.out.println("선수들의 수:" + list);
			}else {
				System.out.println("연결 실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
