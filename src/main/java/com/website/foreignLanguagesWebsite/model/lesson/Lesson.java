package com.website.foreignLanguagesWebsite.model.lesson;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Duration;
import java.util.Date;

@Data
@AllArgsConstructor
public class Lesson {
    private Long id;
    private String title;
    private String description;
    //id_difficulty_level
    private Date dateOfCreation;
    private Duration duration;
    //id_lesson_category
    //id_test
}
