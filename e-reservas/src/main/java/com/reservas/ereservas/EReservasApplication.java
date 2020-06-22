package com.reservas.ereservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan({"com.reservas.ereservas"})
@EntityScan("com.reservas.ereservas")
public class EReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(EReservasApplication.class, args);
	}

}
