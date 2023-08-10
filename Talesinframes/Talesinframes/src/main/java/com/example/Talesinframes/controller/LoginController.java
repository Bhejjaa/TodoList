package com.example.Talesinframes.controller;

import com.example.Talesinframes.pojo.UsersPojo;
import com.example.Talesinframes.repo.UserRepo;
import com.example.Talesinframes.services.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private Validation validation;
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/logindata")
    public RedirectView logindata(@RequestParam("useremail") String userEmail, @RequestParam("userpassword") String userpassword){
        List<UsersPojo> userdata = userRepo.findByemail(userEmail);
        boolean isValid = validation.isValidUser(userdata,userpassword);
        if(isValid){
            return new RedirectView("/homepage");
        }
        return new RedirectView("/login");
    }
}
