package com.example.repository;

import com.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <h1>Created by Mattias on 2017-01-21.</h1>
 */
public interface UserRepository extends JpaRepository<User, String>{
}
