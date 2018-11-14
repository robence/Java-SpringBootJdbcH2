package com.springboot.rest.example.springbootjdbch2;

<<<<<<< HEAD

import com.springboot.rest.example.springbootjdbch2.student.Student;
import com.springboot.rest.example.springbootjdbch2.student.StudentJdbcRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
=======
>>>>>>> 99ae818... spring boot jdbc h2 init
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
<<<<<<< HEAD
public class SpringBootJdbcH2Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Student id 10001 -> {}", repository.findById(10001L));
        logger.info("All users 1 -> {}", repository.findAll());

        logger.info("Inserting -> {}", repository.insert(new Student(10010L, "John", "A1234657")));
        logger.info("Update 10001 -> {}", repository.update(new Student(10001L, "Name-Updated", "New-Passport")));
        logger.info("Delete 10002 -> {}", repository.deleteById(10002L));
        logger.info("All users 2 -> {}", repository.findAll());


    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJdbcH2Application.class, args);
    }
=======
public class SpringBootJdbcH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcH2Application.class, args);
	}
>>>>>>> 99ae818... spring boot jdbc h2 init
}
