package com.Pushpi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Pushpi.Domain.Person;
import com.Pushpi.Service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	public Person home(@RequestBody Person person) {
		personService.save(person);
		return person;
	}
	
	/*@RequestMapping("/hello")
	public String hello(){
		return "Hello!!! Spring world";
	}*/
}
