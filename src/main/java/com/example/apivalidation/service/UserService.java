package com.example.apivalidation.service;

import com.example.apivalidation.dto.UserRequest;
import com.example.apivalidation.entity.User;
import com.example.apivalidation.exception.UserNotFoundException;
import com.example.apivalidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(UserRequest userRequest) {
        User user = User.build(
                0,
                userRequest.getName(),
                userRequest.getEmail(),
                userRequest.getMobile(),
                userRequest.getGender(),
                userRequest.getAge(),
                userRequest.getNationality()
        );
        return repository.save(user);
    }

    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        User user = repository.findByUserId(id);
        if (user != null){
            return repository.findByUserId(id);
        } else {
            throw new UserNotFoundException("User not found with id : "+id);
        }

    }
}
