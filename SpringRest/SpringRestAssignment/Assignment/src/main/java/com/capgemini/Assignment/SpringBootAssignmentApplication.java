package com.capgemini.Assignment;

import com.capgemini.Assignment.Repository.UserRepository;
import com.capgemini.Assignment.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAssignmentApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootAssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		userRepository.save(new User("Mahesh"));
		userRepository.save(new User("Jayaram"));
		userRepository.save(new User("Daswanth"));
		userRepository.save(new User("Chari"));

		System.out.println("\n========findall()========");
		userRepository.findAll().forEach(u-> System.out.println(u));

		System.out.println("\n========findbyid(1L)========");
		userRepository.findById(1).ifPresent(u-> System.out.println(u));

		System.out.println("\n========findbyname('Chari')");
		userRepository.findByName("Chari").forEach(u-> System.out.println(u));
	}

}
