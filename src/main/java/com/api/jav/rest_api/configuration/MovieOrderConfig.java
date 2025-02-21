package com.api.jav.rest_api.configuration;

import com.api.jav.rest_api.service.MovieOrderService;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 

@Configuration
public class MovieOrderConfig {
	
	@Bean
    public MovieOrderService orderBean() { 
        return new MovieOrderService(); 
    }

}
