package com.api.jav.rest_api.service;

import com.api.jav.rest_api.dto.MovieOrderDTO;
import com.api.jav.rest_api.entity.MovieOrder;
import com.api.jav.rest_api.repository.MovieOrderRepository;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors; 

@Service
public class MovieOrderService {
	
	@Autowired
    private MovieOrderRepository movieOrderRepo;
    
    private MovieOrderDTO mapToDTO(MovieOrder order) {
        return new MovieOrderDTO(order.getUserId(),order.getOrderId(),order.getUserName(),order.getAddress(),order.getPhone(),
        		order.getMovieName(),order.getDirector(),order.getPrice(),order.getPaymentType() ,order.getEmail());
    }

    public List<MovieOrderDTO> getAllMovies() {
        return movieOrderRepo.findOrderById(null).stream()
 			        .map(this::mapToDTO)
 			        .collect(Collectors.toList());
     }
    
    public List<MovieOrderDTO> findOrderById(String userid) {
    	return movieOrderRepo.findOrderById(userid).stream()
			        .map(this::mapToDTO)
			        .collect(Collectors.toList());
    	//MovieOrder orders = mapper.map(movieOrderRepo.findOrderById(userid),MovieOrder.class);
    	//return mapToDTO(orders);
    }
}
