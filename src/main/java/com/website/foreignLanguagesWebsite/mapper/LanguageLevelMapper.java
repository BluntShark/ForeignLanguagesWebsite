package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.LanguageLevelDto;
import com.website.foreignLanguagesWebsite.entity.reference.LanguageLevel;

public class LanguageLevelMapper {
    public static LanguageLevelDto mapToLanguageLevelDto(LanguageLevel languageLevel){
        return new LanguageLevelDto(
                languageLevel.getId(),
                languageLevel.getTitle(),
                languageLevel.getUsers(),
                languageLevel.getTests()
        );
    }
    public static LanguageLevel mapToLanguageLevel(LanguageLevelDto languageLevelDto){
        return new LanguageLevel(
                languageLevelDto.getId(),
                languageLevelDto.getTitle(),
                languageLevelDto.getUsers(),
                languageLevelDto.getTest()
        );
    }
}
