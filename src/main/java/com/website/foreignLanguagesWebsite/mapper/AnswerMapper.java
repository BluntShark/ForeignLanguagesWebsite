package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.AnswerDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Answer;

public class AnswerMapper {
    public static AnswerDto mapToAnswerDto(Answer answer){
        return new AnswerDto(
                answer.getId(),
                answer.getAnswer(),
                answer.getTest()
        );
    }
    public static Answer mapToAnswer(AnswerDto answerDto){
        return new Answer(
                answerDto.getId(),
                answerDto.getAnswer(),
                answerDto.getTest()
        );
    }
}
