package com.api.jav.rest_api.repository;

import com.api.jav.rest_api.entity.MovieOrder;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.query.Param; 

public interface MovieOrderRepository extends JpaRepository<MovieOrder,Integer>{
	
    @Query( 
            nativeQuery = true, 
            value 
            = "select d.userid,o.order_id orderid,o.username,o.address,o.phone,d.moviename,d.director,d.price,o.payment_type paymenttype,o.email\r\n"
            		+ "from movie_order o,movie_order_dtls d where o.order_id = d.order_id and d.userid like ifnull(:userid,'%')") 
           List<MovieOrder> findOrderById(@Param("userid") String userid);
    	   //List<MovieOrder> findAllMovies();
}
