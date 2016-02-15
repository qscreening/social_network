package com.example.social_network;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class SignUpController {

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public boolean doPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String fullName = request.getParameter("userName");
		String emailId = request.getParameter("Email");
		String password = request.getParameter("password");
		SignUpDao signUpDao = new SignUpDao();
		boolean status = signUpDao.signUpUserDetails(fullName, emailId, password);
		return status;
	}

}
