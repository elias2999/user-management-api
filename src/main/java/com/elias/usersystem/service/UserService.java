package com.elias.usersystem.service;

import com.elias.usersystem.exception.ResourceNotFoundException;
import com.elias.usersystem.model.user;
import com.elias.usersystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public user saveUser(user user) {
        return userRepository.save(user);
    }

    public Optional<user> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public user updateUser(Long id, user updatedUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(updatedUser.getName());
                    user.setEmail(updatedUser.getEmail());
                    user.setRole(updatedUser.getRole());
                    return userRepository.save(user);
                })
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }
}

