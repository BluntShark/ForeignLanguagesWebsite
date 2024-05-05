package com.website.foreignLanguagesWebsite.model.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable=false)
    private Long id;
    @Column(name = "login", nullable=false)
    private String login;
    @Column(name = "email", nullable=false)
    private String email;
    @Column(name = "password", nullable=false)
    private String password;
    @Column(name = "count_of_competed_tests")
    private Integer countOfCompletedTests;
    //id_languageLevel;
}
