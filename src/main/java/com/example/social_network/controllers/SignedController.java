package com.example.social_network;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
import java.util.Iterator; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class SignedController {
	@RequestMapping(value ="/signIn",method = RequestMethod.POST)
	public boolean network(HttpServletRequest request,HttpServletResponse response)
           	throws Exception {
           		String user_email=request.getParameter("userName");
			String Password=request.getParameter("password");
			User user=new User();
			SignedDAO gld=new SignedDAO();
			boolean result=gld.getAll(user_email,Password);
			return result;
		}
	@RequestMapping(value ="/sesClose",method = RequestMethod.POST)
	public boolean logOut(HttpServletRequest request,HttpServletResponse response)
           	throws Exception {
           		HttpSession session = request.getSession(false); 
				if(session!=null){
				 	session.invalidate();
					//response.sendRedirect( "index.html");
					return true;
				}
			return false;
		
		}
}
