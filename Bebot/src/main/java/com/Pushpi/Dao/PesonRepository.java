package com.Pushpi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Pushpi.Domain.Person;

public interface PesonRepository extends JpaRepository<Person, Long>{

}
