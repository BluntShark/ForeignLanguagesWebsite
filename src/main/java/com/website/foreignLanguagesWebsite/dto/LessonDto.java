package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.reference.DifficultlyLevel;
import com.website.foreignLanguagesWebsite.entity.reference.LessonCategory;
import lombok.*;

import java.sql.Time;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LessonDto {
    private Long id;
    private String title;
    private String content;
    private Time duration;
    private DifficultlyLevel difficultlyLevel;
    private LessonCategory lessonCategory;
}
