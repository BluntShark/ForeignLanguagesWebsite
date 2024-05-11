package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.lessonentity.Lesson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LessonCategoryDto {
    private Long id;
    private String title;
    private String description;
    private List<Lesson> lessons;
}
