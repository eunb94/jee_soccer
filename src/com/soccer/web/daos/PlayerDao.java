package com.soccer.web.daos;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerDao {
	// 0. 조인
	public boolean insertPlayer(PlayerBean param);
	
	public PlayerBean selectBYPlayerIdSolar(PlayerBean param);
	 // 2. 포지션 종류(중복제거,없으면 빈공간)
	 
	public List<String> selectPositions();
	
	public List<PlayerBean> selectByTeamidPosition(PlayerBean param);
	//
	public List<PlayerBean> selectByTeamidHeightName(PlayerBean param);

}
