package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.TestDto;
import com.website.foreignLanguagesWebsite.entity.testentity.Test;

public class TestMapper {
    public static TestDto mapToTestDto(Test test){
        return new TestDto(
                test.getId(),
                test.getQuestion(),
                test.getAnswers(),
                test.getCorrectAnswer(),
                test.getLesson()
        );
    }
    public static Test mapToTest(TestDto testDto){
        return new Test(
                testDto.getId(),
                testDto.getQuestion(),
                testDto.getAnswers(),
                testDto.getCorrectAnswer(),
                testDto.getLesson()
        );
    }
}
