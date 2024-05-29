package com.projetosti.cardapio;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class CardapioApplication {


	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure()
				.directory("./")
				.ignoreIfMalformed()
				.ignoreIfMissing()
				.load();

		String dbUsername = dotenv.get("DB_USERNAME");
		String dbPassword = dotenv.get("DB_PASSWORD");

		if (dbUsername != null) {
			System.setProperty("DB_USERNAME", dbUsername);
		}

		if (dbPassword != null) {
			System.setProperty("DB_PASSWORD", dbPassword);
		}

		SpringApplication.run(CardapioApplication.class, args);
	}

}
