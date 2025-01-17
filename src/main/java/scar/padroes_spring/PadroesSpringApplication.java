package scar.padroes_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesSpringApplication.class, args);
	}

}
