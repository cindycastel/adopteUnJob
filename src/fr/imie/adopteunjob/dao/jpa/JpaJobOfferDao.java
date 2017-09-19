package fr.imie.adopteunjob.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import fr.imie.adopteunjob.dao.JobOfferDao;
import fr.imie.adopteunjob.entity.JobOffer;

public class JpaJobOfferDao implements JobOfferDao {

	private EntityManagerFactory emf;
	
	public JpaJobOfferDao(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@Override
	public JobOffer addJobOffer(JobOffer jobOffer) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(jobOffer);
			et.commit();
		} finally {
			if (et.isActive())
				et.rollback();
			em.close();
		}
		return jobOffer;
	}

}
