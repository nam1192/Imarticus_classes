
package com.javatpoint;

import java.util.ArrayList;

import org.hibernate.Session; 


public class TestHibernate {
	
	
	public static void addItIntoDB(String name,String password)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Login login= new Login();
		login.setUser_name(name);
		login.setPassword(password);
		session.save(login);
		session.getTransaction().commit();
		
	}
	
	
	

}
