package com.example.long2.services;

import com.example.long2.models.User;
import com.example.long2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User checkLogin(String userName, String password) {
        System.out.println(userName + " " + password);
        return userRepository.checkLogin(userName, password);
    }
}
