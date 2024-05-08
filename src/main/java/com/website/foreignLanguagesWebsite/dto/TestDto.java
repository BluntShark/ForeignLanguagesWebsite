package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.lessonentity.Lesson;
import com.website.foreignLanguagesWebsite.entity.testentity.Answer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TestDto {
    private Long id;
    private String question;
    private List<Answer> answers;
    private Answer correctAnswer;
    private Lesson lesson;
}
