package com.example.Talesinframes.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "UsersInfo")
public class UsersPojo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private int userid;
    @Column(name = "username")
    private String username;
    @Column(name = "userpassword")
    private String password;
    @Column(name = "useremail")
    private String email;

}
