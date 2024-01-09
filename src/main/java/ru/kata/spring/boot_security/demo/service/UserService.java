package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    User getUserByUsername(String username);

    void deleteUser(Long id);

    User getUser(Long id);

    void updateUser(User user);

    void createUser(User user);

    List<User> getAllUsers();

    void createOrUpdateUser(User user);
}
