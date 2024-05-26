package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.TestDto;

import java.util.List;

public interface TestService {
    TestDto createTest(TestDto testDto);
    TestDto getTestById(Long testId);
    List<TestDto> getAllTests();
    TestDto updateTest(Long testId, TestDto testDto);
    void deleteTest(Long testId);
}
