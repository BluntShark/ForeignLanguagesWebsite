package com.website.foreignLanguagesWebsite.entity.user;

import com.website.foreignLanguagesWebsite.entity.word.Word;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_name")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "count_of_competed_tests")
    private Integer countOfCompletedTests;
    @ManyToOne
    @JoinColumn(name = "language_level_id")
    private LanguageLevel languageLevel;
    @ManyToMany
    @JoinTable(name = "userword",
                joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "word_id", referencedColumnName = "id"))
    private Set<Word> words = new HashSet<>();
}
