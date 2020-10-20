package com.in28minutes.database.databasedemo.springdata;

import com.in28minutes.database.databasedemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataPersonRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByLocation(String location);
}
