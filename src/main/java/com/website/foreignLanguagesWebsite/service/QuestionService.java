package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.QuestionDto;

import java.util.List;

public interface QuestionService {
    QuestionDto createQuestion(Long testId, QuestionDto questionDto);
    QuestionDto getQuestionById(Long questionId);
    List<QuestionDto> getAllQuestionsByTestId(Long testId);
    QuestionDto updateQuestion(Long questionId, QuestionDto questionDto);
    void deleteQuestion(Long questionId);
}
