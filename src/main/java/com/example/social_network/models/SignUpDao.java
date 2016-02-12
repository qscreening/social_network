package com.example.social_network;

import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.Query; 

public class SignUpDao{

	public boolean signUpUserDetails(String userName, String email, String password){  
 		Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Transaction tx = null;
		
		try {
			tx = session.getTransaction();
			tx.begin();
			

			User user = new User();
			
			user.setUserName(userName);
			user.setEmail(email);
			user.setPassword(password);
                        

			session.save(user);
			tx.commit();
			return true;
			
	        } catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
	        } finally {
			session.close();
 		}
 		return false;
		
	}
}
