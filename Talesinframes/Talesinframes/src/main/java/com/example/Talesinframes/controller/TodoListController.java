package com.example.Talesinframes.controller;

import com.example.Talesinframes.pojo.TodoList;
import com.example.Talesinframes.pojo.UsersPojo;
import com.example.Talesinframes.repo.TodoListRepo;
import com.example.Talesinframes.repo.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TodoListController {
    @Autowired
    private TodoListRepo todoListRepo;
    @Autowired
    private UserRepo userRepo;
    @PostMapping("/tododata")
    public String insertToDodata(@RequestParam("title") String title, @RequestParam("description") String description, @RequestParam("timing") String timing,@RequestParam("importance") String importance){
        TodoList data = new TodoList();
        data.setTaskTitle(title);
        data.setTaskDescription(description);
        data.setTaskTiming(timing);
        data.setTaskImportance(importance);
        UsersPojo user = userRepo.findById(1).orElse(null);
        data.setUserDetails(user);
        todoListRepo.save(data);
        List<TodoList> fetcheddata = todoListRepo.findByUserDetails(user);

    }
}
