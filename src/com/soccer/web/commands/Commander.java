package com.soccer.web.commands;
import com.soccer.web.enums.Action;
import javax.servlet.http.HttpServletRequest;

public class Commander {
	public static Command direct(HttpServletRequest request) {
		System.out.println("★★★  3. Commander.direct()에 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("pId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		Command cmd = null;
		
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case LOGIN : cmd = new LoginCommand(request); break;
		case SEARCH : cmd = new SearchCommand(); break;
		}

		
		return cmd;
	}
}
