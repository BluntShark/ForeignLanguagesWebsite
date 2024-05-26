package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.AnswerDto;

import java.util.List;

public interface AnswerService {
    AnswerDto createAnswer(Long questionId, AnswerDto answerDto);
    AnswerDto getAnswerById(Long answerId);
    List<AnswerDto> getAllAnswersByQuestionId(Long questionId);
    AnswerDto updateAnswer(Long answerId, AnswerDto answerDto);
    void deleteAnswer(Long answerId);
}
