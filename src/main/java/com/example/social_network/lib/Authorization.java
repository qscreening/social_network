package com.example.social_network;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;

public class Authorization{

	private HttpSession session;
	private int curUser = 0;
	public static int sessionUser(){
		return 1;
	}
	public int checkOrCreateSession(HttpServletRequest request) throws ServletException {
	
		if(session == null){
			session = request.getSession(true);
			session.setAttribute("userId",session.getId());
			int curUser = (Integer)session.getAttribute("userId");
			System.out.println("************"+curUser);
			return curUser;
			
		}else {
			System.out.println("**************session is Created");
		
		}
		return curUser;
		
	}
}
