package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	@Autowired
	private PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(personJdbcDao.findAll().toString());
		System.out.println(personJdbcDao.findById(10001).toString());
		System.out.println(personJdbcDao.deleteById(10002));
		System.out.println(personJdbcDao.findAll().toString());
		System.out.println(personJdbcDao.insert(new Person(10004, "ANdrey", "Kazan", new Date())));
		System.out.println(personJdbcDao.findAll().toString());
		System.out.println(personJdbcDao.update(new Person(10004, "Andrey", "Russia, Kazan", new Date())));
		System.out.println(personJdbcDao.findAll().toString());

	}
}
