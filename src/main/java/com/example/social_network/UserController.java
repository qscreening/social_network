
package com.example.social_network;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
import java.util.Iterator; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {
	@RequestMapping("/user")
	public List network(){
		UserDAO gld=new UserDAO();
		List list=gld.getAll();
		System.out.println(list);
		return list;
	}
}


