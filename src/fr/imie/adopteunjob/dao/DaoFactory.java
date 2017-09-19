package fr.imie.adopteunjob.dao;

import fr.imie.adopteunjob.dao.jpa.JpaJobOfferDao;
import fr.imie.adopteunjob.dao.jpa.JpaSkillDao;
import fr.imie.adopteunjob.dao.jpa.JpaUserDao;
import fr.imie.adopteunjob.util.PersistenceManager;

public class DaoFactory {

	private DaoFactory() {}
	
	public static UserDao getUserDao() {
		return new JpaUserDao(PersistenceManager.getEntityManagerFactory());
	}
	
	public static JobOfferDao getJobOfferDao() {
		return new JpaJobOfferDao(PersistenceManager.getEntityManagerFactory());
	}
	
	public static SkillDao getSkillDao() {
		return new JpaSkillDao(PersistenceManager.getEntityManagerFactory());
	}
	
}
