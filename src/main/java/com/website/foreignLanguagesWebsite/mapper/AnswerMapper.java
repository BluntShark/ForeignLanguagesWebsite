package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.AnswerDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Answer;

public class AnswerMapper {
    public static AnswerDto mapToAnswerDto(Answer answer) {
        AnswerDto answerDto = new AnswerDto();
        answerDto.setId(answer.getId());
        answerDto.setContent(answer.getContent());
        answerDto.setCorrect(answer.isCorrect());
        return answerDto;
    }

    public static Answer mapToAnswer(AnswerDto answerDto) {
        Answer answer = new Answer();
        answer.setId(answerDto.getId());
        answer.setContent(answerDto.getContent());
        answer.setCorrect(answerDto.isCorrect());
        return answer;
    }
}
