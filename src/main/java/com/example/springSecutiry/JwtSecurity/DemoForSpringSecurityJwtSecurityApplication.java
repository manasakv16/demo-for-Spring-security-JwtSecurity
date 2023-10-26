package com.example.springSecutiry.JwtSecurity;

import com.example.springSecutiry.JwtSecurity.Entity.Role;
import com.example.springSecutiry.JwtSecurity.Entity.User;
import com.example.springSecutiry.JwtSecurity.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemoForSpringSecurityJwtSecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoForSpringSecurityJwtSecurityApplication.class, args);
	}

	public void run(String... args){
		User user = userRepository.findByRole(Role.ADMIN);
		if(user == null ){
			User newUser = new User();
			newUser.setEmail("admin@gmail.com");
			newUser.setFirstName("admin");
			newUser.setLastName("admin");
			newUser.setRole(Role.ADMIN);
			newUser.setPassword(new BCryptPasswordEncoder().encode("admin"));
			userRepository.save(newUser);
		}
	}

}
