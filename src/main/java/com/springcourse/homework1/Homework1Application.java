package com.springcourse.homework1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework1Application implements CommandLineRunner {

	@Autowired
	Apple obj;

	@Autowired
	DBService db;

	@Autowired
	CakeBaker cake;

	public static void main(String[] args) {
		SpringApplication.run(Homework1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		obj.eatApple();
//		System.out.println(db.getData());
		System.out.println(cake.bakeCake());
	}
}
