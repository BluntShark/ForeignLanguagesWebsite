package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.reference.LanguageLevel;
import com.website.foreignLanguagesWebsite.entity.testentity.Question;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TestDto {
    private Long id;
    private String name;
    private LanguageLevel languageLevel;
    private List<Question> questions;
}
