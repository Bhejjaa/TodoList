package com.example.Talesinframes.services;
import java.util.List;

import com.example.Talesinframes.pojo.UsersPojo;
import org.springframework.stereotype.Service;

@Service
public class Validation {
    public Boolean isValidUser(List<UsersPojo> users,String password){
        for (UsersPojo data:users){
            if(data.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
