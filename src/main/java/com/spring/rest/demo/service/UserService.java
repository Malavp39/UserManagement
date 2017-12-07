package com.spring.rest.demo.service;

import java.util.List;

import com.spring.rest.demo.wrapper.UserWrapper;

public interface UserService {

    List<UserWrapper> getAllUsers();
    
    void deleteUser(String id);
    
    void createUser(UserWrapper userDetails);
    
    void updateUser(UserWrapper userDetails);
    
    UserWrapper getUserId(String id);
}
