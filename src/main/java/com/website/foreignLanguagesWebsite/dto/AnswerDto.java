package com.website.foreignLanguagesWebsite.dto;

import lombok.Data;

@Data
public class AnswerDto {
    private Long id;
    private String content;
    private boolean isCorrect;
}
