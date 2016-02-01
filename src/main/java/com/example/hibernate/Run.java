package com.example.hibernate;
import org.hibernate.Session;
import java.util.Scanner;
/*public class Run{
	int id;
	String title;
	String body;
	public Run */

public class Run{
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of inputs");
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			Session session = HibernateSessionManager.getSessionFactory().openSession();
			session.beginTransaction();
			Post post = new Post();
			System.out.println("Enter "+i+" input");
			/*system.out.println("Enter userId");
			post.setPostId(s.nextInt());*/
			System.out.println("Enter title");
			post.setTitle(s.next());
			System.out.println("Enter Body");
			post.setBody(s.next());
			session.save(post);
			session.getTransaction().commit();
		}	
		
		
	}

}
