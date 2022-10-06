package br.com.projetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioProjetoJavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioProjetoJavaSpringApplication.class, args);
	}

}
