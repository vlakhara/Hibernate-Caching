package com.vipul.cache_example;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
   
    	Alien alien = null;
    	
//    	Scanner in = new Scanner(System.in);
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session session1 = sf.openSession();
    	session1.beginTransaction();
    	
    	session1.createQuery("from Alien where aId=101");
    	
    	Query<Alien> query = session1.createQuery("from Alien where aId=101");
    	query.setCacheable(true);
    	alien = (Alien) query.uniqueResult();

		System.out.println(alien);
		session1.getTransaction().commit();
		session1.close();
    	
//    	for(int i = 0 ; i < 10 ; i++) {
//    		Alien alien = new Alien();
//    		System.out.println("Alien ID : ");
//    		alien.setaId(in.nextInt());
//    		System.out.println("Alien Name : ");
//    		alien.setaName(in.next());
//    		System.out.println("Alien Tech : ");
//    		alien.setaTech(in.next());
//    		session.save(alien);
//    	}
    	
   		Session session2 = sf.openSession();
    	session2.beginTransaction();
    	Query<Alien> query1 = session2.createQuery("from Alien where aId=101");
    	query1.setCacheable(true);
    	alien = (Alien) query1.uniqueResult();
    	System.out.println(alien);
    	session2.getTransaction().commit();
    	session2.close();
    	
//    	in.close();
    
    }
}
