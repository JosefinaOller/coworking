package com.mobydigital.coworking.service;

import com.mobydigital.coworking.model.User;
import java.util.List;

public interface IUserService {

    public void saveUser(User user);

    public List<User> getUsers();

    public User findUser(Long id);

    public void deleteUser(Long id);

    public void editUser(User user);
}
