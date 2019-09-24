package com.soccer.web.daos;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerDao {
	
	 // 2. 포지션 종류(중복제거,없으면 빈공간)
	 
	public List<String> findPositions();
	
	public List<PlayerBean> findByTeamidPosition(PlayerBean param);
	//
	public List<PlayerBean> findByTeamidHeightName(PlayerBean param);
	//
}
