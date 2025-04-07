package com.revature.ecommerce_backend.repositories;

import com.revature.ecommerce_backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
