package com.cvt.springbootkeycloak1.controller;

import com.cvt.springbootkeycloak1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class UserController {

    @Autowired
    UserDao userDao;

//    @GetMapping("/")
//    public String index(){
//        return "index";
//    }

    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users",userDao.getAll());
        //model.addAttribute("username",principal.getName());
        return "user";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";

    }
}
