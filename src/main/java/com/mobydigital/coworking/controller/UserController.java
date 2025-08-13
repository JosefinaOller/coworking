package com.mobydigital.coworking.controller;

import com.mobydigital.coworking.model.User;
import com.mobydigital.coworking.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public String createUser (@RequestBody User user){
        userService.saveUser(user);
        return "El usuario fue registrado correctamente";
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User userFindById (@PathVariable Long id){
        return userService.findUser(id);
    }





}
