package fr.iutv.springboot.exemple_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.Map;

@SpringBootApplication
public class Exemple01Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Exemple01Application.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "4444"));
		app.run(args);
	}

}
