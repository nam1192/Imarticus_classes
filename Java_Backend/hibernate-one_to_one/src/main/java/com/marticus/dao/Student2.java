package com.marticus.main;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

//import com.marticus.dao.Address;
//import com.marticus.dao.Student;
//
//import com.marticus.dao.Aadhaar;
//import com.marticus.dao.Person;
//
//import com.marticus.dao.Student1;
//import com.marticus.dao.Phone;

import com.marticus.dao.Student2;
import com.marticus.dao.CoachingCenter;

import com.marticus.dao.*;

import com.marticus.util.HibernateUtil;

import java.util.HashSet;
import java.util.Set;


public class App {
	 

		public static void main(String[] args) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = null;
			try {
				transaction = session.beginTransaction();
// OneToOne 												
//				Address address1 = new Address("OMR Road", "Chennai", "TN", "600097");
//				Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "560000");
//				Student student1 = new Student("Eswar", address1);
//				Student student2 = new Student("Joe", address2);
//				
//				session.save(student1);
//				session.save(student2);
				
// OneToOne 								
//				Aadhaar aadhaar1 = new Aadhaar("600097");
//				Aadhaar aadhaar2 = new Aadhaar("560000");
//				Student student3 = new Student("Maxy", aadhaar1);
//				Student student4 = new Student("Joey", aadhaar2);
//				
//				session.save(student3);
//				session.save(student4);
				
				
// OneToMany 				
//				Set<Phone> phoneNumbers = new HashSet<Phone>();
//				phoneNumbers.add(new Phone("house","32354353"));
//				phoneNumbers.add(new Phone("mobile","9889343423"));
//
//				Student1 student = new Student1("Eswar", phoneNumbers);
//				session.save(student);
				
				Set<CoachingCenter> ccName = new HashSet<CoachingCenter>();
				ccName.add(new CoachingCenter("PHYSICS","1212"));
				ccName.add(new CoachingCenter("CHEMISTRY","1215"));
				ccName.add(new CoachingCenter("MATHS","1215"));
				
				Student2 s2 = new Student2("RON", ccName);
				session.save(s2);
				

									
				transaction.commit();
			} catch (HibernateException e) {
				transaction.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}

		}

	}