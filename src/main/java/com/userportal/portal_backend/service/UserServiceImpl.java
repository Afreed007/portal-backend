package com.userportal.portal_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userportal.portal_backend.model.User;
import com.userportal.portal_backend.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
    @Autowired 
    UserRepository repository;
    @Override
    public Optional<User> getUser(Long id) {
        // TODO Auto-generated method stub
        return repository.findById(id);
    }

    @Override
    public List<User> getAllusers() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        repository.deleteById(id);        
    }

    @Override
    public User updateUser(User user) {
        // TODO Auto-generated method stub
        User userTemp = repository.findById(user.getId()).get();
        userTemp.setFirst_name(user.getFirst_name());
        userTemp.setLast_name(user.getLast_name());
        userTemp.setEmail(user.getEmail());
        userTemp.setGender(user.getGender());
        userTemp.setPhone_number(user.getPhone_number());
        userTemp.setAddress(user.getAddress());

        return repository.save(userTemp);
    } 

    @Override
    public User saveUser(User user) {
        // TODO Auto-generated method stub
        return repository.save(user);
    }

}
