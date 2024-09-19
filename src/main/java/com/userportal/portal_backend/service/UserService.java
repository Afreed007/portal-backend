package com.userportal.portal_backend.service;


import java.util.List;
import java.util.Optional;

import com.userportal.portal_backend.model.User;

public interface UserService {
public Optional<User> getUser(Long id); 
public List <User> getAllusers();
public void deleteUser(Long id);
public User updateUser( User user);
public User saveUser(User user);



}
