package fr.imie.adopteunjob.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {

	private static EntityManagerFactory emf;
	
	private PersistenceManager() {}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if (emf != null) {
			return emf;
		}
		return Persistence.createEntityManagerFactory("My-PU");
	}
	
	public static void closeEntityManagerFactory() {
		if (emf != null && emf.isOpen()) {
			emf.close();
		}
	}
	
}
