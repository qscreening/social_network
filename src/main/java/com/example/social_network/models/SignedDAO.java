package com.example.social_network;
 
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
 
public class SignedDAO {  

public boolean getAll(String userName,String Password){
       List<User> list = new ArrayList<User>();
      
       Session session = HibernateSessionManager.getSessionFactory().openSession();
       Transaction tx = null; 
         User user;      
       try {
           tx = session.beginTransaction();
           tx.begin();
           //String qry="from "+ tableName+" where id="+id;
           list = session.createQuery("from User").list(); 
           tx.commit();
           } catch (Exception e) {
           if (tx != null) {
               tx.rollback();
           }
           e.printStackTrace();
       } finally {
           session.close();
       }
       for(int i=0; i<list.size();i++){
		user=(User)list.get(i);
		if(user.getUserName().equals(userName) && user.getPassword().equals(Password)){
			return true;
		}
	}
	return false;
    }
} 

