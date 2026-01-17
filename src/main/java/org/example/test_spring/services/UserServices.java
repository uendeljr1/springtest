package org.example.test_spring.services;

import org.example.test_spring.entities.User;
import org.example.test_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {

        Optional<User> user = userRepository.findById(id);
        return user.get();

    }
}
