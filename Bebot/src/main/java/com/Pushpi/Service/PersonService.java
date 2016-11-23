package com.Pushpi.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Pushpi.Domain.Person;

@Transactional(readOnly=true)
public interface PersonService {
	
	@Transactional(readOnly=false)
	public void save(Person person);
	
	public List<Person> findAll();

}
