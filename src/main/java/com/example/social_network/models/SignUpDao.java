package com.example.social_network;


import java.lang.Object;
import java.security.*;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;


public class SignUpDao{

	public boolean signUpUserDetails(String userName, String email, String password){  
 		Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Transaction tx = null;
		String generatedPassword=null;
		try {
		/**********PASSWORD ENCRIPTED**********/
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		byte[] bytes = md.digest();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< bytes.length ;i++)
		{
			sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		generatedPassword = sb.toString();
		System.out.println("************"+generatedPassword);
			tx = session.getTransaction();
			tx.begin();
			User user = new User();
			
			user.setUserName(userName);
			user.setEmail(email);
			user.setPassword(generatedPassword);
			System.out.println("***********"+user.getUserName());
			session.save(user);
			tx.commit();
			
	        } catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
	        } finally {
			session.close();
 		}
 		return true;
		
	}
}
