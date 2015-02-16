package com.rest;


import java.util.Collection;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.entities.Person;
import com.services.IPersonService;

@Path("/person")
public class PersonREST {

	@EJB
	private IPersonService service;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Person> sayHi(){
		return service.showAllPeopleService();
	}
}
