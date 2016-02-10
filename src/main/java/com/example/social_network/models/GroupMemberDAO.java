package com.example.social_network;

import org.hibernate.*;  
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Query;

public class GroupMemberDAO{

	public static List<GroupMember> getListOfGroupMembers(){
	        List<GroupMember> list = new ArrayList<GroupMember>();
	
	        Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
	
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            list = session.createQuery("from GroupMember").list();
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

