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
public class SignedController {
	@RequestMapping(value ="/signin",method = RequestMethod.POST)
	public boolean network(HttpServletRequest request,HttpServletResponse response)
           	throws Exception {
		   	System.out.println("************************enter to controller*************");
		   	String user_Name=request.getParameter("userName");
			String Password=request.getParameter("password");
			System.out.println(Password);
			SignedDAO gld=new SignedDAO();
			boolean result=gld.getAll(user_Name,Password);
			return result;
		}
}
