package com.soccer.web.commands;


import javax.servlet.http.HttpServletRequest;


import com.soccer.web.serviceImpls.PlayerServiceImpl;

public class SearchCommand extends Command {
	public SearchCommand(HttpServletRequest request) {
		
		 setRequest(request);
		 setDomain(request.getServletPath().substring(1,request.getServletPath().
		 indexOf("."))); setAction(request.getParameter("action"));
		 setPage(request.getParameter("page")); execute();
		 
	}

	@Override
	public void execute() {
		switch (request.getParameter("page")) {
		case "2_positions_a" :
			request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
			break;
		case "4_find_by_teamid_position" :
		//	request.setAttribute("players.teamId", o);
			break;

		default:
			break;
		}
		


		
		super.execute();
	}
}
