package com.example.social_network;
 
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
 
public class SignedDAO {  

public boolean getAll(String email,String password){
       List<User> list = new ArrayList<User>();
       Session session = HibernateSessionManager.getSessionFactory().openSession();
       Transaction tx = null; 
         User user =new User() ; 

  
       try {
           tx = session.beginTransaction();
           tx.begin();

           list = session.createQuery("from User").list(); 

		for(int i=0; i<list.size();i++){

			user=(User)list.get(i);
			if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                        
				return true;
			}
		}
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
       
	return false;
    }
} 

