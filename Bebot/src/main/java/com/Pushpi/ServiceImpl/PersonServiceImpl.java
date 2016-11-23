package com.Pushpi.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Pushpi.Dao.PesonRepository;
import com.Pushpi.Domain.Person;
import com.Pushpi.Service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private  PesonRepository personRepository;
	
	@Override
	public void save(Person person) {
		personRepository.save(person);
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

}
