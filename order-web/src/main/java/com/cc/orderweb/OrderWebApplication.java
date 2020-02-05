package com.cc.orderweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations="classpath:font-consumer-dubbo.xml")
@SpringBootApplication
public class OrderWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderWebApplication.class, args);
	}

}
