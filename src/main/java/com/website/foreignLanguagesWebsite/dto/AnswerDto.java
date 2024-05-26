package com.website.foreignLanguagesWebsite.dto;

import com.website.foreignLanguagesWebsite.entity.testentity.Question;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AnswerDto {
    private Long id;
    private String content;
    private boolean isCorrect;
    private Question question;
}
