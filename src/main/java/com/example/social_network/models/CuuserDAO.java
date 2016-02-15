package com.example.social_network;

import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;

public class CuuserDAO{

	public List<User> getUserObject(String email){
		
		Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Transaction tx = null;  

		try {
			tx = session.getTransaction();
			tx.begin();
			StringBuilder query = new StringBuilder();
			email = query.append("from User where emailId = '").append(email).append("'").toString();
			list = (List<User>) session.createQuery(email).list();
			session.save(list);
			tx.commit();
	        } catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
	        } finally {
			session.close();
	        }
			return list;
	}
}
