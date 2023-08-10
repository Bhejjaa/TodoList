package com.example.Talesinframes.repo;

import com.example.Talesinframes.pojo.UsersPojo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<UsersPojo,Integer> {
    public List<UsersPojo> findByemail(String email);
}
