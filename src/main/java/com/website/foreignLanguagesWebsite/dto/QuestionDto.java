package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.testentity.Answer;
import com.website.foreignLanguagesWebsite.entity.testentity.Test;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class QuestionDto {
    private Long id;
    private String content;
    private Test test;
    private List<Answer> answers;
}
