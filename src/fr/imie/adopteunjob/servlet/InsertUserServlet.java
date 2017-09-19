package fr.imie.adopteunjob.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.adopteunjob.dao.DaoFactory;
import fr.imie.adopteunjob.entity.Candidate;
import fr.imie.adopteunjob.entity.City;
import fr.imie.adopteunjob.entity.Firm;
import fr.imie.adopteunjob.entity.JobOffer;
import fr.imie.adopteunjob.entity.Skill;

@WebServlet(urlPatterns = "/insertUser")
public class InsertUserServlet extends HttpServlet {

	EntityManager entityManager = null;
	
	@Override
	public void init() throws ServletException {
		entityManager = Persistence.createEntityManagerFactory("My-PU").createEntityManager();
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Candidate candidate = new Candidate();
		candidate.setUsername("Valentin");
		candidate.setEmail("test@test.com");
		
		Skill skill = new Skill();
		skill.setName("Java");
		
		DaoFactory.getSkillDao().addSkill(skill);
		
		List<Skill> skillList = new ArrayList<>();
		skillList.add(skill);
		candidate.setSkillList(skillList);
		
		
		City city = new City();
		city.setCityName("Caen");
		city.setZipCode("14000");
		
		candidate.setCity(city);
		
		DaoFactory.getUserDao().addUser(candidate);
		
		Firm firm = new Firm();
		firm.setUsername("McDo");
		firm.setCompanyName("toto");
		
		JobOffer offer = new JobOffer();
		offer.setFirm(firm);
		offer.setName("Server");
		
		DaoFactory.getJobOfferDao().addJobOffer(offer);
		
		entityManager.close();
	}
	
}
