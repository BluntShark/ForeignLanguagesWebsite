package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.AnswerDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Answer;
import com.website.foreignLanguagesWebsite.entity.testentity.Question;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.AnswerMapper;
import com.website.foreignLanguagesWebsite.repository.AnswerRepository;
import com.website.foreignLanguagesWebsite.repository.QuestionRepository;
import com.website.foreignLanguagesWebsite.service.AnswerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AnswerServiceImpl  implements AnswerService {
    private final AnswerRepository answerRepository;
    private final QuestionRepository questionRepository;

    @Override
    public AnswerDto createAnswer(Long questionId, AnswerDto answerDto) {
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new ResourceNotFoundException("Question not found with id: " + questionId));

        Answer answer = AnswerMapper.mapToAnswer(answerDto);
        answer.setQuestion(question);

        return AnswerMapper.mapToAnswerDto(answerRepository.save(answer));
    }

    @Override
    public AnswerDto getAnswerById(Long answerId) {
        Answer answer = answerRepository.findById(answerId)
                .orElseThrow(() -> new ResourceNotFoundException("Answer not found with id: " + answerId));

        return AnswerMapper.mapToAnswerDto(answer);
    }

    @Override
    public List<AnswerDto> getAllAnswersByQuestionId(Long questionId) {
        return answerRepository.findByQuestionId(questionId).stream()
                .map(AnswerMapper::mapToAnswerDto)
                .collect(Collectors.toList());
    }

    @Override
    public AnswerDto updateAnswer(Long answerId, AnswerDto answerDto) {
        Answer answer = answerRepository.findById(answerId)
                .orElseThrow(() -> new ResourceNotFoundException("Answer not found with id: " + answerId));

        answer.setContent(answerDto.getContent());
        answer.setCorrect(answerDto.isCorrect());
        answer.setQuestion(answerDto.getQuestion());

        return AnswerMapper.mapToAnswerDto(answerRepository.save(answer));
    }

    @Override
    public void deleteAnswer(Long answerId) {
        answerRepository.findById(answerId)
                .orElseThrow(() -> new ResourceNotFoundException("Answer not found with id: " + answerId));
        answerRepository.deleteById(answerId);
    }
}
