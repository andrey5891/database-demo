package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.springdata.SpringDataPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

    @Autowired
    private SpringDataPersonRepository springDataPersonRepository;

    public static void main(String[] args) {
        SpringApplication.run(com.in28minutes.database.databasedemo.SpringDataDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(springDataPersonRepository.findById(10001).toString());
        System.out.println(springDataPersonRepository.save(new Person("Andrey", "Russia, Kazan", new Date())));
        System.out.println(springDataPersonRepository.save(new Person(1, "Andrey", "Moscow", new Date())));
        springDataPersonRepository.deleteById(10003);
        System.out.println(springDataPersonRepository.findAll());
    }
}