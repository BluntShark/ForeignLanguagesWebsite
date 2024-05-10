package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.AnswerDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Answer;
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
                        new ResourceNotFoundException("Answer is not exists with given id: " + answerId)));
    }

    @Override
    public List<AnswerDto> getAllAnswers() {
        return answerRepository.findAll().stream().map((answer) -> AnswerMapper.mapToAnswerDto(answer)).collect(Collectors.toList());
    }

    @Override
    public AnswerDto updateAnswer(Long answerId, AnswerDto answerDto) {
        Answer answer = answerRepository.findById(answerId).orElseThrow(() ->
                new ResourceNotFoundException("Answer is not exists with given id: " + answerId));

        answer.setAnswer(answerDto.getAnswer());
        answer.setTest(answerDto.getTest());

        return AnswerMapper.mapToAnswerDto(answerRepository.save(answer));
    }

    @Override
    public void deleteAnswer(Long answerId) {
        answerRepository.findById(answerId).orElseThrow(() ->
                new ResourceNotFoundException("Answer is not exists with given id: " + answerId));
        answerRepository.deleteById(answerId);
    }
}
