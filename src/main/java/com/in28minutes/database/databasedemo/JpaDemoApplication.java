package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

    @Autowired
    private PersonJpaRepository personJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(com.in28minutes.database.databasedemo.JpaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(personJpaRepository.findById(10001).toString());
        System.out.println(personJpaRepository.insert(new Person("Andrey", "Russia, Kazan", new Date())));
        System.out.println(personJpaRepository.update(new Person(1, "Andrey", "Russia, Moscow", new Date())));
        personJpaRepository.deleteById(10003);
        System.out.println(personJpaRepository.findAll());
    }
}