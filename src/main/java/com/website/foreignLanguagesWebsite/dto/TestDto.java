package com.website.foreignLanguagesWebsite.dto;

import lombok.Data;

import java.util.List;

@Data
public class TestDto {
    private Long id;
    private String name;
    private List<QuestionDto> questions;
}
