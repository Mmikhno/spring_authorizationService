package ru.netology.authorizationService.service;

import ru.netology.authorizationService.user.User;

import java.util.List;

public interface AuthorizationService {
    public List<Authorities> getAuthorities(String user, String password);

    public User save(User u);

    public User getUserByUserName(String name);

    public List<User> getAllUsers();
}
