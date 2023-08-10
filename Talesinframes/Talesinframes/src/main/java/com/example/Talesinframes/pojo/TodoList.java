package com.example.Talesinframes.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TodoList")
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "taskid")
    private int taskId;
    @Column(name = "taskTitle")
    private String taskTitle;
    @ManyToOne
    @JoinColumn(name = "user_info")
    private UsersPojo userDetails;
    @Column(name = "taskTiming")
    private String taskTiming;
    @Column(name = "taskDescription")
    private String taskDescription;
    @Column(name = "taskImportance")
    private String taskImportance;

}
