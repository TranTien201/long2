package com.example.long2.services;

import com.example.long2.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();

    User checkLogin(String userName, String password);
}
