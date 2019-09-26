package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{
	public MoveCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(request.getParameter("action"));

		//setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		excute();
		System.out.println(this.getView());
	}
	
	@Override
	public void excute() {
		setPage(request.getParameter("page"));
		super.excute();
	}


}
