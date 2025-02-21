package com.api.jav.rest_api.controller;

import com.api.jav.rest_api.dto.UserDTO;
import com.api.jav.rest_api.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService; 

    @GetMapping   
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
  
    @GetMapping("/{id}") 
    public ResponseEntity<UserDTO> getUserById(@PathVariable("id") int id) { 
        UserDTO userDTO = userService.findUserById(id); 
        return ResponseEntity.status(HttpStatus.OK).body(userDTO); 
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
    	UserDTO createdUser = userService.createUser(userDTO);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateMovie(@PathVariable int id, @RequestBody UserDTO userDTO) {
    	UserDTO updatedUser = userService.updateUser(id, userDTO);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
    	userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
    
}
