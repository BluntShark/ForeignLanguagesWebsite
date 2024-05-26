package com.website.foreignLanguagesWebsite.dto;

import lombok.Data;

import java.util.List;

@Data
public class QuestionDto {
    private Long id;
    private String content;
    private List<AnswerDto> answers;
}
