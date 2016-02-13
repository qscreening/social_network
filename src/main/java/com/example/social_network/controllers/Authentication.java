package com.example.social_network;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;

import java.util.List;
import java.util.ArrayList;
import java.io.*;

public  class Authentication {

	private HttpSession session;
	public int checkSession(HttpServletRequest request, List<User> list) throws ServletException {

		int userId = list.get(0).getId();
		int Cuuser;
		if(session == null){
			session = request.getSession(true);
			session.setAttribute("userId", userId);
			cuuser = (Integer)session.getAttribute("userId");
			return curUser;
		}else {
			System.out.println("session is Created");
		}

		return cuuser;

	}

}

