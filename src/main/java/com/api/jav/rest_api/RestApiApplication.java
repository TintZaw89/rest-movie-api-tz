package com.api.jav.rest_api;

//import com.api.jav.rest_api.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@ComponentScan({"controller", "repository","entity","service","dto"})
@EnableJpaRepositories("com.api.jav.rest_api.repository") 
@ComponentScan({"com.api.jav.rest_api.*"})
@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}
