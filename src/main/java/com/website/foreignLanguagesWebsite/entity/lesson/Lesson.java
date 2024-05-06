package com.website.foreignLanguagesWebsite.entity.lesson;

import com.website.foreignLanguagesWebsite.entity.test.Test;
import com.website.foreignLanguagesWebsite.entity.user.LanguageLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Duration;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@Table(name = "lesson")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "content")
    private String content;
    @Column(name = "date_of_creation")
    private Date dateOfCreation;
    @Column(name = "duration")
    private Duration duration;
    @ManyToOne
    @JoinColumn(name = "difficulty_level_id")
    private DifficultlyLevel difficultlyLevel;
    @ManyToOne
    @JoinColumn(name = "lesson_category_id")
    private LessonCategory lessonCategory;
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "lesson")
//    private Test test;
    @OneToOne
    @JoinColumn(name="test_id")
    private Test test;
}
