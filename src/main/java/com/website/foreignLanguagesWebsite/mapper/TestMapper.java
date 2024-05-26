package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.TestDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Test;

import java.util.stream.Collectors;

public class TestMapper {
    public static TestDto mapToTestDto(Test test) {
        TestDto testDto = new TestDto();
        testDto.setId(test.getId());
        testDto.setName(test.getName());
        testDto.setQuestions(test.getQuestions().stream().map(QuestionMapper::mapToQuestionDto).collect(Collectors.toList()));
        return testDto;
    }

    public static Test mapToTest(TestDto testDto) {
        Test test = new Test();
        test.setId(testDto.getId());
        test.setName(testDto.getName());
        test.setQuestions(testDto.getQuestions().stream().map(QuestionMapper::mapToQuestion).collect(Collectors.toList()));
        return test;
    }
}
