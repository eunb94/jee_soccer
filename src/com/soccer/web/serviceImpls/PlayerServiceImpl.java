package com.soccer.web.serviceImpls;

import java.util.List;

import com.soccer.web.daoImpls.PlayerDaoImpl;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	private static PlayerServiceImpl instance = new PlayerServiceImpl();
		
	public static PlayerServiceImpl getInstance() {
		return instance;
	}
	private PlayerServiceImpl() {}

	@Override
	public List<String> findPositions() {
		return PlayerDaoImpl.getInstance().findPositions();
	}

	@Override
	public List<PlayerBean> findByTeamidPosition(PlayerBean param) {
		return null;
	}

	@Override
	public List<PlayerBean> findByTeamidHeightName(PlayerBean param) {
		return null;
	}

}
