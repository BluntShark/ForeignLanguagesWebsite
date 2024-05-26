package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.QuestionDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Question;

import java.util.stream.Collectors;

public class QuestionMapper {
    public static QuestionDto mapToQuestionDto(Question question) {
        QuestionDto questionDto = new QuestionDto();
        questionDto.setId(question.getId());
        questionDto.setContent(question.getContent());
        questionDto.setAnswers(question.getAnswers().stream().map(AnswerMapper::mapToAnswerDto).collect(Collectors.toList()));
        return questionDto;
    }

    public static Question mapToQuestion(QuestionDto questionDto) {
        Question question = new Question();
        question.setId(questionDto.getId());
        question.setContent(questionDto.getContent());
        question.setAnswers(questionDto.getAnswers().stream().map(AnswerMapper::mapToAnswer).collect(Collectors.toList()));
        return question;
    }
}
