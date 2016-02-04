package com.example.social_network;

import org.hibernate.*;  
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Query;

public class GroupDAO{

	public static List<Group> getListOfGroups(){
	        List<Group> list = new ArrayList<Group>();
	
	        Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
	
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            list = session.createQuery("from Group").list();
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

