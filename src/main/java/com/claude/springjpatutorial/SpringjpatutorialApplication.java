package com.claude.springjpatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjpatutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpatutorialApplication.class, args);
	}
	/**
	 *An application context is simply a container for application services.
	 *
	 * When connecting to a database the framework see the database being used in the classpath and assumes to connect to that database. No extra code required.
	 */
}
