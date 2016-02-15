package com.example.social_network;

import java.lang.Object;
import java.security.*;
 
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
 
public class SignedDAO {  

public boolean getAll(String email,String Password){
       List<User> list = new ArrayList<User>();
      
       Session session = HibernateSessionManager.getSessionFactory().openSession();
       Transaction tx = null; 
       String generatedPassword=null;
         User user;      
       try {
           tx = session.beginTransaction();
           tx.begin();
           list = session.createQuery("from User").list(); 
           /*****password encription**********/
           MessageDigest md = MessageDigest.getInstance("MD5");
	   md.update(Password.getBytes());
	   byte[] bytes = md.digest();
	   StringBuilder sb = new StringBuilder();
	   for(int i=0; i< bytes.length ;i++)
	   {
		sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
	   }
	   generatedPassword = sb.toString();
           for(int i=0; i<list.size();i++){
		user=(User)list.get(i);
		
		System.out.println("****************"+generatedPassword);
		if(user.getUserName().equals(email) && user.getPassword().equals(generatedPassword)){
			return true;
		}
	   }
           tx.commit();
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

