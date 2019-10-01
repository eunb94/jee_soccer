package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceImpls.PlayerServiceImpl;

public class CreateCommand extends Command{
public CreateCommand(HttpServletRequest request) {
	setRequest(request);
	setAction(action);
	setDomain(domain);
	super.execute();
	this.execute();
}
	@Override
		public void execute() {
		PlayerBean param = new PlayerBean();
		param.setPId(request.getParameter("pId"));
		param.setSolar(request.getParameter("solar"));
		if(PlayerServiceImpl.getInstance().join(param)) {
			System.out.println("회원가입 성공!!");
		}else {
			System.out.println("회원가입 실패??");
		}
		}
}
