package com.website.foreignLanguagesWebsite.entity.lessonentity;

import com.website.foreignLanguagesWebsite.entity.reference.DifficultlyLevel;
import com.website.foreignLanguagesWebsite.entity.reference.LessonCategory;
import com.website.foreignLanguagesWebsite.entity.testentity.Test;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

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
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "content")
    private String content;
    @Column(name = "date_of_creation")
    private Date dateOfCreation;
    @Column(name = "duration")
    private Time duration;
    @Column(name = "is_completed")
    private Boolean isCompleted;
    @Column(name = "is_viewed")
    private Boolean isViewed;
    @ManyToOne
    @JoinColumn(name = "difficulty_level_id")
    private DifficultlyLevel difficultlyLevel;
    @ManyToOne
    @JoinColumn(name = "lesson_category_id")
    private LessonCategory lessonCategory;
    @OneToOne
    @JoinColumn(name="test_id")
    private Test test;

    public Lesson(Long id, String title, String description, String content, Date dateOfCreation,
                  Time duration, DifficultlyLevel difficultlyLevel, LessonCategory lessonCategory) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.dateOfCreation = dateOfCreation;
        this.duration = duration;
        this.difficultlyLevel = difficultlyLevel;
        this.lessonCategory = lessonCategory;
    }
}
