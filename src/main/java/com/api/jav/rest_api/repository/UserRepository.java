package com.api.jav.rest_api.repository;

import com.api.jav.rest_api.entity.User; 
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.data.repository.query.Param; 

public interface UserRepository extends JpaRepository<User,Integer>{

     @Query( 
        nativeQuery = true, 
        value 
        = "SELECT id,name,email,phno,password,address,age,cash from user where id=:id") 
       Optional<User> findUserById(@Param("id") int id); 

}