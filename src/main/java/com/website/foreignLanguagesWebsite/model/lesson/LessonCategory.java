package com.website.foreignLanguagesWebsite.model.lesson;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LessonCategory {
    private Long id;
    private String title;
    private String description;
}
