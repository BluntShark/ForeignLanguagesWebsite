package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.QuestionDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Question;
import com.website.foreignLanguagesWebsite.entity.testentity.Test;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.QuestionMapper;
import com.website.foreignLanguagesWebsite.repository.QuestionRepository;
import com.website.foreignLanguagesWebsite.repository.TestRepository;
import com.website.foreignLanguagesWebsite.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    private final TestRepository testRepository;

    @Override
    public QuestionDto createQuestion(Long testId, QuestionDto questionDto) {
        Test test = testRepository.findById(testId)
                .orElseThrow(() -> new ResourceNotFoundException("Test not found with id: " + testId));

        Question question = QuestionMapper.mapToQuestion(questionDto);
        question.setTest(test);

        return QuestionMapper.mapToQuestionDto(questionRepository.save(question));
    }

    @Override
    public QuestionDto getQuestionById(Long questionId) {
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new ResourceNotFoundException("Question not found with id: " + questionId));

        return QuestionMapper.mapToQuestionDto(question);
    }

    @Override
    public List<QuestionDto> getAllQuestionsByTestId(Long testId) {
        return questionRepository.findByTestId(testId).stream()
                .map(QuestionMapper::mapToQuestionDto)
                .collect(Collectors.toList());
    }

    @Override
    public QuestionDto updateQuestion(Long questionId, QuestionDto questionDto) {
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new ResourceNotFoundException("Question not found with id: " + questionId));

        question.setContent(questionDto.getContent());
        question.setTest(questionDto.getTest());
        question.setAnswers(questionDto.getAnswers());

        return QuestionMapper.mapToQuestionDto(questionRepository.save(question));
    }

    @Override
    public void deleteQuestion(Long questionId) {
        questionRepository.findById(questionId)
                .orElseThrow(() -> new ResourceNotFoundException("Question not found with id: " + questionId));
        questionRepository.deleteById(questionId);
    }
}
