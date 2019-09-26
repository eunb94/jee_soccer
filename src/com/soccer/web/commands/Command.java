package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constants;

import lombok.Data;
@Data
public class Command implements Order{
	protected HttpServletRequest request;
	protected String action, page, view, domain;
	
	@Override
	public void excute() {
		System.out.println("★★★  4. Command 들어옴 ★★★ ");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s ",
				request.getParameter("pId"), 
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		System.out.println("리퀘스트 가는 길 : "+String.format(Constants.HOME_PATH, page));		
		this.view = String.format(Constants.HOME_PATH,page);
		
	}

}
