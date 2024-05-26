package com.website.foreignLanguagesWebsite.entity.lessonentity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.website.foreignLanguagesWebsite.entity.reference.DifficultlyLevel;
import com.website.foreignLanguagesWebsite.entity.reference.LessonCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lesson")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "date_of_creation")
    private String dateOfCreation;
    @Column(name = "duration")
    private Time duration;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "difficulty_level_id")
    private DifficultlyLevel difficultlyLevel;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "lesson_category_id")
    private LessonCategory lessonCategory;

    public Lesson(Long id, String title, String content,
                  Time duration, String dateOfCreation, DifficultlyLevel difficultlyLevel, LessonCategory lessonCategory) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.dateOfCreation = dateOfCreation;
        this.duration = duration;
        this.difficultlyLevel = difficultlyLevel;
        this.lessonCategory = lessonCategory;
    }
}
