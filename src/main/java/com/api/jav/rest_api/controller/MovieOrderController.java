package com.api.jav.rest_api.controller;

import com.api.jav.rest_api.dto.MovieOrderDTO;
import com.api.jav.rest_api.service.MovieOrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 


@RestController
@RequestMapping("/api/movieorder")
public class MovieOrderController {
	
    @Autowired
    private MovieOrderService movieOrderService; 

    @GetMapping   
    public ResponseEntity<List<MovieOrderDTO>> getAllMovies() {
        List<MovieOrderDTO> orders = movieOrderService.getAllMovies();
        return ResponseEntity.ok(orders);
    }
  
    @GetMapping("/{userid}") 
    public ResponseEntity<List<MovieOrderDTO>> getOrderById(@PathVariable("userid") String userid) { 
    	List<MovieOrderDTO> movieOrders = movieOrderService.findOrderById(userid); 
    	return ResponseEntity.ok(movieOrders);
    }

}
