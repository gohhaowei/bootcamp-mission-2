package com.btkbootcamp.mission2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.UUID;

@SpringBootApplication
public class Mission2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mission2Application.class, args);
		System.out.println("Hello world");

		UUID id = UUID.randomUUID();
		System.out.println(id);
	}

}
