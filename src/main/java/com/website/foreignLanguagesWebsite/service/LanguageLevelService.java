package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.LanguageLevelDto;

import java.util.List;

public interface LanguageLevelService {
    LanguageLevelDto createLanguageLevel(LanguageLevelDto languageLevelDto);
    LanguageLevelDto getLanguageLevelById(Long languageLevelId);
    List<LanguageLevelDto> getAllLanguageLevels();
}
