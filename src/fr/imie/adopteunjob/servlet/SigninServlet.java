package fr.imie.adopteunjob.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.adopteunjob.dao.DaoFactory;
import fr.imie.adopteunjob.entity.Candidate;
import fr.imie.adopteunjob.entity.City;

@WebServlet(urlPatterns="/signin")
public class SigninServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/signin.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String gender = req.getParameter("gender");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		String address = req.getParameter("adress");
		String zipCode = req.getParameter("zipCode");
		String cityName = req.getParameter("city");
		
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String website = req.getParameter("website");
		
		City city = new City();
		city.setZipCode(zipCode);
		city.setCityName(cityName);
		
		Candidate candidate = new Candidate();
		candidate.setFirstname(firstname);
		candidate.setLastname(lastname);
		candidate.setUsername(username);
		candidate.setPassword(password);
		candidate.setStreetAdress(address);
		candidate.setCity(city);
		candidate.setEmail(email);
		candidate.setPhoneNumber(phone);
		candidate.setWebsite(website);
		
		DaoFactory.getUserDao().addUser(candidate);
		
		PrintWriter out = resp.getWriter();
		out.print("Ok !");
		
	}
	
}
