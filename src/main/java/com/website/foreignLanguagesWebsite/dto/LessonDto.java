package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.lessonentity.DifficultlyLevel;
import com.website.foreignLanguagesWebsite.entity.lessonentity.LessonCategory;
import lombok.*;

import java.sql.Time;
import java.time.Duration;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LessonDto {
    private Long id;
    private String title;
    private String description;
    private String content;
    private Date dateOfCreation;
    private Time duration;
    private DifficultlyLevel difficultlyLevel;
    private LessonCategory lessonCategory;
}
