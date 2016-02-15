package com.example.social_network;

import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import java.security.*;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;


public class SignUpDao{

	public boolean signUpUserDetails(String fullName, String email, String password){  
 		Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Transaction tx = null;
		String generatedPassword=null;
		List<User> list = new ArrayList<User>();
		try {
			tx = session.getTransaction();
			tx.begin();
			User user = new User();
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
			for(int i=0; i < list.size(); i++){
				user = (User)list.get(i);
				if(user.getEmail().equals(email)){
					return false;
				}
			}
			user.setUserName(fullName);
			user.setEmail(email);
			user.setPassword(password);
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
