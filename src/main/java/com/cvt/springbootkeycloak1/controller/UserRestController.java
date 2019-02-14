package com.cvt.springbootkeycloak1.controller;

import com.cvt.springbootkeycloak1.dao.UserDao;
import com.cvt.springbootkeycloak1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class UserRestController {
    @Autowired
    UserDao userDao;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userDao.getAll();
    }
}
