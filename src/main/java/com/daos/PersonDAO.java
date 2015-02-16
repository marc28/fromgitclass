package com.daos;

import java.util.Collection;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entities.Person;

@Local
@Stateless
public class PersonDAO implements IPersonDAO{
	
	@PersistenceContext
	private EntityManager em;

	public Collection<Person> showAllPeople() {
		Query q = em.createQuery("from Person");
		return q.getResultList();
	}

}
