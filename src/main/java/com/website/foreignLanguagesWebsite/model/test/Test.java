package com.website.foreignLanguagesWebsite.model.test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Test {
    private Long id;
    private String question;
    private String correctAnswer;
    //private String correctAnswer (id_answer);
    //id_difficultly_level

}
