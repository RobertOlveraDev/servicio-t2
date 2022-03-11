package com.bajaware.pruebaconcepto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping(value = "/app")
public class PruebaConceptoApplication {

	@GetMapping("/")
	public String welcome(){
		return "Prueba de concepto servicio 2";
	}

	@GetMapping("/hello")
	public String hello(){
		return "Prueba hello servicio 2";
	}

	public static void main(String[] args) {
		SpringApplication.run(PruebaConceptoApplication.class, args);
	}

}
