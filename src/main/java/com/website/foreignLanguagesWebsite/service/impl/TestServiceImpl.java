package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.TestDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Answer;
import com.website.foreignLanguagesWebsite.entity.testentity.Test;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
import com.website.foreignLanguagesWebsite.mapper.AnswerMapper;
import com.website.foreignLanguagesWebsite.mapper.TestMapper;
import com.website.foreignLanguagesWebsite.repository.TestRepository;
import com.website.foreignLanguagesWebsite.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {
    private TestRepository testRepository;
    @Override
    public TestDto createTest(TestDto testDto) {
        return TestMapper
                .mapToTestDto(testRepository
                        .save(TestMapper
                                .mapToTest(testDto)));
    }

    @Override
    public TestDto getTestById(Long testId) {
        return TestMapper.mapToTestDto(testRepository.findById(testId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Test is not exists with given id: " + testId)));
    }

    @Override
    public List<TestDto> getAllTests() {
        return testRepository.findAll().stream().map((test) -> TestMapper.mapToTestDto(test)).collect(Collectors.toList());
    }

    @Override
    public TestDto updateTest(Long testId, TestDto testDto) {
        Test test = testRepository.findById(testId).orElseThrow(() ->
                new ResourceNotFoundException("Test is not exists with given id: " + testId));

        test.setQuestion(testDto.getQuestion());
        test.setAnswers(testDto.getAnswers());
        test.setCorrectAnswer(testDto.getCorrectAnswer());
        test.setLesson(testDto.getLesson());

        return TestMapper.mapToTestDto(testRepository.save(test));
    }

    @Override
    public void deleteTest(Long testId) {
        testRepository.findById(testId).orElseThrow(() ->
                new ResourceNotFoundException("Test is not exists with given id: " + testId));
        testRepository.deleteById(testId);
    }
}
