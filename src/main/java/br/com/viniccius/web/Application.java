package br.com.viniccius.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan("br.com.viniccius.model") // responsável por escanear as entidades JPA no pacote especificado
@ComponentScan("br.com.viniccius") // escaneia componentes, serviços e controladores no pacote especificado
@EnableJpaRepositories("br.com.viniccius.repository") // habilita repositórios JPA no pacote especificado
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/api")
	public String api() {
		return "API is running!";
	}
}
