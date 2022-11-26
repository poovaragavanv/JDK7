package com.mycompany;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ContactManager {

	public static void main(String[] args) {
		// loads configuration and creates a session factory
		Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		// opens a new session from the session factory
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// persists two new Contact objects 
		Contact contact1 = new Contact("Nam", "hainatu@gmail.com", "Vietnam", "0904277091");
		session.persist(contact1);

		Contact contact2 = new Contact("Bill", "bill@gmail.com", "USA", "18001900");
		Serializable id = session.save(contact2);
		System.out.println("created id: " + id);
		
		// loads a new object from database
		Contact contact3 = (Contact) session.get(Contact.class, new Integer(1));
		if (contact3 == null) {
			System.out.println("There is no Contact object with id=1");
		} else {
			System.out.println("Contact3's name: " + contact3.getName());
		}
		
		
		
		// updates a loaded instance of a Contact object
		Contact contact5 = (Contact) session.load(Contact.class, new Integer(2));
		contact5.setEmail("info1@company.com");
		contact5.setTelephone("1234567890");
		session.update(contact5);


		
		
		// commits the transaction and closes the session
		session.getTransaction().commit();
		session.close();
		
	}

}
