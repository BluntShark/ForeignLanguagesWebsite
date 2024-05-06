package com.website.foreignLanguagesWebsite.entity.user;

import com.website.foreignLanguagesWebsite.entity.lesson.Lesson;
import com.website.foreignLanguagesWebsite.entity.test.Test;
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
    @ManyToOne
    @JoinColumn(name = "language_level_id")
    private LanguageLevel languageLevel;
    @ManyToMany
    @JoinTable(name = "userword",
                joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "word_id", referencedColumnName = "id"))
    private Set<Word> words = new HashSet<>();
    @ManyToMany
    @JoinTable(name = "userviewedlessons",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_id", referencedColumnName = "id"))
    private Set<Lesson> viewedLessons = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "usercompletedlessons",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_id", referencedColumnName = "id"))
    private Set<Lesson> completedLessons = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "usercompletedtests",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "test_id", referencedColumnName = "id"))
    private Set<Test> completedTests = new HashSet<>();
}
