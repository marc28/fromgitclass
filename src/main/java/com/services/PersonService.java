package com.services;

import java.util.Collection;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.daos.IPersonDAO;
import com.entities.Person;

@Stateless
@WebService(endpointInterface="com.services.IPersonService")
@Local(IPersonService.class)
public class PersonService {
	
	@EJB
	IPersonDAO personDao;
	
	public Collection<Person> showAllPeopleService(){
		return personDao.showAllPeople();
	}

}
