package com.example.firstSpringinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringinitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringinitApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		
		a.show();
		
	}

}
