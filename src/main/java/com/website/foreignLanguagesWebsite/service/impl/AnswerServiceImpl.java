package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.AnswerDto;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.AnswerMapper;
import com.website.foreignLanguagesWebsite.repository.AnswerRepository;
import com.website.foreignLanguagesWebsite.service.AnswerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AnswerServiceImpl implements AnswerService {
    private AnswerRepository answerRepository;
    @Override
    public AnswerDto createAnswer(AnswerDto answerDto) {
        return AnswerMapper
                .mapToAnswerDto(answerRepository
                        .save(AnswerMapper
                                .mapToAnswer(answerDto)));
    }

    @Override
    public AnswerDto getAnswerById(Long answerId) {
        return AnswerMapper.mapToAnswerDto(answerRepository.findById(answerId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User is not exists with given id: " + answerId)));
    }

    @Override
    public List<AnswerDto> getAllAnswers() {
        return answerRepository.findAll().stream().map((answer) -> AnswerMapper.mapToAnswerDto(answer)).collect(Collectors.toList());
    }
}
