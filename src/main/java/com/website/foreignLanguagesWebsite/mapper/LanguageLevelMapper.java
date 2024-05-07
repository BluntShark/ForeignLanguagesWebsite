package com.website.foreignLanguagesWebsite.mapper;

import com.website.foreignLanguagesWebsite.dto.LanguageLevelDto;
import com.website.foreignLanguagesWebsite.entity.userentity.LanguageLevel;

public class LanguageLevelMapper {
    public static LanguageLevelDto mapToLanguageLevelDto(LanguageLevel languageLevel){
        return new LanguageLevelDto(
                languageLevel.getId(),
                languageLevel.getTitle(),
                languageLevel.getDescription(),
                languageLevel.getUsers()
        );
    }
    public static LanguageLevel mapToLanguageLevel(LanguageLevelDto languageLevelDto){
        return new LanguageLevel(
                languageLevelDto.getId(),
                languageLevelDto.getTitle(),
                languageLevelDto.getDescription(),
                languageLevelDto.getUsers()
        );
    }
}
