package com.readjson.service;


import com.readjson.domain.User;
import com.readjson.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public Iterable<User> list() {
       return repository.findAll();
    }

    public Iterable<User> saveAll(List<User> users){
        return repository.saveAll(users);
    }

    public User save(User user){
        return repository.save(user);
    }
}
