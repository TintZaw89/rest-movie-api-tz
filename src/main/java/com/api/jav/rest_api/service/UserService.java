package com.api.jav.rest_api.service;

import com.api.jav.rest_api.entity.User;
import com.api.jav.rest_api.dto.UserDTO; 
import com.api.jav.rest_api.repository.UserRepository; 
import org.modelmapper.ModelMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors; 

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo; 
  
    @Autowired
    private ModelMapper mapper; 

    private UserDTO mapToDTO(User user) {
        return new UserDTO(user.getId(),user.getName(),user.getEmail(),user.getPhNo(),
        		user.getPassword(),user.getAddress(),user.getAge() ,user.getCash());
    }

    private User mapToEntity(UserDTO userDTO) {
        return new User(userDTO.getId(),userDTO.getName(),userDTO.getEmail(),userDTO.getPhNo(),
        userDTO.getPassword(),userDTO.getAddress(),userDTO.getAge() ,userDTO.getCash());
    }
 
    public List<UserDTO> getAllUsers() {
       return userRepo.findAll().stream()
			        .map(this::mapToDTO)
			        .collect(Collectors.toList());
    }

    public UserDTO findUserById(int id) {
        User user = mapper.map(userRepo.findUserById(id),User.class);
        return mapToDTO(user);
    }

    public UserDTO createUser(UserDTO userDTO) {
    User user = mapToEntity(userDTO);
    User savedUser = userRepo.save(user);
    return mapToDTO(savedUser);
    }

        public UserDTO updateUser(int id, UserDTO userDTO) {
        User existingUser = userRepo.findUserById(id).orElseThrow(() -> new RuntimeException("User not found"));
        existingUser.setName(userDTO.getName());
        existingUser.setEmail(userDTO.getEmail());
        existingUser.setPhNo(userDTO.getPhNo());
        existingUser.setPassword(userDTO.getPassword());
        existingUser.setAddress(userDTO.getAddress());
        existingUser.setAge(userDTO.getAge());
        existingUser.setCash(userDTO.getCash());
        User updatedUser = userRepo.save(existingUser);
        return mapToDTO(updatedUser);
    }

    public void deleteUser(int id) {
        User user = userRepo.findUserById(id).orElseThrow(() -> new RuntimeException("User not found"));
        userRepo.delete(user);
    }
  
/*     public UserRepository findUserById(int id) { 
        Optional<UserDTO> userById = userRepo.findUserById(id); 
        UserDTO userResponse = mapper.map(userById, UserDTO.class); 
        return userResponse;
    }  */
    
}
