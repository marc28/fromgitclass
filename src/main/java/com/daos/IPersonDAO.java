package com.daos;

import java.util.Collection;

import javax.ejb.Local;

import com.entities.Person;

@Local
public interface IPersonDAO {
	
	Collection<Person> showAllPeople();

}
