package fr.imie.adopteunjob.dao.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import fr.imie.adopteunjob.dao.SkillDao;
import fr.imie.adopteunjob.entity.Skill;
import fr.imie.adopteunjob.entity.User;

public class JpaSkillDao implements SkillDao {

	private EntityManagerFactory emf;
	
	public JpaSkillDao(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@Override
	public Skill addSkill(Skill skill) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(skill);
			et.commit();
		} finally {
			if (et.isActive())
				et.rollback();
			em.close();
		}
		return skill;
	}

}
