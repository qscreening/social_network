package com.example.social_network;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
import java.util.Iterator; 

@RestController
public class Social_networkController {
	@RequestMapping("/Social_networkController")
 	 public List network() {
                Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from users");
		List list = query.list();
		session.save(list);
		session.getTransaction().commit();
		return list;
	}
}


