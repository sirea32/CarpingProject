package edu.kh.carping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CarpingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarpingProjectApplication.class, args);
	}

}
