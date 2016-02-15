package com.example.social_network;
  
import org.hibernate.Session;  
import org.hibernate.Transaction;  
import java.util.List;
import org.hibernate.Query;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
  
public class UserDAO {  
	
public List<User> getAll(){
        List<User> list = new ArrayList<User>();
       
        Session session = HibernateSessionManager.getSessionFactory().openSession();
        Transaction tx = null;       
        try {
            tx = session.beginTransaction();
            tx.begin();
            list = session.createQuery("from User").list(); 
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
