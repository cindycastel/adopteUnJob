package fr.imie.adopteunjob.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import fr.imie.adopteunjob.dao.UserDao;
import fr.imie.adopteunjob.entity.User;

public class JpaUserDao implements UserDao {

	private EntityManagerFactory emf;
	
	public JpaUserDao(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@Override
	public User addUser(User user) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(user);
			et.commit();
		} finally {
			if (et.isActive())
				et.rollback();
			em.close();
		}
		return user;
	}

}
