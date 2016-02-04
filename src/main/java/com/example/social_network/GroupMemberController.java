package com.example.social_network;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
 

@RestController
public class GroupMemberController {
	@RequestMapping("/GroupMemberController")
	public static List request() {
		GroupMemberDAO groupMembers = new GroupMemberDAO();
		List list = groupMembers.getListOfGroupMembers();
		System.out.println(list);
		return list;
	}
}

