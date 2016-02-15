package com.example.social_network;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CuUserController {

	@RequestMapping(value ="/Signin" , method = RequestMethod.GET)
	public int Signin (HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		List<User> list = new ArrayList<User>();

		CuuserDAO user = new CuuserDAO();
		list = user.getUserObject(email);

		Authentication auth = new Authentication();
		int curUser = auth.checkSession(request, list);
		System.out.println(cuUser);
		return curUser;
	}
}	
 

