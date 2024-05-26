package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.reference.LanguageLevel;
import lombok.Data;

import java.util.List;

@Data
public class TestDto {
    private Long id;
    private String name;
    private LanguageLevel languageLevel;
    private List<QuestionDto> questions;
}
