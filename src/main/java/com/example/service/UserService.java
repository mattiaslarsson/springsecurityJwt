package com.example.service;

import com.example.domain.User;
import com.example.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <h1>Created by Mattias on 2017-01-21.</h1>
 */
@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }
    public List<User> getAll() {
        return repo.findAll();
    }
}
