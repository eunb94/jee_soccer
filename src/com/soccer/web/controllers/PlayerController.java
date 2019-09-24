package com.soccer.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceImpls.PlayerServiceImpl;
import com.soccer.web.services.PlayerService;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("컨트롤러 들어옴");
		String action = request.getParameter("action");
		System.out.println("액션 : " + action);
		PlayerBean player = null;
		
		switch(action) {
		case "move" : 
		break;
		
		case "find2" :		
		request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
		break;
		
		case "find4" :
			player = new PlayerBean();
			String position = request.getParameter("position");
			String teamId = request.getParameter("teamId");
			player.setPosition(position);
			player.setTeamId(teamId);
			request.setAttribute("players", PlayerServiceImpl.getInstance().findByTeamidPosition(player));
			break;
			
		case "find5" :
			player = new PlayerBean();
			teamId = request.getParameter("teamId");
			String height = request.getParameter("height");
			String pName = request.getParameter("pName");
			player.setHeight(height);
			player.setPName(pName);
			player.setTeamId(teamId);
			
			request.setAttribute("players", PlayerServiceImpl.getInstance().findByTeamidHeightName(player));
			break;
		}
	
		String page = request.getParameter("page");
		System.out.println("페이지 : " + page);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/"+page+".jsp");
			rd.forward(request, response);
			
		
	}



}
