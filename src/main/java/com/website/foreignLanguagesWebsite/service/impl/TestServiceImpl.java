package com.website.foreignLanguagesWebsite.service.impl;

import com.website.foreignLanguagesWebsite.dto.TestDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Test;
import com.website.foreignLanguagesWebsite.exception.ResourceNotFoundException;
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
    private final TestRepository testRepository;

    @Override
    public TestDto createTest(TestDto testDto) {
        return TestMapper.mapToTestDto(testRepository.save(TestMapper.mapToTest(testDto)));
    }

    @Override
    public TestDto getTestById(Long testId) {
        return TestMapper.mapToTestDto(testRepository.findById(testId)
                .orElseThrow(() -> new ResourceNotFoundException("Test not found with id: " + testId)));
    }

    @Override
    public List<TestDto> getAllTests() {
        return testRepository.findAll().stream().map(TestMapper::mapToTestDto).collect(Collectors.toList());
    }

    @Override
    public TestDto updateTest(Long testId, TestDto testDto) {
        Test test = testRepository.findById(testId)
                .orElseThrow(() -> new ResourceNotFoundException("Test not found with id: " + testId));

        test.setName(testDto.getName());

        return TestMapper.mapToTestDto(testRepository.save(test));
    }

    @Override
    public void deleteTest(Long testId) {
        testRepository.findById(testId)
                .orElseThrow(() -> new ResourceNotFoundException("Test not found with id: " + testId));
        testRepository.deleteById(testId);
    }
}
