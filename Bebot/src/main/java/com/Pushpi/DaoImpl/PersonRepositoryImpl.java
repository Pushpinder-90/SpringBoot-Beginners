package com.Pushpi.DaoImpl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl {
	
	@Autowired
	private SessionFactory sessionFactory;

}
