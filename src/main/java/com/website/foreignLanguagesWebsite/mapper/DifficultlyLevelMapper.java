package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.DifficultlyLevelDto;
import com.website.foreignLanguagesWebsite.entity.reference.DifficultlyLevel;

public class DifficultlyLevelMapper {
    public static DifficultlyLevelDto mapToDifficultlyLevelDto(DifficultlyLevel difficultlyLevel){
        return new DifficultlyLevelDto(
                difficultlyLevel.getId(),
                difficultlyLevel.getLevel(),
                difficultlyLevel.getLessons()
        );
    }
    public static DifficultlyLevel mapToDifficultlyLevel(DifficultlyLevelDto difficultlyLevelDto){
        return new DifficultlyLevel(
                difficultlyLevelDto.getId(),
                difficultlyLevelDto.getLevel(),
                difficultlyLevelDto.getLessons()
        );
    }
}
