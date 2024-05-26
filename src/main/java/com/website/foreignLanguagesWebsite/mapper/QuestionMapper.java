package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.QuestionDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Question;

import java.util.stream.Collectors;

public class QuestionMapper {
    public static QuestionDto mapToQuestionDto(Question question) {
        return new QuestionDto(
                question.getId(),
                question.getContent(),
                question.getTest(),
                question.getAnswers()
        );
    }

    public static Question mapToQuestion(QuestionDto questionDto) {
        return new Question(
                questionDto.getId(),
                questionDto.getContent(),
                questionDto.getTest(),
                questionDto.getAnswers()
        );
    }
}
