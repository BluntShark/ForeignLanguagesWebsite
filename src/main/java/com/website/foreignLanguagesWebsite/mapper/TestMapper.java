package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.TestDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Test;

public class TestMapper {
    public static TestDto mapToTestDto(Test test) {
        return new TestDto(
                test.getId(),
                test.getName(),
                test.getLanguageLevel(),
                test.getQuestions()
        );
    }

    public static Test mapToTest(TestDto testDto) {
        return new Test(
                testDto.getId(),
                testDto.getName(),
                testDto.getLanguageLevel(),
                testDto.getQuestions()
        );
    }
}
