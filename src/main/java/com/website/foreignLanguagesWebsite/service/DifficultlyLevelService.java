package com.website.foreignLanguagesWebsite.service;

import com.website.foreignLanguagesWebsite.dto.DifficultlyLevelDto;

import java.util.List;

public interface DifficultlyLevelService {
    DifficultlyLevelDto createDifficultlyLevel(DifficultlyLevelDto difficultlyLevelDto);
    DifficultlyLevelDto getDifficultlyLevelById(Long difficultlyLevelId);
    List<DifficultlyLevelDto> getAllDifficultlyLevels();
}
