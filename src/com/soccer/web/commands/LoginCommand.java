package com.soccer.web.commands;
import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceImpls.PlayerServiceImpl;

public class LoginCommand extends Command{
		public LoginCommand(HttpServletRequest request) {
			System.out.println("5. 로그인 커맨드 들어옴");
			System.out.println(String.format("request 출력 : %s, %s, %s, %s ", request.getParameter("pId"), 
					request.getParameter("solar"), request.getParameter("action"), request.getParameter("page")));
			setRequest(request);
			setAction(request.getParameter("action"));

			setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
			excute();
			System.out.println(this.getView());
		}
		
		@Override
		public void excute() {
			String pId = request.getParameter("pId");
			String Solar = request.getParameter("solar");
			PlayerBean p = new PlayerBean();
			p.setPId(pId);
			p.setSolar(Solar);
			p =  PlayerServiceImpl.getInstance().login(p);
			System.out.println("10. DB에서 커맨드로 전달된 로그인 객체 : " + p.toString());
			if (!p.getPId().equals("")) {
				setPage(request.getParameter("page"));
			}else {
				setPage("index.jsp");
			}
			super.excute();
		}
}
