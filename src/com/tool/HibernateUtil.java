package com.tool;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
		
	private static final SessionFactory sessionFactory;
	
	static{
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch(Throwable th){
			System.err.println("Initial SessionFactory creation failed." + th);
            throw new ExceptionInInitializerError(th);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
