package com.myorg.jokesconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JokesConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesConfigServiceApplication.class, args);
	}

}
