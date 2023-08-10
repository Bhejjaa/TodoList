package com.example.Talesinframes.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PhotosDetails")

public class PhotosPojo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int PhotoId;
    @ManyToOne // Establish many-to-one relationship with UsersPojo
    @JoinColumn(name = "user_id")
    private UsersPojo user_details;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "photopath")
    private String photopath;
}
