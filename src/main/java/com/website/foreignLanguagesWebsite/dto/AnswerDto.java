package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.testentity.Test;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDto {
    private Long id;
    private String answer;
    private Test test;
}
