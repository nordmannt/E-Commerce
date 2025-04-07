package com.revature.ecommerce_backend.services;

import com.revature.ecommerce_backend.models.User;
import com.revature.ecommerce_backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    
    private final UserService userService;

    public UserService(UserService userService, UserRepository userRepository){
        this.userService = userService;
        this.userRepository = userRepository;
    }

    public User save(User user){
       return this.userRepository.save(user);
    }

    public User findById(Integer id){
        return this.userRepository.findById(id).get();
    }
}
