package com.services;

import java.util.Collection;

import javax.ejb.Local;
import javax.jws.WebService;

import com.entities.Person;

@Local
@WebService
public interface IPersonService {

	Collection<Person> showAllPeopleService();
}
