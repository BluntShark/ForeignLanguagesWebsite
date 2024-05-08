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
public class DifficultlyLevelDto {
    private Long id;
    private String level;
    private List<Lesson> lessons;
}
