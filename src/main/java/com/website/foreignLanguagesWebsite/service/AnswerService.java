package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.AnswerDto;

import java.util.List;

public interface AnswerService {
    AnswerDto createAnswer(AnswerDto answerDto);
    AnswerDto getAnswerById(Long answerId);
    List<AnswerDto> getAllAnswers();
    AnswerDto updateAnswer(Long answerId, AnswerDto answerDto);
    void deleteAnswer(Long answerId);
}

