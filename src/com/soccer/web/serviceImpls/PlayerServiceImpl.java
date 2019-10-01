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
	private PlayerServiceImpl() {
		
		
	
	}
	@Override
	public boolean join(PlayerBean param) {
		return PlayerDaoImpl.getInstance().insertPlayer(param);

		
	}
	
	@Override
	public PlayerBean login(PlayerBean param) {
		System.out.println("★★★  6. 서비스임플에 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s ",
				param.getPId(),
				param.getSolar()));
		return PlayerDaoImpl.getInstance().selectBYPlayerIdSolar(param);
	}
	@Override
	public List<String> findPositions() {
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
