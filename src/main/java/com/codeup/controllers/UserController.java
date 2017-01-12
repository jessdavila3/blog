package com.codeup.controllers;

import com.codeup.User;
import com.codeup.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jessedavila on 1/11/17.
 */
@Controller
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    public Users usersDao;

    @GetMapping("/create")
    public String showRegisterPage(Model model) {
        model.addAttribute("user", new User());
        return "users/register";
    }

    @PostMapping("/create")
    public String createUser() {
        return "redirect:../posts";
    }


}