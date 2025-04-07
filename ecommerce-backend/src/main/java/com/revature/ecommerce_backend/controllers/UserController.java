package com.revature.ecommerce_backend.controllers;

import org.springframework.stereotype.Controller;
import com.revature.ecommerce_backend.models.User;
import com.revature.ecommerce_backend.services.UserService;


@Controller
public class UserController {
    
   private final UserService userService;

   public UserController(UserService userService){
    this.userService = userService;
    }

    public User createUser(User user) {
        return this.userService.save(user);
    }

    public User getUser(Integer id) {
        return this.userService.findById(id);
    }
    
}
