package com.example.social_network;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
 

@RestController
public class GroupController {
	@RequestMapping("/GroupController")
	public static List request() {
		GroupDAO groups = new GroupDAO();
		List list = groups.getListOfGroups();
		System.out.println(list);
		return list;
	}
}

