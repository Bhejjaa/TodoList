package com.example.Talesinframes.repo;

import com.example.Talesinframes.pojo.TodoList;
import com.example.Talesinframes.pojo.UsersPojo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoListRepo extends CrudRepository<TodoList,Integer> {
    public List<TodoList> findByUserDetails(UsersPojo id);
}
