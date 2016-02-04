
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
	@RequestMapping("/Social_networkController")
	public List network(){
		UserDAO gld=new UserDAO();
		List list=gld.getAll();
		System.out.println(list);
		
 	 	/*public List network(HttpServletRequest request,HttpServletResponse response)
           	throws Exception {
		/*(System.out.println("entering into social_networkController");
		 int id=Integer.parseInt(request.getParameter("id"));
		 String tableName=request.getParameter("tableName");
		 ArrayList l=new ArrayList();
		 l.add(id);
		 l.add(tableName);*/
                /*Session session = HibernateSessionManager.getSessionFactory().openSession();
		System.out.println(session);
		session.beginTransaction();
		//String qry="from "+ tableName+" where id="+id;
		Query query = session.createQuery("from users");
		List list = query.list();
		//session.save(list);
		session.getTransaction().commit();*/
		
		return list;
	}
}


