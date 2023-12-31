package com.example.Talesinframes.controller;

import com.example.Talesinframes.pojo.UsersPojo;
import com.example.Talesinframes.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SignupController{
@Autowired
private UserRepo userRepo;
    @PostMapping("/signupdata")
    public RedirectView getformdata(@RequestParam("username") String username, @RequestParam("useremail") String useremail, @RequestParam("userpassword") String userpassword){
        UsersPojo data = new UsersPojo();
        data.setUsername(username);
          data.setEmail(useremail);
          data.setPassword(userpassword);
          userRepo.save(data);
          return new RedirectView("/login");
    }
    @GetMapping("/signup")
    public String signup(){ return "signup"; }
        }
