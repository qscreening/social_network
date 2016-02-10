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

@RestController
public class LoginController {

	@RequestMapping(value = "/Login" , method = RequestMethod.POST)
	public String Status(HttpServletRequest request ,HttpServletResponse response) throws Exception {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		LoginDAO login = new LoginDAO();
		String result = login.loginStatus(userName,password);
		System.out.println(result);
		return result;
	}
}	
