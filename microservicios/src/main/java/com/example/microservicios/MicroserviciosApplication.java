package com.example.microservicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosApplication.class, args);
	}
	//arreglado
	//solo habia que recompilar e implementar un mvnclean install
	//compilar usando java21 de sdk
	//veridicar puertos de clase microservice application

	//veriicar tambien las colecciones de la base de datos
	//para no apuntar a otra
}
