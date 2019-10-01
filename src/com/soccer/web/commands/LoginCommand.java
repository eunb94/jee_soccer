package com.soccer.web.commands;
import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceImpls.PlayerServiceImpl;

public class LoginCommand extends Command{
		public LoginCommand(HttpServletRequest request) {
			System.out.println("★★★ 5. LoginCommand 들어옴 ★★★ ");
			System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
					request.getParameter("pId"), 
					request.getParameter("solar"),
					request.getParameter("action"),
					request.getParameter("page")));
			setRequest(request);
			setDomain(request.getServletPath()
					.substring(1,request.getServletPath().indexOf(".")));
			setAction(request.getParameter("action"));
			
			execute();
		}
		@Override
		public void execute() {
			String pId = request.getParameter("pId");
			String solar = request.getParameter("solar");
			PlayerBean player = new PlayerBean();
			player.setPId(pId);
			player.setSolar(solar);
			player = PlayerServiceImpl.getInstance().login(player);
			System.out.println("10. DB에서 커맨드로 전달된 로그인 객체 : "+player);
			setPage((player.getPId().equals(request.getParameter("pId"))
					&& player.getSolar().equals(request.getParameter("solar"))) ?request.getParameter("page"):("login"));
			super.execute();
		}
}