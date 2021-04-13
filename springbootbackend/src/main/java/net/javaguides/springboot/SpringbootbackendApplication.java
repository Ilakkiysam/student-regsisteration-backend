package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;


@SpringBootApplication
public abstract class SpringbootbackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbackendApplication.class, args);
	}
@Autowired
private UserRepository userRepository;
@Override
public void run(String... args) throws Exception {
	this.userRepository.save(new User (0, 21, "Ilakkiya", "sambath","sgilakkiya@gmail.com", "java"));
	this.userRepository.save(new User (1, 22, "thiru", "sambath","thiru@gmail.com", "java"));
	this.userRepository.save(new User (2, 22, "viji", "sambath","viji@gmail.com", "java"));
	
}
}
